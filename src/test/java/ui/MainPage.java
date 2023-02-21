package ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    SelenideElement searchField = $x("//input[@type='text']");

    public void openMainPage(String url) {
        Selenide.open(url);
    }

    public void fillSearchField(String text) {
        searchField.setValue(text);
        searchField.sendKeys(Keys.ENTER);

    }
}
