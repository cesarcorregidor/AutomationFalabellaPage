package co.com.falabella.interactions;

import co.com.falabella.driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class RefreshNavigate implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SeleniumWebDriver.driver.navigate().refresh();
    }

    public static Performable on(){
        return Instrumented.instanceOf(RefreshNavigate.class).withProperties();
    }
}
