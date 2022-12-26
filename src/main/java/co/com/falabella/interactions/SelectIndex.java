package co.com.falabella.interactions;

import co.com.falabella.globalVar.Global;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static co.com.falabella.userInterface.FbHomeUI.LBL_PRODUCT;

public class SelectIndex implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productList =  LBL_PRODUCT.resolveAllFor(actor);
        Global.Check = productList.get(3).getText();
        productList.get(3).click();
    }

    public static Performable on(){
        return Instrumented.instanceOf(SelectIndex.class).withProperties();
    }
}
