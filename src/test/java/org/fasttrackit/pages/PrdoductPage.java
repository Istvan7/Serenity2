package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class PrdoductPage extends PageObject {
    @FindBy(css="#product_addtocart_form > div.product-shop > div.product-name > span")
    private WebElementFacade findproduct;

    public String getfindproduct(){
        return findproduct.getText();
    }
    @FindBy(css ="#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")
    private WebElementFacade addCartPr2;

    public void clickaddCartPr2(){
        addCartPr2.click();
    }

    @FindBy(css ="#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")
    private WebElementFacade addCartPr3;


    public void clickCartPr3 (){
        addCartPr3.click();
    }

    @FindBy(css = "a[title*='Pur']")
    private WebElementFacade selectcolorpr3;

    public void clickSelectcolorpr3 (){
        clickOn(selectcolorpr3);
    }

    @FindBy(css = "#swatch79 > span.swatch-label")
    private WebElementFacade selectorheightpr3;

    public void clickSelectorheightpr3(){
        clickOn(selectorheightpr3);
    }

    @FindBy(css = "#swatch27 > span.swatch-label > img")
    private WebElementFacade selectColorpr2;

    public void clickSelectColorpr2(){
        clickOn(selectColorpr2);
    }

    @FindBy(css = "#swatch81 > span.swatch-label")
    private WebElementFacade getSelectorheightpr2;

    public void clickSelectorheightpr2(){
        clickOn(getSelectorheightpr2);
    }
}