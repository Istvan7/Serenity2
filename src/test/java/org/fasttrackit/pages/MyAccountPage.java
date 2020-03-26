package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/index/")
public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeMessageParagraph;

    public String getWelcomeMessage() {
        return welcomeMessageParagraph.getText();
    }

    @FindBy(css = "body > div.wrapper > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li > span")
    private WebElementFacade registrationMessageParagraph;

    public String getregistrationmessage() {
        return registrationMessageParagraph.getText();
    }


    @FindBy(css = ".nav-5.parent > a")
    private WebElementFacade saleButton;

      public void slickSaleButton(){

          clickOn(saleButton);
      }


}