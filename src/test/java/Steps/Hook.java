package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    static WebDriver webDriver;
    static HomePage homePage;
    static RegistrationPage registrationPage;
    static LoginPage loginPage;

    @Before
    public void driver(){
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        loginPage =new LoginPage(webDriver);
        registrationPage = new RegistrationPage(webDriver);
        webDriver.manage().window().maximize();
    }
    @When("user navigates to website url")
    public void navigation() throws InterruptedException {
        webDriver.navigate().to("https://demo.nopcommerce.com");
        Thread.sleep(3000);
    }

    @After
    public void exit(){
        webDriver.quit();
    }
}
