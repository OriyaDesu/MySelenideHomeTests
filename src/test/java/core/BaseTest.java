package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Базовый класс работы с Selenide
 */
public abstract class BaseTest {

    /**
     * Действия перед запуском каждого теста
     */
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1336x768";
        Configuration.timeout = Duration.of(20, ChronoUnit.SECONDS).toMillis();
    }

    /**
     * Выходит из браузера
     */
    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }


}