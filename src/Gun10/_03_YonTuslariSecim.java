package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {
    @Test
            public void Test() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement tvtBox = driver.findElement(By.id("autoCompleteSingle"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(tvtBox).click().sendKeys("b").build();
        aksiyon.perform();

        MyFunc.Bekle(2);

        aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();


        BekleVeKapat();
    }
}
