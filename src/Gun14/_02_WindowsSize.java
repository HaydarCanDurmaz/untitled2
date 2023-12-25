package Gun14;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import java.awt.*;

public class _02_WindowsSize extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(5);

        Dimension yeniBoyut = new Dimension(516,600);
        driver.manage().window().setSize(yeniBoyut);

        BekleVeKapat();
    }

}
