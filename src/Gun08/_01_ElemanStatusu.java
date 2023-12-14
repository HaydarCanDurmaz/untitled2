package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemanStatusu extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        //Tuesday
        WebElement sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println("sali.isDisplayed"+sali.isDisplayed());
        System.out.println("sali.isEnabled"+sali.isEnabled());
        System.out.println("sali.isSelected"+sali.isSelected());

        sali.click();
        MyFunc.Bekle(2);
        System.out.println("sali.isSelected"+sali.isSelected());

        //Monday
        WebElement Monday= driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        System.out.println("Monday.isDisplayed"+Monday.isDisplayed());
        System.out.println("Monday.isEnabled"+Monday.isEnabled());
        System.out.println("Monday.isSelected"+Monday.isSelected());

        Monday.click();
        MyFunc.Bekle(2);
        System.out.println("saturday.isSelected"+Monday.isSelected());




        BekleVeKapat();
    }
}
