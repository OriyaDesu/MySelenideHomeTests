package naruto;

import org.junit.Assert;
import org.junit.Test;

public class NarutoTest {
    /**
     * Ссылка главной страницы сайта
     */
    private final static String URL = "https://jut.su/";
    /**
     * Убедиться, что на странице шесть элементов
     */
    @Test
    public void checkObjectsCount() {
      MainPage mainPage = new MainPage();
      mainPage.openPage(URL);
      int actual = mainPage.openAnimeTab().search("Наруто").getSeasonsCount();
      Assert.assertEquals(6, actual);
    }
}
