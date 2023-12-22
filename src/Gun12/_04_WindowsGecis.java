package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGecis extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev");
        String anaSayfaWindowID = driver.getWindowHandle();
        System.out.println("anasayfaWindowsID"+ anaSayfaWindowID);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();

        Set<String> windowsIDler = driver.getWindowHandles();
        for (String id : windowsIDler)
            System.out.println("id" + id);

        driver.switchTo().window(anaSayfaWindowID);

        MyFunc.Bekle(20);
        BekleVeKapat();
    }
    @Test
    public void Test2(){
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Bekle(2);

        String anaSayfaWindowId = driver.getWindowHandle(); // bulunduğum yani ana sayfanın id si ni aldım

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement e : linkler) {
            // e.click();
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> windowsIdler = driver.getWindowHandles();
        for (String id : windowsIdler)
            System.out.println("id = " + id);

        MyFunc.Bekle(2);
        driver.switchTo().window(anaSayfaWindowId); // ilgili Window (Tab) a geçiş

        BekleVeKapat();



    }
}
