package StepDefinitions;

import Pages.DialogContent;
import Pages.HeaderMenu;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class RegisterSteps {

    DialogContent dc=new DialogContent();
    HeaderMenu hd=new HeaderMenu();

    @Given("Navigate to Magento")
    public void navigate_to_magento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Click to Create an Account")
    public void click_to_create_an_account() {
        hd.myClick(hd.CreateAccount);
    }

    @When("Fill out the Personel Information form")
    public void fill_out_the_personel_information_form(DataTable dtPersonelinfo) {
        List<List<String>> listUserPass=  dtPersonelinfo.asLists();
        for (int i = 0; i < listUserPass.size(); i++) {
            System.out.println(listUserPass.get(i).get(0)+" "+
                    listUserPass.get(i).get(1));
        }


    }


}
