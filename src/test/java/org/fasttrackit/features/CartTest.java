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
        loginSteps.login("dorel_c@mailinator.com","123456789","Hello, Dorel Dorel Cristurean!");
        cartSteps.addfirstproduct();
        cartSteps.addSecondProduct();
        cartSteps.addThirdProduct();
        cartSteps.getvalues();
        cartSteps.compare();
        cartSteps.emptyCart();


    }

}
