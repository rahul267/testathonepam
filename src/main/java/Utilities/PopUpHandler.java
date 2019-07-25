package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class PopUpHandler {
    private static WebDriver driver;
   // private WebElement element;

    public static void testJQueryAlertHandling() {

        WebDriverWait jQueryWait = new WebDriverWait(driver, 2);
        try{
            jQueryWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='popup add-page-popup']")));
            WebElement popup = driver.findElement(By.id("popup_container"));
            WebElement message = popup.findElement(By.id("popup_message"));
            assertEquals("Alert Message", message.getText());
            popup.findElement(By.id("popup_ok")).click();
            System.out.println("Alert  Present");
        }
        catch (Exception e){
            System.out.println("No alert  Present");
        }
    }
}
