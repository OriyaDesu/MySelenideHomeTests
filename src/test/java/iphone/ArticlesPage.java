package iphone;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница со статьями
 */
public class ArticlesPage {

    /**
     * Первая статья
     */
    private final SelenideElement firstArticle = $x("//h2//a[1]");

    /**
     * Получает href атрибут первой статьи
     * @return  Возвращает строку с полученной ссылкой
     */
    public String getHref(){
        String href = firstArticle.getAttribute("href");
        return href;
    }
}
