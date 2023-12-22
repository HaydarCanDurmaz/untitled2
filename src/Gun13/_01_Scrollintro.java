package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_Scrollintro extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://p-del.co/");
        MyFunc.Bekle(3);

       // Actions aksiyonlar = new Actions(driver); // driver üzerinden Aksiyon işlemleri için
       // Select webSelect = new Select(element);  // bir tane element içim


        // JavaScript komutları çalıştırmak için önce js degişkeni tanımlandı
        JavascriptExecutor js = (JavascriptExecutor) driver;// cast yapıldı

        js.executeScript("window.scrollBy(0,3000)");
        // (0,1500) - > ( x,y ) sayfayı saga x kadar ve asagı y kadar kaydırır
        // 1500 pixel kadar aşagı kaydıracak

        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-3000)");



        BekleVeKapat();
    }
}
