package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class studentspage {

    @FindBy(xpath="//a[contains(@href,'1')]")
    public WebElement student1;

    @FindBy(xpath="//a[contains(@href,'2')]")
    public WebElement student2;

    @FindBy(xpath="//a[contains(@href,'3')]")
    public WebElement student3;

    @FindBy(xpath="//a[contains(@href,'4')]")
    public WebElement student4;



}
