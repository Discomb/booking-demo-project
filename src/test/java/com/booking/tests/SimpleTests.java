package com.booking.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTests extends TestBase {

    @Test
    void firstTest() {
        open("");
        $("#onetrust-accept-btn-handler").click();
        $("input[name='ss']").setValue("Тбилиси");
        $$("div[data-testid='autocomplete-result'").findBy(text("Тбилиси")).click();
        $("div[data-testid='searchbox-dates-container']").doubleClick();
        $("span[data-date='2023-11-15']").click();
        $("span[data-date='2023-11-15']").click();
        $("button[type='submit']").click();
        $("div[data-component='arp-header'] h1").shouldHave(text("Тбилиси"));
    }
}
