package instagram;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InstagramTest extends BaseTest {

    /**
     * Главна страница сайта
     */
    private final static String URL = "https://www.instagram.com/";

    /**
     * Ссылка профиля
     */
    private final static String MY_PROFILE_URL ="https://www.instagram.com/seleniumkruta/";

    /**
     * Логин
     */
    private final static String LOGIN = "seleniumkruta";

    /**
     * Пароль
     */
    private final static String PASS = "krutaselenium";

    /**
     * Открывает главную страницу и авторизовывается
     * Проверяет, что открыт указанный профиль
     * Добавляет новый комментарий под первым постом в профиле
     * Проверяет, что комментарий добавился
     */
    @Test
    public void checkMyProfile(){
        InstagramLoginPage instagramLoginPage = new InstagramLoginPage();
        String myProfile = instagramLoginPage.auth(URL, LOGIN, PASS).skipSaveData().skipNotification().openAccount().getUrl();
        Assert.assertEquals(MY_PROFILE_URL, myProfile);
        PostPage postPage = new ProfilePage().openFirstPost();
        List<String> actualCommentsList = postPage.getCommentList();
        postPage.addComment("Кто прочитал, тот в автотестах");
        List<String> newCommentsList = postPage.getCommentList();
        Assert.assertNotEquals(actualCommentsList, newCommentsList);
    }
}