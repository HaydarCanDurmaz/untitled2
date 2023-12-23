package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _05_RobotClass2 extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://www.google.com/");
        MyFunc.Bekle(2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        MyFunc.Bekle(2);

        Set<String> windowsIDler = driver.getWindowHandles();
        Iterator Gosterge = windowsIDler.iterator();
        String firstSekme = Gosterge.next().toString();
        String secondSekme = Gosterge.next().toString();

        System.out.println("first sekme"+firstSekme);
        System.out.println("second sekme"+secondSekme);

        MyFunc.Bekle(2);
        driver.switchTo().window(firstSekme);
        driver.get("https://www.youtube.com/");

        MyFunc.Bekle(2);
        driver.switchTo().window(secondSekme);
        driver.get("https://www.facebook.com/");





        BekleVeKapat();
    }
}
