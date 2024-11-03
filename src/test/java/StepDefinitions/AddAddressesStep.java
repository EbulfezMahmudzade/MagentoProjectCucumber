package StepDefinitions;

import Pages.DialogContent;
import Pages.HeaderMenu;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddAddressesStep {
    DialogContent dc = new DialogContent();
    HeaderMenu hd = new HeaderMenu();
    LeftNav ln = new LeftNav();

    Actions actions = new Actions(GWD.getDriver());
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));


    @Then("Click on the My Account section")
    public void clickOnTheMyAccountSection() {
        hd.myClick(hd.CostomerMenuToogle);
        wait.until(ExpectedConditions.elementToBeClickable(hd.MyAccountButton703));
        hd.myClick(hd.MyAccountButton703);
    }

    @And("Click on My Address Book")
    public void clickOnMyAddressBook() {
        wait.until(ExpectedConditions.elementToBeClickable(ln.AddressBook703));
        ln.myClick(ln.AddressBook703);
    }


    @And("User click on DialogButton")
    public void userClickOnDialogButton(DataTable dtButtons) {
        List<String> listButton = dtButtons.asList(String.class);
        for (int i = 0; i < listButton.size(); i++) {
            dc.myClick(dc.getWebElement(listButton.get(i)));

        }
    }

    @And("User send keys in Dialog")
    public void userSendKeysInDialog(DataTable dtKutuVeYazilar)
    {
        List<List<String>> listKutuVeYazilar = dtKutuVeYazilar.asLists(String.class);
        for (int i = 0; i < listKutuVeYazilar.size(); i++) {
            WebElement kutu = (dc.getWebElement(listKutuVeYazilar.get(i).get(0)));
            dc.mySendKeys(kutu, listKutuVeYazilar.get(i).get(1));
        }
    }

    @And("User select state")
    public void userSelectState()
    {
        wait.until(ExpectedConditions.visibilityOf(dc.State703));
        Select select = new Select(dc.State703);
        select.selectByValue("1");



    }
}

