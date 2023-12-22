package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {
    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev");
        String anaSayfaWindowID = driver.getWindowHandle();
        System.out.println("anasayfaWindowsID" + anaSayfaWindowID);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();

        Set<String> windowsIdler = driver.getWindowHandles();
        for (String id : windowsIdler
        ) {


            driver.switchTo().window(id);
            System.out.println("title" + driver.getTitle() + "URL" + driver.getCurrentUrl());
            driver.close();

        }
        for (String id : windowsIdler
        ) {
            if (id.equals(anaSayfaWindowID))
                continue;

            driver.switchTo().window(id);
            driver.close();

        }


        BekleVeKapat();
    }

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Bekle(2);

        String anaSayfaWindowId = driver.getWindowHandle(); // ana sayfanın id sini aldım, diğerleri açılmadan

        //_blank olan bütün a taglerini aldım
        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        //yeni tabda sayfa açıcak linklere tıklattım
        for (WebElement e : linkler) {
            js.executeScript("arguments[0].click();", e);
        }

        // açılan bütün yeni tablardaki window ların ID lerini aldım.
        Set<String> windowsIdler = driver.getWindowHandles();

        // her tab a geçiliyor ve title ve url si, yazdırılıyor
        for (String id : windowsIdler) {
            MyFunc.Bekle(2);
            driver.switchTo().window(id);
            System.out.println("title=" + driver.getTitle() + ", url=" + driver.getCurrentUrl());
        }

        for (String id : windowsIdler) {
            if (id.equals(anaSayfaWindowId)) continue;  // ana sayfanın id si gelirse pas geç
            driver.switchTo().window(id);
            driver.close();
        }

        BekleVeKapat();
    }


}


