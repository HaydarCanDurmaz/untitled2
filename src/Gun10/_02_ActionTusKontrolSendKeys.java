package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/auto-complete");
        WebElement element = driver.findElement(By.id("autoCompleteMultiple"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("hmet").build();

        MyFunc.Bekle(3);
        aksiyon.perform();




        BekleVeKapat();
    }
}
