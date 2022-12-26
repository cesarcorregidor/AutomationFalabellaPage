package co.com.falabella.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.falabella.userInterface.FbHomeUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeValidation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IMG_BANNER, isVisible()).forNoMoreThan(20).seconds()
        );
    }
    public static Performable on(){
        return Instrumented.instanceOf(HomeValidation.class).withProperties();
    }
}
