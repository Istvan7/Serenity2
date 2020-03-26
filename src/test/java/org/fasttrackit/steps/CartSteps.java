package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class CartSteps {

    private SalePage salePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private PrdoductPage prdoductPage;
    CartPage cartPage;


    @Step
    public void addfirstproduct() {
        myAccountPage.slickSaleButton();
        salePage.clickproductAddToCart();
        salePage.open();
    }

    @Step
    public void addSecondProduct() {
        salePage.clickproduct2WiewD();
        prdoductPage.clickSelectColorpr2();
        prdoductPage.clickSelectorheightpr2();
        prdoductPage.clickaddCartPr2();
        salePage.open();}


        @Step
        public void addThirdProduct () {
            salePage.clickproduct3WiewD();
            prdoductPage.clickSelectcolorpr3();
            prdoductPage.clickSelectorheightpr3();
            prdoductPage.clickCartPr3();
        }

        @Step
    public void getvalues(){
        cartPage.getfirstprice();
        cartPage.getsecondprice();
        cartPage.getthirdprice();
        cartPage.gettotalprice();

        }

        @Step
    public void compare(){
            Assert.assertEquals(cartPage.sum(),cartPage.gettotalprice());
        }


    }




