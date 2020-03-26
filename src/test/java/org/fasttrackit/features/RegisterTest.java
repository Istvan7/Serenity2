package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void testregistration(){
        registerSteps.navigateToRegisterPage();
        registerSteps.complerFields("qwe","rewq","dsa","qwe@rew3213514345454554574523453456546qq.com","123456","123456");
        registerSteps.checkregister("Thank you for registering with Madison Island.");

    }
    @Test
    public void testRegistrationWithAleradyUsedEmail(){
        registerSteps.navigateToRegisterPage();
        registerSteps.complerFields("qwe","rewq","dsa","qwe@rewqq.com","123456","123456");
        registerSteps.registerWithTheSameEmai("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");


    }
    @Test
    public void testRegistrationWithoutEmail(){
        registerSteps.navigateToRegisterPage();
        registerSteps.complerFields("qwe","rewq","dsa","","123456","123456");
        registerSteps.registrationWithoutEmail("This is a required field.");


    }
}