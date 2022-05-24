package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement registerTab(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }

    public WebElement loginTab(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    }

    public WebElement currencySwitcher(){
        return webDriver.findElement(By.id("customerCurrency"));
    }

    public WebElement selected(){ return webDriver.findElement
            (By.cssSelector("option[selected]"));
    }

    public WebElement category(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
    }

    public WebElement subCategory(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));
    }

    public WebElement searchField(){
        return webDriver.findElement(By.id("small-searchterms"));
    }

    public WebElement slide(String slideNumber){
        return webDriver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+slideNumber+")"));
    }

    public WebElement facebook(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
    }

    public WebElement twitter(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
    }

    public WebElement rss(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
    }

    public WebElement youtube(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
    }

    public WebElement wishPhone(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement shoppingPhone(){
        return webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]"));
    }

    public WebElement notificationMsg(){
        return webDriver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
    }

    public WebElement linkOnNotificationMsg(){
        return webDriver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
    }


}
