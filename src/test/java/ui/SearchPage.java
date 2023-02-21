package ui;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {

    private final ElementsCollection collections = $$x("//h2[@class='entry-title']/a");

    public String getFirstArticle() {
        return collections.first().getAttribute("href");
    }
}
