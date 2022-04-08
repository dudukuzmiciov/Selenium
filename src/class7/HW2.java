package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*navigate to http://www.uitestpractice.com/Students/Contact
     click on the link, get text and print out in the console*/
    public static String url ="http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("This is a Ajax link"));
        link.click();
        Thread.sleep(2000);
        WebElement text= driver.findElement(By.xpath("//div[@id='Result']"));
        String resultText=text.getText();
        System.out.println(resultText);
        driver.quit();
    }
}
