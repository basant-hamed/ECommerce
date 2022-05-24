package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

import static Steps.Hook.homePage;
import static Steps.Hook.webDriver;

public class SliderWrapper {

    @And("Nokia Slide is clicked on")
    public void clickOnSlideNokia() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.attributeToBe(homePage.slide("1"), "style", "display: block;"));
        homePage.slide("1").click();
    }

    @And("Iphone Slide is clicked on")
    public void clickOnSlideIphone() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.attributeToBe(homePage.slide("2"), "style", "display: block;"));
        homePage.slide("2").click();
    }

    @Then("Nokia page should be opened")
    public void NokiaPageOpen(){
        String expectedUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Then("Iphone page should be opened")
    public void IphonePageOpen(){
        String expectedUrl = "https://demo.nopcommerce.com/iphone-6";
        String actualUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
