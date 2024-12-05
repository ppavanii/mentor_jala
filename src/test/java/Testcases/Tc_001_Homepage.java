package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Functions.Homepage_functions;
import Functions.Commonclass;




public class Tc_001_Homepage extends Basicsetup {

    Homepage_functions hf ;
        //= new Homepage_functions(Commonclass.driver);

    @BeforeClass
    public void setUp() throws Exception {
        // Initialize driver and pass it to Homepage_functions
       // driver = openbrowser();
        hf = new Homepage_functions(Commonclass.driver);
    }

     @Test(priority=1)
   public void Tctitle()
    {
   hf.titl();
    }

    @Test(priority=2)
    public void Tcmentor()
    {
    hf.mentors();
    }

    @Test(priority=3)
    public void Tcstudentr()
    {
        hf.students();
    }

    @Test(priority=4)
    public void Tcadmin()
    {
        hf.admin();
    }
}
