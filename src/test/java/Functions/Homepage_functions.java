package Functions;

import Elements.Homepage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Homepage_functions extends Commonclass
{
   Homepage hp;
    ChromeDriver driver;
    public Homepage_functions(ChromeDriver driver) {
        this.driver = driver;
       this.hp = PageFactory.initElements(driver, Homepage.class);
    }

    public void titl()
    {
        Commonclass.implicitwait();
            String text = driver.getTitle();

            System.out.println("Title is :"+text);
            //driver.navigate().back();
    }

    public void mentors()
    {
       Commonclass.implicitwait();
       // System.out.println("mentor :"+hp.mentor.getText());
       hp.mentor.click();
        driver.navigate().back();
    }

   public void students()
    {
        Commonclass.implicitwait();
        hp.student.click();
        driver.navigate().back();
    }

    public void admin()
    {
        Commonclass.implicitwait();
        hp.adminportal.click();
        driver.navigate().back();
    }

}
