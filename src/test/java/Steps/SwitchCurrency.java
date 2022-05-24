package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static Steps.Hook.homePage;

public class SwitchCurrency {
    SoftAssert softAssert;
    Select select;

    @And("switch to Euro")
    public void switchCurrency(){
        select = new Select(homePage.currencySwitcher());
        select.selectByVisibleText("Euro");
    }

    @Then("Euro should be selected")
    public void result() {
        String expectedEuro = "Euro";
        softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.selected().getText()
                .contains(expectedEuro));
        softAssert.assertAll();
    }
}
