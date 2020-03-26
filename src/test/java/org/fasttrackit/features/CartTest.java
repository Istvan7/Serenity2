package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
          Constants constants;
    @Steps
     LoginSteps loginSteps;
    @Steps
    CartSteps cartSteps;

    @Test
    public void addToCart() {
        loginSteps.login(Constants.USER_EMAIL,Constants.USER_PASSWORD,Constants.USER_NAME);
        cartSteps.addfirstproduct();
        cartSteps.addSecondProduct();
        cartSteps.addThirdProduct();
        cartSteps.getvalues();
        cartSteps.compare();


    }

}
