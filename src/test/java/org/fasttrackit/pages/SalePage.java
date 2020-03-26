package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://testfasttrackit.info/selenium-test/sale.html")
public class SalePage extends PageObject {

    @FindBy(css = "button[onclick*='cart']")
    private WebElementFacade productAddToCart;

    public void clickproductAddToCart() {
        clickOn(productAddToCart);
    }

    @FindBy(css = " li:nth-child(2) > div > div.actions > a")
    private WebElementFacade product2WiewD;

    public void clickproduct2WiewD() {
        clickOn(product2WiewD);
    }

    @FindBy(css = " li:nth-child(1) > div > div.actions > a")
    private WebElementFacade product3WiewD;

public void clickproduct3WiewD (){
    clickOn(product3WiewD);
}


}
