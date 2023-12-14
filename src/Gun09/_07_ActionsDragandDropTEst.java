package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionsDragandDropTEst extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar = new Actions(driver);

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        // 1 yöntem
        //aksiyonlar.dragAndDrop(oslo,norway).build().perform();

        // 2 Yöntem
        aksiyonlar.clickAndHold(oslo).build().perform();
        aksiyonlar.moveToElement(norway).release().build().perform();


        BekleVeKapat();
    }
}
