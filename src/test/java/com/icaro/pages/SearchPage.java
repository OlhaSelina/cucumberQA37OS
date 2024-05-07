package com.icaro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends  BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='0']")
    WebElement navigationLinkSearch;
    @FindBy(xpath = "//input[@id='city']")
    WebElement inputCity;
    @FindBy(xpath = "//input[@id='dates']")
    WebElement inputDate;
    @FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]")
    WebElement clickStartDate;
    @FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]")
    WebElement clickEndtDate;
    @FindBy(xpath = "//button[contains(text(),'Y’alla!')]")
    WebElement btnYallaSearch;
    @FindBy(xpath = "//div[@class='car-card']")
    WebElement listOfCars;

    public SearchPage clickNavigationLinkSearch() {
        click(navigationLinkSearch);
        return this;
    }

}
