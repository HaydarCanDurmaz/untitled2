package Mentoring;

import Utlity.BaseDriver;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MentoringCase extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://demo.nopcommerce.com/");

        WebElement register = driver.findElement(By.cssSelector("a[class='ico-register']"));
        register.click();
        MyFunc.Bekle(1);

        WebElement gender = driver.findElement(By.cssSelector("[id='gender-male']"));
        gender.click();
        MyFunc.Bekle(1);

        WebElement firstname = driver.findElement(By.cssSelector("[id='FirstName']"));
        firstname.sendKeys("Zorbey ");
        MyFunc.Bekle(1);

        WebElement lastname = driver.findElement(By.cssSelector("[id='LastName']"));
        lastname.sendKeys("DURMAZ ");
        MyFunc.Bekle(1);

        WebElement days = driver.findElement(By.cssSelector("[value='18']"));
        days.click();
        MyFunc.Bekle(1);

        WebElement mount = driver.findElement(By.cssSelector("[value='6']"));
        mount.click();
        MyFunc.Bekle(1);

        WebElement years = driver.findElement(By.cssSelector("[value='1995']"));
        years.click();
        MyFunc.Bekle(1);

        WebElement mail = driver.findElement(By.cssSelector("[id='Email']"));
        mail.sendKeys("zorbey@gmail.com ");
        MyFunc.Bekle(1);

        WebElement companyname = driver.findElement(By.cssSelector("[id='Company']"));
        companyname.sendKeys("DURMAZ-STUDY ");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("DURMAZ-STUDY1 ");
        MyFunc.Bekle(1);

        WebElement psd = driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        psd.sendKeys("DURMAZ-STUDY1 ");
        MyFunc.Bekle(1);

        WebElement regisstr = driver.findElement(By.cssSelector("[id='register-button']"));
        regisstr.click();
        MyFunc.Bekle(1);

        WebElement continie = driver.findElement(By.cssSelector("[class='button-1 register-continue-button']"));
        continie.click();
        MyFunc.Bekle(1);

        WebElement login = driver.findElement(By.cssSelector("[class='ico-login']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement email1 = driver.findElement(By.cssSelector("[id='Email']"));
        email1.sendKeys("zorbey@gmail.com ");
        MyFunc.Bekle(1);

        WebElement pssd = driver.findElement(By.cssSelector("[id='Password']"));
        pssd.sendKeys("DURMAZ-STUDY1 ");
        MyFunc.Bekle(1);

        WebElement login1 = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        login1.click();
        MyFunc.Bekle(1);











        BekleVeKapat();

    }


}

