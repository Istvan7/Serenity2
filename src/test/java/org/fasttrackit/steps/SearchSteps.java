package org.fasttrackit.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

import java.util.List;

public class SearchSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;
    private SearchPage searchPage;
    private PrdoductPage prdoductPage;


    @Step
    public void searchTest() {
        homePage.open();
        homePage.setSearchField("chelsea");
        homePage.setClickSearch();
        searchPage.product1();

    }

    @Step
    public void findproduct(String expected) {
        String message = prdoductPage.getfindproduct();
        Assert.assertEquals(expected, message);


    }


    @Step
    public void searchreasults() {
        homePage.open();
        homePage.setSearchField("necklace");
        homePage.setClickSearch();

    }

    @Step
    public Integer lowestInt() {

       return searchPage.getlowestPrice();

    }

    @Step
    public Integer highestInt() {
       return searchPage.gethighestPrice();
    }

    @Step
    public void selectByprice() {
        searchPage.setSortByButton();

    }


    @Step
    public void compare() {
        Assert.assertTrue(lowestInt()<highestInt());
    }

    @Step
    public void ex1GetValues(){
        searchPage.getSearchResult1();
        searchPage.getSearchResult2();
        searchPage.getSearchresult3();
        searchPage.getSearchresult4();

    }
    @Step
    public void ex1SetGriid(){
        searchPage.setProductsgrid();
    }
   @Step
    public void ex1veryfytext(){
        searchPage.veryfytext();
    }
}