package reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumReviewBasic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");//same as line 11
        //driver.navigate().to("https://www.gmail.com");//same as line 10
        //WebElement username = driver.findElement(By.id("userName"));
        //username.sendKeys("akbarakedabra");
        //username.clear();
        //username.sendKeys("fire");

        //driver.close();//line13 and 14 are the same except 13 will only close the tab,14 the whole driver
        //driver.quit();
        //ABSOLUTE XPATH REAL EX:
        //html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input

        WebElement username=driver.findElement(By.xpath("//input[@id= 'userName']"));
        username.sendKeys("hellothere");
    }
}
