package Mentoring;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class MentoringCase5 extends BaseDriver {
    /*   senaryo 1:
       https://demoqa.com/frames  sitesine gidin.
       kac tane iframe oldugunu bulun.

               senaryo 2:
       https://demoqa.com/frames  sitesine gidin.
               "This is a sample page" textini ekrana yazdirin;

       senaryo 3:
       https://demoqa.com/browser-windows sitesine gidiniz.
               new tab a tiklayiniz.
       acilan sayfada "This is a sample page" textini yazdiriniz.

     */
    @Test
    public void Test1() {
        //,senaryo 1:
        //https://demoqa.com/frames  sitesine gidin.
        //kac tane iframe oldugunu bulun.

        driver.get("https://demoqa.com/frames");
        List<WebElement> ifareme1 = driver.findElements(By.tagName("iframe"));
        List<WebElement> ifareme2 = driver.findElements(By.xpath("//iframe"));

        System.out.println(ifareme1.size());

        for (WebElement ifm : ifareme2) {
            System.out.println(ifm.getText());
            BekleVeKapat();
        }
    }


    @Test
    public void TEst2() {
        // senaryo 2:
        // https://demoqa.com/frames  sitesine gidin.
        // "This is a sample page" textini ekrana yazdirin;
        driver.get("https://demoqa.com/frames");

        WebElement iframe = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframe);

        WebElement text = driver.findElement(By.id("(//h1[@id='sampleHeading'])[1]"));
        System.out.println(text.getText());

        BekleVeKapat();

    }

    @Test
    public void Test3() {
        // senaryo 3:
        // https://demoqa.com/browser-windows sitesine gidiniz.
        // new tab a tiklayiniz.
        // acilan sayfada "This is a sample page" textini yazdiriniz
        driver.get("https://demoqa.com/browser-windows");

        WebElement button = driver.findElement(By.id("tabButton"));
        button.click();

        String anasayfaID = driver.getWindowHandle();
        Set<String> browserID = driver.getWindowHandles();

        for (String id : browserID) {
            if (id.equals(anasayfaID)) {
                continue;
            }
            driver.switchTo().window(id);

        }


        BekleVeKapat();

    }
}

