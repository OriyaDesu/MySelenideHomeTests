package naruto;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница раздела "Аниме"
 */
public class AnimePage {
    /**
     * Поле поиска для ввода строки
     */
    private final SelenideElement searchField = $x("//div[@id='search_b']//input[@name='ystext']");

    /**
     * @param name Вводит комментарий и нажимает enter
     *
     * @return Страница Наруто
     */
    public NarutoPage search(String name ){
         searchField.sendKeys(name, Keys.ENTER);
         return new NarutoPage();
    }
}
