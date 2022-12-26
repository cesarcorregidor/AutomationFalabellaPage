package co.com.falabella.stepDefinitions;

import co.com.falabella.driver.SeleniumWebDriver;
import co.com.falabella.tasks.CarValidation;
import co.com.falabella.tasks.HomeValidation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class FbBackgroundStepDefinition {

    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^He is on the page of (.*)$")
    public void heIsOnThePageOfHttpsWwwFalabellaComCoFalabellaCo(String url) {
        OnStage.theActorCalled("Cesar")
                .can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));

    }
    @When("^he add a random item to the cart$")
    public void heAddARandomItemToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(CarValidation.on());
    }

    @Then("^he validates that he is already on the home page$")
    public void heValidatesThatHeIsAlreadyOnTheHomePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(HomeValidation.on());
    }

}
