package co.com.falabella.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.com.falabella.userInterface.FbHomeUI.LBL_PRODUCT;

public class ClickRandom implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productList = LBL_PRODUCT.resolveAllFor(actor);
        Random random = new Random();
        int randomNumber = random.nextInt(productList.size()+1);
        productList.get(randomNumber).click();

    }
    public static Performable on(){
        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }
}
