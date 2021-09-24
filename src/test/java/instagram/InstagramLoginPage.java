package instagram;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

/**
 * Страница авторизации
 */
public class InstagramLoginPage {
    /**
     * Поле с логином
     */
    private final SelenideElement loginInput = $x("//input[@name='username']");
    /**
     * Поле с паролем
     */
    private final SelenideElement passInput = $x("//input[@name='password']");
    /**
     * Открывает Главную страницу сайта
     * @param url Ссылка на главную страницу сайта
     * @param login Логин пользователя
     * @param pass Пароль пользователя
     * @return Страница сохранения пароля
     */
    public SaveDataPage auth(String url, String login, String pass){
        open(url);
        loginInput.sendKeys(login);
        passInput.sendKeys(pass, Keys.ENTER);
        return new SaveDataPage();
    }
}
