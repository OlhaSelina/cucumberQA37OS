package com.icaro.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) { // в рабочем проекте эти настройки прописываются отдельно в конфигурационном файле
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void init(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void  tearDown(){
        driver.quit();
    }
    public void navigateToMainPage() {
        driver.get("https://ilcarro.web.app");
    }
    public void click(WebElement element){
        element.click();
    }
    public void type(WebElement element, String text){
        click(element);
        element.clear();
        element.sendKeys(text);
    }
    public boolean isElementDisplaed(WebElement element){
        return element.isDisplayed();
    }
}
