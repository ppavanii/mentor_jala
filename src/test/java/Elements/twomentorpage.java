package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class twomentorpage {

    @FindBy(xpath="//body/div[1]//p[1]")
    public WebElement name;

    @FindBy(xpath="//body/div[1]//p[2]")
    public  WebElement numberofstudents;

    @FindBy(xpath="//body/div[1]//p[3]/strong")
    public WebElement course;  // gettext

    @FindBy(xpath="//body/div[1]//ul/li")
    public WebElement course1;

}
