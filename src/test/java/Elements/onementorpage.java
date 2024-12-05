package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class onementorpage {

    @FindBy(xpath="//body/div[1]//p[1]")
    public WebElement name;

    @FindBy(xpath="//body/div[1]//p[2]")
    public  WebElement numberofstudents;

    @FindBy(xpath="//body/div[1]//p[3]/strong")
    public WebElement courses;  // gettext

    @FindBy(xpath="//body/div[1]//ul/li[1]")
    public WebElement course1;

    @FindBy(xpath="//body/div[1]//ul/li[2]")
    public WebElement course2;



}
