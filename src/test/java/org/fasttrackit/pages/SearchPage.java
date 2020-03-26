package org.fasttrackit.pages;

        import com.vladsch.flexmark.test.Strings;
        import net.serenitybdd.core.annotations.findby.FindBy;
        import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.core.pages.WebElementFacade;
        import net.thucydides.core.annotations.DefaultUrl;
        import org.junit.Assert;
        import org.openqa.selenium.By;

        import java.util.List;


public class SearchPage extends PageObject {
    @FindBy(id = "product-collection-image-410")
    private WebElementFacade product1;
    @FindBy(css = "div.category-products > ul")
    private List<WebElementFacade> productsgrid;
    @FindBy(id = "product-collection-image-555")
    private WebElementFacade searchReasult1;
    @FindBy(id = "product-collection-image-553")
    private WebElementFacade searchReasult2;
    @FindBy(id = "product-collection-image-424")
    private WebElementFacade searchResult3;
    @FindBy(id = "product-collection-image-423")
    private WebElementFacade searchReasult4;
    @FindBy(css = "body > div.wrapper > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")
    private WebElementFacade sortByButton;
    @FindBy(id = "product-minimal-price-555")
    private WebElementFacade lowestPrice;
    @FindBy(css = "#product-price-424 > span")
    private WebElementFacade highestPrice;
    // public int lowestPrieToInt = Integer.parseInt(getlowestPrice());
    //  public int highestPriceToInt = Integer.parseInt(gethighestPrice());


    public void product1() {
        clickOn(product1);
    }

    public WebElementFacade getSearchResult1() {
        searchReasult1.getText();
        return getSearchResult1();

    }

    public WebElementFacade getSearchResult2() {
        searchReasult2.getText();
        return getSearchResult2();
    }

    public WebElementFacade getSearchresult3() {
        searchResult3.getText();
        return getSearchresult3();
    }

    public WebElementFacade getSearchresult4() {
        searchReasult4.findElement(By.id("product-collection-image-423"));
        return getSearchresult4();
    }

    public List<WebElementFacade> setProductsgrid() {
        productsgrid.add(0, getSearchResult1());
        productsgrid.add(1, getSearchResult2());
        productsgrid.add(2, getSearchresult3());
        productsgrid.add(3, getSearchresult4());
        return setProductsgrid();

    }

    public void setSortByButton() {
        sortByButton.selectByVisibleText("Price");
    }

    public Integer getlowestPrice() {
        return Integer.valueOf(lowestPrice.getText().substring(0,3));
    }

    public Integer gethighestPrice() {
        return Integer.valueOf(highestPrice.getText().substring(0,3));
    }
    public void veryfytext(){
        Assert.assertTrue(setProductsgrid().contains("SILVER"));
    }




}















