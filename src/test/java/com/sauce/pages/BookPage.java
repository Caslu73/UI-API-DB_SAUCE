package com.sauce.pages;

import com.sauce.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookPage extends BasePage {




    public WebElement editBook(String book) {
        String xpath = "//td[3][.='" + book + "']/../td/a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement borrowBook(String book) {
        String xpath = "//td[3][.='" + book + "']/../td/a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }



}
