package naruto;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * Страница Наруто
 */
public class NarutoPage {
    /**
     * Коллекция с карточками сезонов аниме "Наруто"
     */
    private final ElementsCollection narutoSeasons = $$x("//div[@class='all_anime_global']");

    /**
     * Получает количество элементов на странице
     * @return Коллекция с карточками сезонов аниме "Наруто"
     */
    public int getSeasonsCount(){
        return narutoSeasons.size();
    }

}
