package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");
        List<WebElement> linkler = driver.findElements(By.tagName("a"));

        for (WebElement e : linkler)
        {
            if (e.getText().isEmpty())
            System.out.println("e.getAtturibute ( href ) " + e.getAttribute("href"));
            System.out.println("e.getAtturibute ( title ) " + e.getAttribute("title"));
            System.out.println("e.getAtturibute ( rel ) " + e.getAttribute("rel"));



        }


        BekleVeKapat();
    }
}
