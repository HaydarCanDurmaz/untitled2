package Gun14;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

        WebElement usarname = driver.findElement(By.name("username"));
        usarname.sendKeys("zorbey");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234");

        WebElement subbit = driver.findElement(By.xpath("//button[@type='submit']"));
        subbit.click();

        List<WebElement> hataMesaj = driver.findElements(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        if (hataMesaj.size() > 0) {
            System.out.println("Hata Oluştu");

            TakesScreenshot tS = (TakesScreenshot) driver;
            File hafizadakiHali = tS.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(hafizadakiHali, new File("ekranGörüntüleri\\screenshot.png"));
        }


        MyFunc.Bekle(1);
        BekleVeKapat();
    }
}
