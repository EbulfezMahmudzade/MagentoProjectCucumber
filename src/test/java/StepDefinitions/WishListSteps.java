package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WishListSteps {
    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    Actions actions = new Actions(GWD.getDriver());

    @And("Click on the element in dialog box")
    public void clickOnTheElementInDialog(DataTable dtButtons) {
        List<String> listButton = dtButtons.asList(String.class);
        for (int i = 0; i < listButton.size(); i++) {
            dc.myClick(dc.getWebElement(listButton.get(i)));
        }
    }

    @Then("The text \"Wishlist added\" should appear")
    public void wishListHasBeenAddedShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.messageText));
        Assert.assertTrue(dc.messageText.getText().toLowerCase().contains("has been added"));

    }

    @And("Verify the wishlist should not be empty")
    public void verifyTheWishlistShouldNotBeEmpty() {
        Assert.assertFalse(dc.wishListNotEmpty.getText().contains("You have no items in your wish list."));
    }

    @And("Navigate to product and click the remove button")
    public void navigateToProductAndClickTheRemoveButton() {
        actions.moveToElement(dc.wishListProduct).build().perform();
                wait.until(ExpectedConditions.elementToBeClickable(dc.DeleteButton703));
        actions.click(dc.DeleteButton703).build().perform();
    }

    @Then("Wish List has been removed should appear")
    public void wishListHasBeenRemovedShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.messageText));
        Assert.assertTrue(dc.messageText.getText().toLowerCase().contains("has been removed"));
    }
}
