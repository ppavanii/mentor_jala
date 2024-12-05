package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mentorpage {

    @FindBy(xpath="//a[contains(@href,'1')]")
   public WebElement mentor1;

    @FindBy(xpath="//a[contains(@href,'2')]")
   public WebElement mentor2;
}
