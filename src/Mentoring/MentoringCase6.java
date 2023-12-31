package Mentoring;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MentoringCase6 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement login = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        login.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("[name='password'"));
        password.sendKeys("admin123");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        MyFunc.Bekle(3);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


        js.executeScript("window.scrollTo(0,0)");

        MyFunc.Bekle(3);

    BekleVeKapat();
    }
    @Test
    public void Test2(){
        driver.get("https://www.lambdatest.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement element = driver.findElement(By.xpath("//div[@class='w-5/12 smtablet:w-full']//h2"));

        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BekleVeKapat();
    }
    @Test
    public void Test3() {
        driver.get("https://www.lambdatest.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,3000);");
        BekleVeKapat();

    }
    @Test
    public void Test4() {
        driver.get("https://www.album.alexflueras.ro/index.php");// Sitede problem var , There is a problem from website, it will be fixs

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(6000,0);");

        MyFunc.Bekle(3);

        js.executeScript("window.scrollBy(-3000,0);");

        BekleVeKapat();


    }
    @Test
    public void Test5() {
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='jscroll-added']"));

        for (WebElement e: elements)
            // devam edilecek


        BekleVeKapat();
    }
}

