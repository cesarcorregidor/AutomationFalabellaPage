package co.com.falabella.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FbHomeUI {

    public static final Target LBL_PRODUCT = Target.the("Product name")
            .locatedBy("//div[@class='a-productName_r0j178']");

    public static final Target IMG_BANNER = Target.the("Home Banner")
            .locatedBy("//div[@class='showcase Showcase-module_showcase__twfzu mg-10']");

    public static final Target IMG_LOGO = Target.the("Home main Logo")
            .locatedBy("//img[@class='Logo-module_logo__3RERy']");


}
