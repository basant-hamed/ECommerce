package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static Steps.Hook.homePage;
import static Steps.Hook.loginPage;
import static Steps.Hook.webDriver;

public class Login {
    SoftAssert softAssert;

    public void loginInput(String email, String password){
        loginPage.email().clear();
        loginPage.password().clear();
        loginPage.email().sendKeys(email);
        loginPage.password().sendKeys(password);
    }

    @And("clicks on Login tab")
    public void clickOnLoginTab(){
        homePage.loginTab().click();
    }

    @And("^user enters \"(.*)\" as an email and \"(.*)\" as a password$")
    public void validReg(String email, String password) {
        loginInput(email, password);
    }

    @And("clicks on Login")
    public void submitting() {
        loginPage.submit().click();
    }

    @Then("user could successfully logged in")
    public void result() {
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = webDriver.getCurrentUrl();
        String myAccount = "My account";
        softAssert = new SoftAssert();
        softAssert.assertTrue(webDriver.findElement
                (By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText()
                .contains(myAccount));
        softAssert.assertEquals(expectedUrl, actualUrl);
        softAssert.assertAll();
    }
}
