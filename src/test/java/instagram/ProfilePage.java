package instagram;

import com.codeborne.selenide.SelenideElement;
import core.BasePage;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница профиля
 */
public class ProfilePage extends BasePage {

    /**
     * Первый пост
     */
    private final SelenideElement firstPost = $x("//article//a[@href]//div[1]");

    /**
     * Открывает первый пост на странице профиля
     * @return Страница с постом
     */
    public PostPage openFirstPost(){
        waitAndClick(firstPost);
        return new PostPage();
    }

    /**
     * @return Получает текущую ссылку из браузера
     */
    public String getUrl(){
       return WebDriverRunner.url();
    }
}
