package Testcases;

import Functions.Commonclass;
import org.testng.annotations.*;


public class Basicsetup {
    Commonclass cc ;
  // public ChromeDriver driver;
    @BeforeClass
   public void open() throws Exception
    {
        cc = new Commonclass();
        cc.openbrowser();
    }

    @AfterClass
   public void close()
    {
        cc.closebrowser();
    }

}
