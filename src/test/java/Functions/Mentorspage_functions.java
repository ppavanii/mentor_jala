package Functions;

import Elements.Homepage;
import Elements.mentorpage;
import Elements.onementorpage;
import Elements.twomentorpage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Mentorspage_functions {

    Homepage hp;
    mentorpage m;
    onementorpage om;
    twomentorpage tm;
    ChromeDriver driver;
    public Mentorspage_functions(ChromeDriver driver) {
        this.driver = driver;
        this.hp = PageFactory.initElements(driver, Homepage.class);
        this.m = PageFactory.initElements(driver,mentorpage.class);
        this.om = PageFactory.initElements(driver,onementorpage.class);
        this.tm = PageFactory.initElements(driver,twomentorpage.class);

    }

    public void home()
    {
         hp.mentor.click();
    }

    public void ment()
    {
        Commonclass.implicitwait();
        m.mentor1.click();
        //System.out.println("mentor 1 :"+m.mentor1.getText());
        System.out.println(om.name.getText());
        System.out.println(om.numberofstudents.getText());
        System.out.println(om.courses.getText());
        System.out.println("Course 1 :"+om.course1.getText());
        System.out.println("Course 2  :"+om.course2.getText());
        driver.navigate().back();
    }

    public void ment2()
    {
        Commonclass.implicitwait();
        m.mentor2.click();
        //System.out.println("mentor 2 :"+m.mentor2.getText());
        System.out.println("---------------------------------");
        System.out.println(tm.name.getText());
        System.out.println(tm.numberofstudents.getText());
        System.out.println(tm.course.getText());
        System.out.println("Course :"+tm.course1.getText());
        driver.navigate().back();
    }

}
