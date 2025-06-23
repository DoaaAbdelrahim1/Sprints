package org.example;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")).click();//        driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-58\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
        driver.findElement(By.id("product-addtocart-button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("tester1@tester.com");
        driver.findElement(By.name("firstname")).sendKeys("Doaa");
        driver.findElement(By.name("lastname")).sendKeys("Abdelrahim");
        driver.findElement(By.xpath("//*[@id=\"YAMBQ8J\"]")).sendKeys("Maadi");
        driver.findElement(By.xpath("//*[@id=\"NDS8A7B\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"DL2WX4P\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"V5PSDVV\"]")).click();
        driver.findElement(By.name("telephone")).sendKeys("012345678");
        driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();


        //to search item :
//        WebElement searchbox =driver.findElement(By.name("q"));
//        searchbox.sendKeys("Bag");
//        searchbox.submit();


        }
    }
