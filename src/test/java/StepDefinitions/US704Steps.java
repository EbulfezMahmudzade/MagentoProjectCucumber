package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US704Steps {
    DialogContent dc = new DialogContent();
    Actions actions = new Actions(GWD.getDriver());
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    @Given("Navigate to Magento")
    public void navigateToMagento() {
        GWD.getDriver().navigate().to("https://magento.softwaretestingboard.com/");
    }

    @Then("Check elements in TAB")
    public void checkElementsInTAB() {
        dc.tabControl(dc.whatsNew);
        dc.tabControl(dc.women);
        dc.tabControl(dc.men);
        dc.tabControl(dc.gear);
        dc.tabControl(dc.training);
        dc.tabControl(dc.sale);

    }

    @Then("Check subcategories in TAB")
    public void checkSubcategoriesInTAB() {
        wait.until(ExpectedConditions.visibilityOf(dc.women));
        actions.moveToElement(dc.women).build().perform();
        dc.tabControl(dc.womenTops);
        dc.tabControl(dc.womenBottom);

        wait.until(ExpectedConditions.visibilityOf(dc.men));
        actions.moveToElement(dc.men).build().perform();
        dc.tabControl(dc.menTops);
        dc.tabControl(dc.menBottom);

        wait.until(ExpectedConditions.visibilityOf(dc.gear));
        actions.moveToElement(dc.gear).build().perform();
        dc.tabControl(dc.gearBags);
        dc.tabControl(dc.gearFitness);
        dc.tabControl(dc.gearWatches);

        wait.until(ExpectedConditions.visibilityOf(dc.training));
        actions.moveToElement(dc.training).build().perform();
        dc.tabControl(dc.trainingVideo);
    }

    @Then("Check elements in TAB\\(women and men)")
    public void checkElementsInTABWomenAndMen() {
        actions.moveToElement(dc.women).build().perform();
        actions.moveToElement(dc.womenTops).build().perform();
        for (WebElement e : dc.womenKategoryTops)
            dc.tabControl(e);

        actions.moveToElement(dc.womenBottom).build().perform();
        for (WebElement e : dc.womenKategoryBottom)
            dc.tabControl(e);

        actions.moveToElement(dc.men).build().perform();
        actions.moveToElement(dc.menTops).build().perform();
        for (WebElement e : dc.menKategoryTops)
            dc.tabControl(e);

        actions.moveToElement(dc.menBottom).build().perform();
        for (WebElement e : dc.menKategoryBottom)
            dc.tabControl(e);
    }
}
