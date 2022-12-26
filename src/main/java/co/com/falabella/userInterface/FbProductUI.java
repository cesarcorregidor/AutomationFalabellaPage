package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FbProductUI {
    public static final Target BTN_ADD_TO_CAR = Target.the("add to cart button")
            .locatedBy("//button[@id='add-to-cart-button']");

    public static final Target LBL_CHECK_PRODUCT = Target.the("product name")
            .locatedBy("//div[contains(@class,'product-name')]");
}
