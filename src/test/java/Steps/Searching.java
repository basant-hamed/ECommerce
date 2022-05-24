package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import static Steps.Hook.webDriver;
import static Steps.Hook.homePage;


public class Searching {
    SoftAssert softAssert;

    @And("^inputs \"(.*)\" as a product Name on search field$")
    public void searchByName(String pName){
        homePage.searchField().clear();
        homePage.searchField().sendKeys(pName);
    }

    @And("^inputs \"(.*)\" as a product SKU on search field$")
    public void searchBySKU(String pSKU){
        homePage.searchField().clear();
        homePage.searchField().sendKeys(pSKU);
    }

    @And("hits Enter")
    public void hitEnter(){
        homePage.searchField().sendKeys(Keys.ENTER);
    }

    @Then("product should be displayed")
    public void result() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/span")).isDisplayed());
        softAssert.assertTrue(webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")).isDisplayed());
        softAssert.assertAll();
    }
}
