package instagram;

import static com.codeborne.selenide.Selenide.$x;
import core.BasePage;
import com.codeborne.selenide.SelenideElement;

/**
 * Страница сохранения пароля
 */
public class SaveDataPage extends BasePage {
    /**
     * Кнопка "не сейчас"
     */
    private final SelenideElement cancelButton = $x("//button[text()='Не сейчас']");

    /**
     * Нажимает на кнопку "Не сейчас"
     * @return Страница с новостной лентой
     */
    public FeedPage skipSaveData(){
        waitAndClick(cancelButton);
        return new FeedPage();
    }
}
