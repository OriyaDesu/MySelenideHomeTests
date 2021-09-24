package instagram;

import com.codeborne.selenide.SelenideElement;
import core.BasePage;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница новостной ленты
 */
public class FeedPage extends BasePage {

    /**
     * Фото профиля
     */
    private final SelenideElement account = $x("//img[@alt='Фото профиля seleniumkruta'][1]");

    /**
     * Кнопка "Не сейчас"
     */
    private final SelenideElement skipButton = $x("//button[text()='Не сейчас']");

    /**
     * Переходит на страницу авторизованного профиля через фото профиля
     * @return Страница профиля
     */
    public ProfilePage openAccount() {
        waitAndClick(account);
        return new ProfilePage();
    }

    /**
     * Ожидает появления элемента и нажимает на него
     * @return Эта страница
     */
    public FeedPage skipNotification(){
        waitAndClick(skipButton);
        return this;
    }
}