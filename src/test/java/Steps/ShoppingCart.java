package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Steps.Hook.homePage;
import static Steps.Hook.webDriver;

public class ShoppingCart {

    SoftAssert softAssert;

    @And("clicks on ADD TO CART under HTC ONE M8 phone")
    public void addToCart() throws InterruptedException {
        homePage.shoppingPhone().click();
        Thread.sleep(2000);
    }

    @Then("Notification success message for adding should be displayed")
    public void successMsg(){
        String expectedMsg = "The product has been added to your shopping cart";
        String actualMsg = homePage.notificationMsg().getText();
        softAssert = new SoftAssert();
        softAssert.assertTrue(actualMsg.contains(expectedMsg));
        softAssert.assertAll();
    }

    @And("Notification success message for adding color is green")
    public void successColor(){
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = homePage.notificationMsg().getCssValue("background-color");
        softAssert.assertTrue(actualColor.contains(expectedColor));
        softAssert.assertAll();
    }

    @And("HTC ONE M8 phone should be added to Shopping Cart Page")
    public void phoneDisplayed() throws InterruptedException {
        homePage.linkOnNotificationMsg().click();
        Thread.sleep(3000);
        softAssert.assertTrue(webDriver.findElement(By.className("sku-number")).isDisplayed());
        softAssert.assertAll();
    }

    @And("when add more of the same item to shopping cart, the count increased")
    public void addingMore() throws InterruptedException {
        webDriver.navigate().to("https://demo.nopcommerce.com/");
        homePage.shoppingPhone().click();
        Thread.sleep(2000);
        homePage.linkOnNotificationMsg().click();
        Thread.sleep(2000);
        WebElement counter = webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input"));
        String actualCount = counter.getAttribute("value");
        String expectedCount = "2";
        softAssert.assertEquals(actualCount,expectedCount);
        softAssert.assertAll();
    }
}
