package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {
    @FindBy(css = " tr.first.odd > td.product-cart-total > span > span")
    private WebElementFacade firstprice;

    public Integer getfirstprice(){
        return Integer.valueOf(firstprice.getText().substring(0,3));
    }


    @FindBy(css = " tr.even > td.product-cart-total > span > span")
    private WebElementFacade secondprice;
    public Integer getsecondprice(){
        return Integer.valueOf(secondprice.getText().substring(0,3));
    }

    @FindBy(css = "tr.last.odd > td.product-cart-total > span > span")
    private  WebElementFacade thirdprice;
    public Integer getthirdprice(){
        return Integer.valueOf(thirdprice.getText().substring(0,3));
    }
    @FindBy(css = " td:nth-child(2) > strong > span")
    private WebElementFacade totalprice;
    public Integer gettotalprice(){
        return Integer.valueOf(totalprice.getText().substring(0,3));
    }

    public Integer sum (){
        return getfirstprice()+getsecondprice()+getthirdprice();

    }


}
