package Mentoring;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MentoringCase3 extends BaseDriver {
   // 1. Perform Click Action on the Web Element
   // Test Scenario:
   // Browserstack home page sayfasina gidin ve Get Started Free butonuna tiklayin
    @Test
    public void Case1(){

        driver.get("https://www.browserstack.com/");
        Actions aksiyonlar = new Actions(driver);
        WebElement getStartedFree = driver.findElement(By.linkText("Get started free"));
        aksiyonlar.moveToElement(getStartedFree).click().build().perform();

    }
    @Test
    public void Case2(){
       // 2. Perform Mouse Hover Action on the Web Element
       // Test Scenario:
       //  Mouse ile Live Tab uzerinde Hover yapin ve App Automate 'e  Click yapin.

        driver.get("https://www.browserstack.com/");
        Actions aksiyonlar = new Actions(driver);
        WebElement live = driver.findElement(By.xpath("(//h4[@class='product-section__content-title'])[1]"));
        aksiyonlar.moveToElement(live).build().perform();

        WebElement automate = driver.findElement(By.xpath("(//span[@class='product-section__content-desc'])[2]"));
        aksiyonlar.moveToElement(automate).click().build().perform();


    }
    @Test
    public void Case3(){
      //  3. Perform Double Click Action on the Web Element
      //  Test Scenario:
      //  Free Trial butonunun ustune double click yapin.

        driver.get("https://www.browserstack.com/");
        Actions aksiyonlar = new Actions(driver);
        WebElement FreeTrial = driver.findElement(By.cssSelector("a[title='Free Trial']"));
        aksiyonlar.doubleClick(FreeTrial).build().perform();


    }
    @Test
    public void Case4(){
       // 4.Drag and Drop
       // https://www.globalsqa.com/demo-site/draganddrop/ sitesine gidiniz.
       // resimleri yandaki alana goturup birakiniz.
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(iframe);

        List<WebElement> images  = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));


        WebElement trach = driver.findElement(By.xpath("//div[@id='trash']"));
        for (WebElement image : images){
            Actions drogAndHold = new Actions(driver);
            drogAndHold.dragAndDrop(image,trach).build().perform();
            MyFunc.Bekle(3);

        }

    }

}
