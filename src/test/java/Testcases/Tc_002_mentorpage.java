package Testcases;

import Functions.Commonclass;
import Functions.Homepage_functions;
import Functions.Mentorspage_functions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tc_002_mentorpage extends Basicsetup {

    Mentorspage_functions mf;

    @BeforeClass
    public void setUp() throws Exception {
        // Initialize driver and pass it to Homepage_functions
        mf = new Mentorspage_functions(Commonclass.driver);
    }

    @Test
    public void mentorone()
    {
        mf.home();
        mf.ment();
        mf.ment2();
    }
}
