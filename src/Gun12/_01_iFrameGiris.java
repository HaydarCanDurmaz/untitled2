package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_iFrameGiris extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        long StartTime =System.currentTimeMillis();
        driver.switchTo().frame("frame1");

        //driver.switchTo().frame(0);  //24 index vererek geçilebilir : index sayfadaki sırası
        //driver.switchTo().frame("frame1"); //20112 id vererek geçebilirsiniz, ancak yavaş
        //driver.switchTo().frame("iamframe"); //163 name vererek de geçilebilir, ancak hızlı


        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Şampiyon GalataSaray");// 71 weblement olarakda verebilirsin, ancak hızlı
        // index>webelement>name>id   selenium un versiyonuna göre değişir

        long endTime = System.currentTimeMillis();
        System.out.println("Süre"+(endTime-StartTime));

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki sayfaya geç, bi geri,
        driver.switchTo().defaultContent(); // direk en dış sayafa gider


        BekleVeKapat();
    }
}
