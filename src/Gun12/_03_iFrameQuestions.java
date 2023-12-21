package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_iFrameQuestions extends BaseDriver {
    @Test
    public void Test(){
        /*
   1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 2.elemanını seçiniz.
 */

        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("TÜRKİYE");


        driver.switchTo().frame(0);
        WebElement chechbox = driver.findElement(By.id("a"));
        chechbox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement input2 = driver.findElement(By.id("animals"));
        Select select =new Select(input2);
        select.selectByIndex(2);


        BekleVeKapat();
    }
}
