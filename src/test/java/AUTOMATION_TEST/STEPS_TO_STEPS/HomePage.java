package AUTOMATION_TEST.STEPS_TO_STEPS;

import AUTOMATION_TEST.Locators.Locators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private Locators locator = new Locators();


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
           }

      public void Home_Page() throws InterruptedException {
          JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 40);

          WebElement DestelloProduct = wait.until(ExpectedConditions.elementToBeClickable(locator.Destellos));
          DestelloProduct.click();

          WebElement Date = wait.until(ExpectedConditions.elementToBeClickable(locator.TomorrowsDate));
          Date.click();

          WebElement Time = wait.until(ExpectedConditions.elementToBeClickable(locator.Time));
          Time.click();

          WebElement Color = wait.until(ExpectedConditions.elementToBeClickable(locator.Colors));
          Color.click();

          Thread.sleep(5000);

          js.executeScript("arguments[0].scrollIntoView();", locator.DescripcionText);

          WebElement Cantidad = wait.until(ExpectedConditions.elementToBeClickable(locator.Amount));
          Cantidad.clear();
          Cantidad.sendKeys("2");


              }
          }


