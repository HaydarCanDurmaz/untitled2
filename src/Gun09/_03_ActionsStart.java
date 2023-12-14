package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsStart extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon  = aksiyonlar.moveToElement(element).click().build();

        System.out.println( "aksiyon hazırlan dı");

        MyFunc.Bekle(4);
        aksiyon.perform(); // aksiyon gerçekleşiyor. işleme al, uygula.
        System.out.println("aksiyon gerçekleşti");

        // kısa hali.
        //aksiyonlar.moveToElement(element).click().build().perform();


        BekleVeKapat();
    }
}
