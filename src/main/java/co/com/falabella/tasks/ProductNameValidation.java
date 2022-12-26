package co.com.falabella.tasks;

import co.com.falabella.interactions.GetText;
import co.com.falabella.interactions.SelectIndex;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ProductNameValidation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectIndex.on(),
                GetText.on()
        );
    }

    public static Performable on(){
        return Instrumented.instanceOf(ProductNameValidation.class).withProperties();
    }

}
