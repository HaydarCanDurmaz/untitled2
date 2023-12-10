package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector2 extends BaseDriver {
    @Test
    public  void Test1() {


        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        MyFunc.Bekle(2);

        String mesajim = "We Are The Best";
        WebElement txtBox = driver.findElement(By.cssSelector("[id='user-message'][type='text']"));
        txtBox.sendKeys(mesajim);
        MyFunc.Bekle(2);


        WebElement showmsg = driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        showmsg.click();
        MyFunc.Bekle(2);

        WebElement msg = driver.findElement(By.cssSelector("span[id='display']"));

        //   if (msg.getText().equals("We Are The Best"))
        //       System.out.println("test passed");
        //   else
        //       System.out.println("test fail");

        Assert.assertTrue(msg.getText().equals(mesajim));


        BekleVeKapat();
    }
}
