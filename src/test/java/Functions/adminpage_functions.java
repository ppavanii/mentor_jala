package Functions;

import Elements.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class adminpage_functions extends Commonclass {

    Homepage hp;
    adminpage a;
    ChromeDriver driver;
    public adminpage_functions(ChromeDriver driver) {
        this.driver = driver;
        this.hp = PageFactory.initElements(driver, Homepage.class);
        this.a = PageFactory.initElements(driver,adminpage.class);
    }

    public void home()
    {
        hp.adminportal.click();
    }

    public void admi() throws Exception
    {
        a.username.sendKeys(p.getProperty("username"));
        a.password.sendKeys(p.getProperty("password"));
        a.login.click();
       System.out.println("log in page title is :"+a.loginpagetitle.getText());
       driver.navigate().back();
       a.skipcontent.click();
       driver.navigate().back();
       System.out.println("main page :"+driver.getTitle());
    }
}
