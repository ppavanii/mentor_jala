package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class studentpage {

    @FindBy(xpath="//body/p[1]")
    public WebElement s1name;

    @FindBy(xpath="//body/p[2]")
    public WebElement s1course;

    @FindBy(xpath="//body/p[3]")
    public WebElement s1mentor;

    @FindBy(xpath="//body/p[1]")
    public WebElement s2name;

    @FindBy(xpath="//body/p[2]")
    public WebElement s2course;

    @FindBy(xpath="//body/p[3]")
    public WebElement s2mentor;

    @FindBy(xpath="//body/p[1]")
    public WebElement s3name;

    @FindBy(xpath="//body/p[2]")
    public WebElement s3course;

    @FindBy(xpath="//body/p[3]")
    public WebElement s3mentor;

    @FindBy(xpath="//body/p[1]")
    public WebElement s4name;

    @FindBy(xpath="//body/p[2]")
    public WebElement s4course;

    @FindBy(xpath="//body/p[3]")
    public WebElement s4mentor;

}
