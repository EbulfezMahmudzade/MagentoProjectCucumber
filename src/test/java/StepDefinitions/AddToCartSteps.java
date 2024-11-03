package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddToCartSteps{
    DialogContent dc=new DialogContent();


    @When("User add  selected product to cart")
    public void user_add_selected_product_to_cart() {
       dc.myClick(dc.SelectedProduct);
       dc.myClick(dc.ChooseSize);
       dc.myClick(dc.ChooseColor);
       dc.mySendKeys(dc.Choosequantity,"3");
       dc.myClick(dc.AddToCart);


    }
    @Then("The user can increase and multiply the number of products")
    public void the_user_can_increase_and_multiply_the_number_of_products()
    {   dc.myClick(dc.ClickToCartItem);
        dc.myClick(dc.EditToCart);
        dc.mySendKeys(dc.ChangeQuantity,"1");
        dc.myClick(dc.UpdateShoppingCart);


    }

    @And("User remove products to cart")
    public void userRemoveProductSToCart()
    {
        dc.myClick(dc.DeleteItemInCart);

    }
}
