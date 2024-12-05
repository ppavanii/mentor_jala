package Testcases;

import Functions.Commonclass;
import Functions.studentspage_functions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tc_003_studentspage extends Basicsetup {
    studentspage_functions sf;

    @BeforeClass
    public void setUp() throws Exception {
        // Initialize driver and pass it to Homepage_functions
        sf = new studentspage_functions(Commonclass.driver);
    }

    @Test
    public void allstu()
    {
        sf.home();
        sf.stu1();
        sf.stu2();
        sf.stu3();
        sf.stu4();
    }
}
