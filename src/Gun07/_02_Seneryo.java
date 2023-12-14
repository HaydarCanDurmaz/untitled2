package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Seneryo extends BaseDriver {

    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.


    @Test
    public void Test(){
        driver.get("https://www.saucedemo.com/");

       // String total="49.66";
        MyFunc.Bekle(1);

        WebElement mail = driver.findElement(By.xpath("//input[@id='user-name']"));
        mail.sendKeys("standard_user");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement Bags1 = driver.findElement(By.xpath("(//img[@class='inventory_item_img'])[1]"));
        Bags1.click();
        MyFunc.Bekle(1);

        WebElement Bagsadd = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        Bagsadd.click();
        MyFunc.Bekle(1);

        driver.navigate().back();

        WebElement Tshrt = driver.findElement(By.xpath("(//img[@class='inventory_item_img'])[3]"));
        Tshrt.click();
        MyFunc.Bekle(1);

        WebElement Tshrtadd = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        Tshrtadd.click();
        MyFunc.Bekle(1);


        WebElement sepet = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        sepet.click();
        MyFunc.Bekle(1);

        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.Bekle(1);

        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("haydarcan");
        MyFunc.Bekle(1);

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("durmaz");
        MyFunc.Bekle(1);

        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("34034");
        MyFunc.Bekle(1);

        WebElement contine = driver.findElement(By.xpath("//input[@id='continue']"));
        contine.click();
        MyFunc.Bekle(1);

        //WebElement totaltplm= driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']"));
        //Assert.assertTrue(totaltplm.getText().equals(total));








        BekleVeKapat();
    }
}
