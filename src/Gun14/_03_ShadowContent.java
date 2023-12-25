package Gun14;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class _03_ShadowContent extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement shadowWebParent = driver.findElement(By.cssSelector("[class='efilli-layout-tuttur']"));
        MyFunc.Bekle(2);
        SearchContext shadowContent = shadowWebParent.getShadowRoot(); // shadow u aldım
        // içeriği aynı HTML, şimdi onun içinde findElement yapalım
        MyFunc.Bekle(2);
        WebElement kabulBtn = shadowContent.findElement(By.cssSelector("div+div > div+div"));
        System.out.println("kabulBtn.getText() = " + kabulBtn.getText());
        MyFunc.Bekle(2);
        kabulBtn.click();


        BekleVeKapat();
    }
}
