
package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin() {
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("dorel_c@mailinator.com", "123456789");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, Dorel Dorel Cristurean!");
    }

    @Test
    public void wrongpassword() {
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("dorel_c@mailinator.com", "12345678");
        loginSteps.clickLogin();
        loginSteps.invalidMessage("Invalid login or password.");
    }
}
