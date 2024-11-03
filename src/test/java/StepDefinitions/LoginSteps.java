package StepDefinitions;

import Pages.DialogContent;
import Pages.HeaderMenu;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc=new DialogContent();
    HeaderMenu hd=new HeaderMenu();


    @When("Click to Sign in Button")
    public void click_to_sign_in_button() {
        hd.myClick(hd.SignIn);
    }
    @Then("User Filled required informations")
    public void user_filled_required_informations() {

        dc.mySendKeys(dc.SignInemail,"kadriyealsancak@gmail.com");
        dc.mySendKeys(dc.SignInpassword,"12345678Ka");


    }
    @Then("Click to sign in")
    public void click_to_sign_in() {
       dc.myClick(dc.SignInButton);
    }


}
