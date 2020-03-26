package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class SearchTest extends BaseTest {
    @Steps
    SearchSteps searchSteps;

    @Steps
    LoginTest loginTest;

    @Test
    public void search(){
        searchSteps.searchTest();
        searchSteps.findproduct("CHELSEA TEE");
    }

    @Test

    public void ex2(){
        searchSteps.searchreasults();
        searchSteps.selectByprice();
        searchSteps.lowestInt();
        searchSteps.highestInt();
        searchSteps.compare();


    }@Test
    @Ignore
    public void ex1(){
        searchSteps.searchreasults();
        searchSteps.ex1GetValues();
        searchSteps.ex1SetGriid();
        searchSteps.ex1veryfytext();

    }


}
