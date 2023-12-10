package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        WebElement inputValueEnter=driver.findElement(By.id("inputValEnter"));

        System.out.println("inputValurEnter.getAttribute(class) = " + inputValueEnter.getAttribute("class"));

        System.out.println(" getCssValue(color = ) " + inputValueEnter.getCssValue("color"));
        System.out.println(" getCssValue(font-size = ) " + inputValueEnter.getCssValue("font-size"));
        System.out.println(" getCssValue(background = ) " + inputValueEnter.getCssValue("background"));




        BekleVeKapat();
    }
}
