package core;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

/**
 * Общие методы для работы с элементами на странице
 */
public abstract class BasePage {

    /**
     * Ожидает видимости элемента и нажимает на него
     */
    public void waitAndClick(SelenideElement element){
        element.shouldBe(enabled, visible).click();
    }


}
