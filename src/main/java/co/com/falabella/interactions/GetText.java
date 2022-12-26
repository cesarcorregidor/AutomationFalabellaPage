package co.com.falabella.interactions;

import co.com.falabella.globalVar.Global;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.com.falabella.userInterface.FbProductUI.LBL_CHECK_PRODUCT;

public class GetText implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Global.CheckProduct = LBL_CHECK_PRODUCT.resolveFor(actor).getText();
    }

    public static Performable on(){
        return Instrumented.instanceOf(GetText.class).withProperties();
    }
}
