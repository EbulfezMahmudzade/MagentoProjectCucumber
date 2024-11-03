package Pages;

import Utilities.GWD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderMenu extends ParentPage{
    public HeaderMenu() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "//a[text()='Create an Account']")
    public WebElement CreateAccount;

    @FindBy(xpath = "//li[@class='authorization-link']")
    public  WebElement SignIn;

    @FindBy(xpath = "//button[@data-action='customer-menu-toggle']")
    public WebElement CostomerMenuToogle;


    @FindBy (xpath = "(//a[text()='My Account'])[1]")
    public WebElement MyAccountButton703;

}
