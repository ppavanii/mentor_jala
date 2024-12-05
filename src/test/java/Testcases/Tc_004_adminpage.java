package Testcases;

import Functions.Commonclass;
import Functions.adminpage_functions;
import Functions.studentspage_functions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tc_004_adminpage extends Basicsetup{
    adminpage_functions af;

    @BeforeClass
    public void setUp() throws Exception {
        // Initialize driver and pass it to Homepage_functions
        af = new adminpage_functions(Commonclass.driver);
    }

    @Test
    public void adminportal() throws Exception
    {
        af.home();
        af.admi();
    }

}
