package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWenElement extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("(//div[@class='button-text-with-right-icon'])[9]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element); // elemente kadar kaydır


       // element.click(); // tıklatma özelligini kaybettigi zaman tıklama yapamaz
        js.executeScript("arguments[0].click();", element);   // HTML içinde elemente ulaşır ve tıklatır Kesi sonuç



        MyFunc.Bekle(3);
        BekleVeKapat();
    }
}
