package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NoDashboardPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");
    private SelenideElement headingLower = $("[class=heading heading_size_xl heading_theme_alfa-on-white]");
    private SelenideElement actionButton = $("[data-test-id=action-reload] button");

    public NoDashboardPage() {
        heading.shouldBe(visible);
    }

}
