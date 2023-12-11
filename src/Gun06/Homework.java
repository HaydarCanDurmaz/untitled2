package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework extends BaseDriver {

    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);


    @Test
    public void formTest(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement bsz = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        bsz.click();
        MyFunc.Bekle(1);

        WebElement onlinedsc = driver.findElement(By.cssSelector("[id$='_4588']"));
        onlinedsc.click();
        MyFunc.Bekle(1);


        WebElement online = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        online.click();
        MyFunc.Bekle(1);

        WebElement btnevrday = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        btnevrday.click();
        MyFunc.Bekle(1);

        WebElement goodbtn = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodbtn.click();
        MyFunc.Bekle(1);


        WebElement lastbtn = driver.findElement(By.cssSelector("select[id$='_4588']"));
        lastbtn.click();
        MyFunc.Bekle(1);

        WebElement lastbtn1 = driver.findElement(By.cssSelector("select[id$='_4588'] > :nth-child(4)"));
        lastbtn1.click();
        MyFunc.Bekle(3);





        BekleVeKapat();
    }
}
