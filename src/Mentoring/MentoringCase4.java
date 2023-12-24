package Mentoring;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.KeyEvent;
import java.time.Duration;

public class MentoringCase4 extends BaseDriver {

 /*

    KalanOncekileriKapat();

    Logger logger= Logger.getLogger(""); // output a ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster

    // outputtaki gerekmeyen logları kaldıracağız
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

    ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    //  driver = new FirefoxDriver();
    //   driver = new EdgeDriver();

    //driver.manage().window().maximize(); // Ekranı max yapıyor.

    Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
    // Sadece tüm sayfanın kodlarının bilgisyarınıza inmesi süresiyle ilgili
    // bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.:
    // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
    // eğer 2 sn yüklerse 30 sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
    // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn yüklerse 30 sn. beklemez


    WAİT İÇİN GREKLİ SELENİUM SİTELER

    https://www.selenium.dev/documentation/webdriver/waits/

    https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html

   http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html



    */

    @Test
    public void MentoringTest1() {
     /*    Task 1:
        "<a href=" http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html2" rel="nofollow"><u> http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html"</u></a> sitesine gidiniz.
        Click me to start timer butonun atiklatiniz.
                wait kullanarak Selenium,QTP ve Webdriver yazilari gorulene kadar bekletiniz.
        Webdriver goruluyor mu dogrulugunu kontrol ediniz.

     */
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='timedText()']")));

        driver.findElement(By.cssSelector("button[onclick='timedText()']")).click();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='timedText()']")));

        boolean status = element.isDisplayed();
        if (status)
            System.out.println("Visible");
        else
            System.out.println("not Visible");

        BekleVeKapat();
    }

    /* Task 2:
     https://qatest.twoplugs.com/ sitesine gidiniz.
     What do I need to sign up?  sorusuna tiklatiniz.
             "You need a facebook account or a valid email address to sign up." texti gorulene kadar bekletiniz.
     Text gorunuyor mu dogrulayiniz

     */
    @Test
    public void MentoringTest2() {
        driver.get("https://qatest.twoplugs.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='What do I need to sign up?']")));

        driver.findElement(By.xpath("//span[text()='What do I need to sign up?']")).click();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You need a facebook account or a valid email address to sign up.']")));

        boolean status = element.isDisplayed();
        if (status)
            System.out.println("Visible");
        else
            System.out.println("not Visible");


        BekleVeKapat();
    }

    /*  Task 3:
    https://google.com/  sitesine gidiniz.
    search kismina selenium gonderip Enter'a basiniz.
    Element tiklanabilir olana kadar bekletiniz.
    Sonuclar kismindan ilk sonucun selenium icerdigini kontrol ediniz.

     */

    @Test
    public void MentoringTest3() {
        driver.get("https://google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb")));
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium"+ Keys.ENTER);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")));

        boolean status = element.isDisplayed();
        if (status)
            System.out.println("Visible");
        else
            System.out.println("not Visible");









        BekleVeKapat();
    }
}
