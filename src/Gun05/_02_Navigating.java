package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement element=driver.findElement(By.id("alerttest"));
       // WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));

        element.click();
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        MyFunc.Bekle(3);

        BekleVeKapat();

    }
}
