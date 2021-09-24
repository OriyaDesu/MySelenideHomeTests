package instagram;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница с постом
 */
public class PostPage {

    /**
     * Коллекция с комментариями под постом
     */
    private final ElementsCollection comments = $$x("//div[@role='button']//h3//following::span[1]");

    /**
     * Поле для ввода комментария
     */
    private final SelenideElement commentField = $x("//textarea[@placeholder='Добавьте комментарий...']");

    /**
     * Добавляет комментарий и нажимает enter
     * @param comment Комментарий
     */
    public void addComment(String comment){
        commentField.sendKeys(comment, Keys.ENTER);
    }

    /**
     * Получает список с комментариями под постом
     * @return список комментариев
     */
    public List<String> getCommentList(){
        List<String> commentsList = new ArrayList<>();
        comments.forEach(x->commentsList.add(x.getText()));
        return commentsList;
    }
}
