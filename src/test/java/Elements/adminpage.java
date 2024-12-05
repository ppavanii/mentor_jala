package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminpage {

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement login;

    @FindBy(xpath="//a[contains(@href,'content')]")
    public WebElement skipcontent;

    @FindBy(xpath="//header//h1")
    public WebElement loginpagetitle;

}
