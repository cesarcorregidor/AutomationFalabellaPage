package co.com.falabella.stepDefinitions;

import co.com.falabella.globalVar.Global;
import co.com.falabella.tasks.ProductNameValidation;
import co.com.falabella.tasks.RefreshPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Assert;

public class FbOutlineStepDefinition {
    @When("^He refresh the home page and He verify that the logo has loaded$")
    public void heRefreshTheHomePageAndHeVerifyThatTheLogoHasLoaded() {
        OnStage.theActorInTheSpotlight().attemptsTo(RefreshPage.on());
    }

    @When("^He clicked on the fourth product and saved the name$")
    public void heClickedOnTheFourthProductAndSavedTheName() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductNameValidation.on());

    }

    @Then("^He validates that the product has the same name$")
    public void heValidatesThatTheProductHasTheSameName() {
        Assert.assertEquals(Global.Check,Global.CheckProduct);
    }
}
