package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void TEst (){
        driver.get("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.id("doubleClickBtn"));

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        //aksiyonlar.doubleClick(element).build().perform();

        BekleVeKapat();
    }
}
