package Steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;

import static Steps.Hook.homePage;
import static Steps.Hook.webDriver;

public class FollowUs {
    SoftAssert softAssert;

    @And("user opens Facebook link")
    public void facebookLink() throws InterruptedException {
        homePage.facebook().click();
        Thread.sleep(3000);
    }

    @And("user opens Twitter link")
    public void twitterLink() throws InterruptedException {
        homePage.twitter().click();
        Thread.sleep(3000);
    }

    @And("user opens rss link")
    public void rssLink() throws InterruptedException {
        homePage.rss().click();
        Thread.sleep(3000);
    }

    @And("user opens YouTube link")
    public void youtubeLink() throws InterruptedException {
        homePage.youtube().click();
        Thread.sleep(3000);
    }

    @Then("Facebook Page is opened in new tab")
    public void facebookOpened() {
        ArrayList<String> chromeTabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(chromeTabs.get(1));
        String expectedUrl = "https://www.facebook.com/nopCommerce";
        String actualUrl = webDriver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("Twitter Page is opened in new tab")
    public void twitterOpened() {
        ArrayList<String> chromeTabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(chromeTabs.get(1));
        String expectedUrl = "https://twitter.com/nopCommerce";
        String actualUrl = webDriver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("News RSS is opened")
    public void newsRSSOpened() {
        String expectedUrl = "https://demo.nopcommerce.com/news/rss/1";
        String actualUrl = webDriver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("YouTube Channel is opened in new tab")
    public void youtubeOpened() {
        ArrayList<String> chromeTabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(chromeTabs.get(1));
        String expectedUrl = "https://www.youtube.com/user/nopCommerce";
        String actualUrl = webDriver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(actualUrl, expectedUrl);
    }
}
