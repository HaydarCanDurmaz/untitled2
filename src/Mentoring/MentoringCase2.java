package Mentoring;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MentoringCase2 extends BaseDriver {

    //   http://demo.nopcommerce.com/ sitesine gidin
    //   • Log in’ e tıklayın.
    //   • adminTechno@gmail.com email addresini girin
    //• Admin123 password olarak girin.
    //  • Login butonuna tiklayin.
//• Search kısmına “Beats Pill” Girin.
//• Search butonuna tıklayın.
//• Sayfada gözüken urunun Baslığının “Beats Pill” yazısını içerdiğini
    //  doğrulayın.
//• Ürüne Tıklayın.
    //          • ADD TO CART Butonuna tıklayın.
//• Urunun başarılı bir şekilde Sepete eklendiğini doğrulayın.
    @Test
    public void Test() {
        driver.get("http://demo.nopcommerce.com/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("adminTechno1@gmail.com");
        MyFunc.Bekle(1);

        WebElement pasword = driver.findElement(By.id("Password"));
        pasword.sendKeys("Admin123");
        MyFunc.Bekle(1);

        WebElement login1 = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        login1.click();
        MyFunc.Bekle(1);

        WebElement searc = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
        searc.sendKeys("Beats Pill");
        MyFunc.Bekle(1);

        WebElement searcclick = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        searcclick.click();
        MyFunc.Bekle(1);

        WebElement bealspill = driver.findElement(By.xpath("//*[text()='Beats Pill 2.0 Wireless Speaker']"));
        Assert.assertTrue(bealspill.isDisplayed());





        BekleVeKapat();
    }
}
