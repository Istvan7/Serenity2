package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToRegisterPage(){
        homePage.open();
        homePage.clickAccount();
        homePage.clickRegister();
    }
    @Step
    public void complerFields(String firstname , String middlename, String lastname,String email, String password, String confirmPassword  ){
        registerPage.setFirstName(firstname);
        registerPage.setMiddleName(middlename);
        registerPage.setLastName(lastname);
        registerPage.setemail(email);
        registerPage.setPassword(password);
        registerPage.setConfirmPaswordField(confirmPassword);
        registerPage.clicknewsletter();
        registerPage.clickregisterButton();
    }

    @Step
    public void checkregister(String expected) {
        String message = myAccountPage.getregistrationmessage();
        Assert.assertEquals(expected, message);

    }
    @Step
    public void registerWithTheSameEmai(String expected){
        String error = registerPage.getregistrationerror();
        Assert.assertEquals(expected,error);

    }
    @Step
    public void registrationWithoutEmail(String expected){
        String error =registerPage.getemailerror();
        Assert.assertEquals(expected,error);
    }

}