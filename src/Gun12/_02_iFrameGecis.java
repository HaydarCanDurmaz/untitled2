package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_iFrameGecis extends BaseDriver {
    @Test
    public void Test(){
        /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */


        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("TÜRKİYE");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement input2 = driver.findElement(By.id("animals"));
        Select select =new Select(input2);
        select.selectByVisibleText("Avatar");

        BekleVeKapat();
    }
}
