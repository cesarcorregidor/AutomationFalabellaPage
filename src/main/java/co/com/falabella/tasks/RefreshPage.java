package co.com.falabella.tasks;

import co.com.falabella.interactions.RefreshNavigate;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.userInterface.FbHomeUI.IMG_LOGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RefreshPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RefreshNavigate.on(),
                WaitUntil.the(IMG_LOGO, isVisible()).forNoMoreThan(20).seconds()

        );
    }
    public static Performable on(){
        return Instrumented.instanceOf(RefreshPage.class).withProperties();
    }
}
