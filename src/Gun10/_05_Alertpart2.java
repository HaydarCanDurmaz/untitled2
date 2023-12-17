package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Alertpart2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clik1 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        MyFunc.Bekle(1);
        clik1.click();

        MyFunc.Bekle(1);
        driver.switchTo().alert().dismiss();




        BekleVeKapat();
    }
}
