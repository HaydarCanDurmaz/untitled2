package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_Example extends BaseDriver {

    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test() {

        driver.get("https://www.facebook.com/");

       // List<WebElement> coockieAccepst = driver.findElements(By.xpath(""));


        WebElement newAccount = driver.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        newAccount.click();

        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Zorbey");
        MyFunc.Bekle(1);

        WebElement surname = driver.findElement(By.name("lastname"));
        surname.sendKeys("Durmaz");
        MyFunc.Bekle(1);

        MyFunc.Bekle(2);
        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("ReEmail gözüktü = ", reEmail.isDisplayed());

        WebElement phone = driver.findElement(By.name("reg_email__"));
        phone.sendKeys("0546554545");
        MyFunc.Bekle(1);

        Assert.assertTrue(phone.isDisplayed());
        System.out.println(phone.isDisplayed());
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("Zorbey123");
        MyFunc.Bekle(1);

        WebElement webDay=driver.findElement(By.id("day"));
        WebElement webMonth=driver.findElement(By.id("month"));
        WebElement webYear=driver.findElement(By.id("year"));

        Select day=new Select(webDay);
        Select month=new Select(webMonth);
        Select year=new Select(webYear);

        day.selectByVisibleText("21");
        month.selectByValue("3");
        year.selectByVisibleText("1975");



        MyFunc.Bekle(1);







        BekleVeKapat();
    }
}
