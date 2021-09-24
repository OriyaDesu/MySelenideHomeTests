package naruto;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import core.BasePage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта
 */
public class MainPage extends BasePage {
    /**
     * Раздел "Аниме"
     */
    private final SelenideElement animeTab = $x("//a[text()='Аниме']");
    /**
     * Ожидает появления раздела "Аниме" и переходит по нему
     * @return Страница раздела "Аниме"
     */
    public AnimePage openAnimeTab(){
        waitAndClick(animeTab);
        return new AnimePage();
    }
    /**
     * Открывает главную страницу сайта
     *
     * @param url Ссылка главной страницы
     */
    public void openPage(String url) {
        Selenide.open(url);
    }
}



