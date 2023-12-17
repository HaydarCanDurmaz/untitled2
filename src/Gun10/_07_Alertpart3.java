package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Alertpart3 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clik1 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(1);
        clik1.click();

        MyFunc.Bekle(1);
        driver.switchTo().alert().sendKeys("Zorbey");
        driver.switchTo().alert().accept();

        WebElement txtActual = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("beklenen yazı gözüktümü ", txtActual.getText().contains("Zorbey"));


        BekleVeKapat();
    }
}
