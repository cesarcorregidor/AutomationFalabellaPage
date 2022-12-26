package co.com.falabella.tasks;

import co.com.falabella.interactions.BackNavigate;
import co.com.falabella.interactions.ClickRandom;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.userInterface.FbAddedProductUI.BTN_CLOSE;
import static co.com.falabella.userInterface.FbAddedProductUI.LBL_PURCHASE;
import static co.com.falabella.userInterface.FbHomeUI.LBL_PRODUCT;
import static co.com.falabella.userInterface.FbProductUI.BTN_ADD_TO_CAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CarValidation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCT, isPresent()).forNoMoreThan(20).seconds(),
                ClickRandom.on(),
                Click.on(BTN_ADD_TO_CAR),
                WaitUntil.the(LBL_PURCHASE, isPresent()).forNoMoreThan(20).seconds(),
                Check.whether(WebElementQuestion.stateOf(LBL_PURCHASE),
                        WebElementStateMatchers.isVisible()).andIfSo(
                                Click.on(BTN_CLOSE),
                                BackNavigate.on()
                )
                .otherwise()
        );
    }

    public static Performable on(){
        return Instrumented.instanceOf(CarValidation.class).withProperties();
    }
}
