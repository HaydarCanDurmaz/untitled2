package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        MyFunc.Bekle(2);

        WebElement txtBox = driver.findElement(By.cssSelector("[id='user-message'][type='text']"));
        txtBox.sendKeys("We Are The Best");
        MyFunc.Bekle(2);


        WebElement showmsg = driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        showmsg.click();
        MyFunc.Bekle(2);

        WebElement msg = driver.findElement(By.cssSelector("span[id='display']"));

        if (msg.getText().equals("We Are The Best"))
            System.out.println("test passed");
        else
            System.out.println("test fail");


        BekleVeKapat();
    }
}
