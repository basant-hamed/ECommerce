package Steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static Steps.Hook.homePage;
import static Steps.Hook.webDriver;

public class Category {
    SoftAssert softAssert;
    Actions actions;

    @And("user hovers on Computers category")
    public void hoverOnCategory(){
        actions = new Actions(webDriver);
        actions.moveToElement(homePage.category());
    }

    @And("clicks on Notebooks")
    public void hoverAndClickOnSubcategory(){
        actions.moveToElement(homePage.subCategory());
        actions.click().build().perform();
    }

    @Then("user should be directed to Notebooks page")
    public void result() {
        String expectedUrl = "https://demo.nopcommerce.com/notebooks";
        String actualUrl = webDriver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();
    }
}
