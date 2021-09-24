package iphone;

import org.junit.Assert;
import org.junit.Test;

public class IphoneTest {
    /**
     * Ссылка на главную страницу сайта
     */
    private final static String URL = "https://appleinsider.ru/";
    /**
     * Текст в поле поиска
     */
    private final static String SEARCH_STRING = "Чем iphone 13 отличается от iphone 12";
    /**
     * Происходит поиск статьи с определенным названием
     * Проверяется, что iphone-13 содержится в ссылке у статьи
     * Проверяется, что iphone-12 содержится в ссылке у статьи
     */
    @Test
    public void checkAttributes(){
        MainPage mainPage = new MainPage();
        mainPage.openPage(URL);
        ArticlesPage articlesPage = mainPage.search(SEARCH_STRING);
        String articleHref = articlesPage.getHref();
        Assert.assertTrue(articleHref.contains("iphone-13"));
        Assert.assertTrue(articleHref.contains("iphone-12"));
    }
}