package ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest {

    private static final String BASE_URL = "https://appleinsider.ru";
    private static final String SEARCH_TEXT = "\u0427\u0435\u043C iPhone 13 \u043E\u0442\u043B\u0438\u0447\u0430\u0435\u0442\u0441\u044F \u043E\u0442 iPhone 12";

    private MainPage mainPage = new MainPage();

    @Test
    public void checkHref() {
        mainPage.openMainPage(BASE_URL);
        mainPage.fillSearchField(SEARCH_TEXT);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getFirstArticle();

        Assertions.assertTrue(href.contains("iphone-13"));
    }
}
