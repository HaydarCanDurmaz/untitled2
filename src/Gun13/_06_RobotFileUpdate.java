package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;

public class _06_RobotFileUpdate extends BaseDriver {
    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);
        // DEvam edilicek
    }
}
