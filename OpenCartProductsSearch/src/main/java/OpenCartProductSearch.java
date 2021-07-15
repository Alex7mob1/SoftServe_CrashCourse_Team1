import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class OpenCartProductSearch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/opencart/upload/");

        WebElement input = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        input.click();
        input.sendKeys("MacBook");

        input = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        input.click();

         }
}
