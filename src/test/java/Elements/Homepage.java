package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

   // @FindBy(xpath="//h1")
 //  public WebElement title;

    @FindBy(xpath="/html/body/header/nav/ul/li[1]/a")
    public WebElement mentor;

    @FindBy(xpath="/html/body/header/nav/ul/li[2]/a")
    public  WebElement student;

    @FindBy(xpath="/html/body/header/nav/ul/li[3]/a")
   public WebElement adminportal;

}
