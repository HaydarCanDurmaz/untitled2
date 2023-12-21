package Gun11;
/*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_WaitSoru extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys("selenium" + Keys.ENTER);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")));
        WebElement seleniumClick = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
        seleniumClick.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
        Assert.assertTrue("URL Dogrulamadı ",driver.getCurrentUrl().equals("https://www.selenium.dev/"));




        //  Actions aksiyonlar = new Actions(driver);

       // Action aksiyon = aksiyonlar.moveToElement(search).sendKeys("Selenium").keyDown(Keys.ENTER).build();
       // aksiyon.perform();

        //aksiyonlar.moveToElement(seleniumClick).click().build();
       // aksiyon.perform();



       // search.sendKeys("selenium");

        //WebElement searchClick = driver.findElement(By.id(""));
        //searchClick.click();

        //        WebElement seleniumClick = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
        //seleniumClick.click();

       //         Assert.assertTrue("URL Dogrulamadı ",driver.getCurrentUrl().equals("https://www.selenium.dev/"));

        // TODO:  selenium yazısını göndermeyi ve ENTER a basmasını Actions la yapınıw,

        BekleVeKapat();

    }
}
