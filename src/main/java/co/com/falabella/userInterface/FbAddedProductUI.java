package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FbAddedProductUI {
    public static final Target LBL_PURCHASE = Target.the("Added product validation")
            .locatedBy("//span[contains(text(), ' Producto(s) agregado(s) a la bolsa de compras')]");

    public static final Target BTN_CLOSE = Target.the("Close button")
            .locatedBy("//button[@class='jsx-1941891310']");
}
