package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "#header-account > div > ul > li:nth-child(5) > a")
    private WebElementFacade registerLink;
    @FindBy(id = "search")
    private WebElementFacade searchField;
    @FindBy(css ="#search_mini_form > div.input-box > button")
    private WebElementFacade clickSearch;



    public void clickAccount(){
        clickOn(accountLink);
    }

    public void clickLogin(){
        clickOn(loginLink);
    }
    public void clickRegister(){
        clickOn(registerLink);
    }

    public void setSearchField(String search){
        typeInto(searchField,search);
    }
    public void setClickSearch(){
        clickOn(clickSearch);
    }



}
