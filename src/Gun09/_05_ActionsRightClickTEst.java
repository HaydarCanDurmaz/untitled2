package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsRightClickTEst extends BaseDriver {
    @Test
    public void TEst(){
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).contextClick().build();
        aksiyon.perform();

     //   aksiyonlar.moveToElement(element).contextClick().build().perform();
     //   new  Actions(driver).contextClick(element).build().perform();

        BekleVeKapat();
    }
}
