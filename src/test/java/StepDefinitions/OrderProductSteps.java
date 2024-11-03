package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OrderProductSteps{

    DialogContent dc=new DialogContent();

    @Given("User should address form")
    public void userShouldAddressForm()
    {
        dc.mySendKeys(dc.StreetAddress,"Alabama Street");
        dc.mySendKeys(dc.CityAddress,"Mobile");
        dc.myClick(dc.StateProvince);
        dc.mySendKeys(dc.PostCode,"36695");
        dc.myClick(dc.Country);
        dc.mySendKeys(dc.PhoneNumber,"555555555555555");


    }

    @When("User should choose shipping Methods")
    public void userShouldChooseShippingMethods()
    { dc.myClick(dc.ChooseShippingMethod);

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed()
    {
        dc.myClick(dc.NextButton);
        dc.myClick(dc.PlaceOrderButton);
        Assert.assertTrue(dc.SuccessMsg.isDisplayed());

    }

    }

