package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsHoverTestSoru extends BaseDriver {
    //     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.
    @Test
    public void Test(){
        driver.get("https://www.etsy.com/");


        WebElement catagories = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
        WebElement Jewellery = driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/nav/div/div/a[12]"));
      //  WebElement Neckless = driver.findElement(By.id(""));
      //  WebElement bibNeckless = driver.findElement(By.id(""));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(catagories).click().build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(Jewellery).click().build().perform();
        MyFunc.Bekle(2);



       BekleVeKapat();
    }
}
