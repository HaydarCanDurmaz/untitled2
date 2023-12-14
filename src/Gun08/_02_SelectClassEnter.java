package Gun08;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassEnter extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(webMenu);
        //ddMenu.selectByIndex(4);
        //ddMenu.selectByValue("search-alias=electronics");
        ddMenu.selectByVisibleText("Elektronik");

        System.out.println("ddMenu.getOptions().size() = "+ddMenu.getOptions().size());


        BekleVeKapat();
    }
}
