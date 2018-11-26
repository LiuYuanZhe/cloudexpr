import com.cun.register.utils.SpiderVariable;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

/**
 * Created by LiuYuanZhe on 18/11/7.
 */
public class DriverTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(SpiderVariable.CHROME_DRIVER, SpiderVariable.CHROMEDRIVER_PATH);
        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("http://www.baidu.com");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Thread.sleep(2000);
            //复制内容到指定文件中
            String path = SpiderVariable.SCREENSHOT_PATH+getRandom()+".png";
            FileUtils.copyFile(scrFile, new File(path));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    public static String getRandom(){
        return String.valueOf((int)(Math.random()*100000));
    }
}
