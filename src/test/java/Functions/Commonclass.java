package Functions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Commonclass {
  public static ChromeDriver driver;
   static Properties p;

public static ChromeDriver openbrowser() throws Exception
{
            driver = new ChromeDriver();

    FileReader file = new FileReader("./src/test/Data_file");

    p = new Properties();
    p.load(file);
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

    driver.get(p.getProperty("app_url"));
    driver.manage().window().maximize();

    return driver;
}

public static void closebrowser(){
    driver.quit();
}

public  static void implicitwait()
{
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public static void ss() throws Exception
{
    TakesScreenshot ts = (TakesScreenshot) driver;
   File file = ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file,new File("./ss.jpeg"));

}
}
