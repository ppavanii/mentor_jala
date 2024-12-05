package Functions;

import Elements.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class studentspage_functions {
     Homepage hp;
     ChromeDriver driver;
     studentspage sp;
     studentpage s;
    public studentspage_functions(ChromeDriver driver) {
        this.driver = driver; // Set the driver inherited from Commonclass
        this.hp = PageFactory.initElements(driver, Homepage.class);
        this.sp = PageFactory.initElements(driver, studentspage.class);
        this.s = PageFactory.initElements(driver, studentpage.class);
        // System.out.println("Mentor initialized: " + (hp.mentor != null));
    }

    public void home()
    {
        hp.student.click();
    }

    public void stu1()
    {
        Commonclass.implicitwait();
        sp.student1.click();
        System.out.println(s.s1name.getText());
        System.out.println(s.s1course.getText());
        System.out.println(s.s1mentor.getText());
        driver.navigate().back();
    }

    public void stu2()
    {
        Commonclass.implicitwait();
        sp.student2.click();
        System.out.println("---------------------------------");
        System.out.println(s.s2name.getText());
        System.out.println(s.s2course.getText());
        System.out.println(s.s2mentor.getText());
        driver.navigate().back();
    }

    public void stu3()
    {
        Commonclass.implicitwait();
        sp.student3.click();
        System.out.println("---------------------------------");
        System.out.println(s.s3name.getText());
        System.out.println(s.s3course.getText());
        System.out.println(s.s3mentor.getText());
        driver.navigate().back();
    }

    public void stu4()
    {
        Commonclass.implicitwait();
        sp.student4.click();
        System.out.println("---------------------------------");
        System.out.println(s.s4name.getText());
        System.out.println(s.s4course.getText());
        System.out.println(s.s4mentor.getText());
        driver.navigate().back();
    }

}
