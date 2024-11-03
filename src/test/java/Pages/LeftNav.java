package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement ManageAddressesButton703;

    @FindBy(xpath = "//strong[text()='Address Book']")
    public WebElement AddressBook703;

}
