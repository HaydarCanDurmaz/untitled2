package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottonOfThePage extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://p-del.co/");
        MyFunc.Bekle(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfanın Sonuna kadar git

        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0,0)");// en başa giiyor 0 noktasına git

      //   js.executeScript("window.scrollToBy(0,0)");// bulundugu yerden 0 kadar gider






        BekleVeKapat();
    }
}
