package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Steps.Hook.homePage;
import static Steps.Hook.webDriver;

public class WishList {
    SoftAssert softAssert;

    @And("clicks on wishlist icon under HTC ONE M8 phone")
    public void wishList() throws InterruptedException {
        homePage.wishPhone().click();
        Thread.sleep(2000);
    }

    @Then("Notification success message should be displayed")
    public void successMsg(){
        String expectedMsg = "The product has been added to your wishlist";
        String actualMsg = homePage.notificationMsg().getText();
        softAssert = new SoftAssert();
        softAssert.assertTrue(actualMsg.contains(expectedMsg));
        softAssert.assertAll();
    }

    @And("Notification success message color is green")
    public void successColor(){
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = homePage.notificationMsg().getCssValue("background-color");
        softAssert.assertTrue(actualColor.contains(expectedColor));
        softAssert.assertAll();
    }

    @And("HTC ONE M8 phone should be added to WishList Page")
    public void phoneDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        homePage.linkOnNotificationMsg().click();
        Thread.sleep(2000);
        softAssert.assertTrue(webDriver.findElement(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]")).isDisplayed());
        softAssert.assertAll();
    }

    @And("when add more of the item, the count increased")
    public void addingMore() throws InterruptedException {
        webDriver.navigate().to("https://demo.nopcommerce.com/");
        homePage.wishPhone().click();
        Thread.sleep(2000);
        homePage.linkOnNotificationMsg().click();
        Thread.sleep(2000);
        WebElement counter = webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
        String actualCount = counter.getAttribute("value");
        String expectedCount = "2";
        softAssert.assertEquals(expectedCount,actualCount);
        softAssert.assertAll();
    }
}
