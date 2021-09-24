package iphone;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта
 */
public class MainPage {

    /**
     * Окно поиска на главной странице сайта
     */
    private final SelenideElement searchField = $x("//input");

    /**
     * Нажимает кнопку поиска
     * Вводится текст и нажимается "enter"
     * @return Страница со статьями
     */
    public ArticlesPage search(String name){
        searchField.sendKeys(name, Keys.ENTER);
        return new ArticlesPage();
    }

    /**
     * Открывает главную страницу сайта
     * @param url Ссылка на главную страницу сайта
     */
    public void openPage(String url){
        Selenide.open(url);
    }
}
