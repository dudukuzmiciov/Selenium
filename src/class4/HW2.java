package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    //Amazon link count:
    //Open chrome browser
    //Go to "https://www.amazon.com/"
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//set property identify the driver u'll use
        WebDriver driver = new ChromeDriver();//this is launging browser/ creating an obj of the driver
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a")); //a stands for links //a to find how many
        System.out.println("Number of links " + allLinks.size());

        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLink=link.getAttribute("href"); //href is the link tag

            if(!linkText.isEmpty()){
                System.out.println(linkText+fullLink);
            }
        }
        driver.quit();
    }
}
