package reviewClass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //find the element and click on it:
        WebElement SimpleAlert=driver.findElement(By.xpath("//button[@onclick= 'myAlertFunction()']"));
        SimpleAlert.click();
        //handling the  alert:
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        // JS Alert:
        WebElement JSalert=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        JSalert.click();
        Thread.sleep(1000);
        driver.switchTo().alert();
        alert.sendKeys("hello everyone");
        alert.accept();





    }
}
