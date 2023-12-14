package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08__07_ActionsDragandDropBY extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Actions aksiyonlar = new Actions(driver);

        WebElement solsurgu= driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Bekle(3);
        Action aksiyon = aksiyonlar.dragAndDropBy(solsurgu,100,0).build();
        aksiyon.perform();


        BekleVeKapat();
    }
}
