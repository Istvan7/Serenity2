package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;
    @FindBy(id="middlename")
    private WebElementFacade middleNameField;
    @FindBy(id="lastname")
    private WebElementFacade lastNameField;
    @FindBy(id="email_address")
    private WebElementFacade emailadressField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "confirmation")
    private WebElementFacade confirmPaswordField;
    @FindBy(id = "is_subscribed")
    private WebElementFacade newsletterButton;
    @FindBy(css = "#form-validate > div.buttons-set > button > span > span")
    private WebElementFacade registerButton;


    public void setFirstName(String firstName){
        typeInto(firstNameField,firstName);

    }

    public void setMiddleName(String middleName){
        typeInto(middleNameField,middleName);
    }
    public void setLastName(String lastname){
        typeInto(lastNameField,lastname);
    }
    public void setemail(String email){
        typeInto(emailadressField,email);
    }
    public void setPassword(String password){
        typeInto(passwordField,password);
    }
    public void setConfirmPaswordField(String confirmPassword){
        typeInto(confirmPaswordField,confirmPassword);
    }

    public void clicknewsletter(){
        clickOn(newsletterButton);
    }
    public void clickregisterButton(){
        clickOn(registerButton);
    }
    @FindBy(css = "body > div.wrapper > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span")
    private WebElementFacade registrationerror;

    public String  getregistrationerror(){
        return registrationerror.getText();
    }
    @FindBy(id = "advice-required-entry-email_address")
    private WebElementFacade enteremail;

    public String getemailerror(){
        return enteremail.getText();
    }





}