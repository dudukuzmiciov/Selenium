package class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
    //will navigate to this website and handle each and every alert on web page
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //locate the alert and click on it:
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));//identify alert button
        simpleAlertButton.click(); //click on alert button
        //switch the focus otherwise the focus remains on the webpage not on the alert:
        Alert simpleAlert = driver.switchTo().alert();//alert object
        Thread.sleep(2000);
        simpleAlert.accept(); // handling simple alert

        //2nd alert
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        //switch the focus otherwise the focus remains on the webpage not on the alert:
        Alert confirmAlert = driver.switchTo().alert(); // switch the focus to alert
        //first we need to get the text that alert contains:
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();//cancel

        //identify/locate the prompt alert:
        WebElement promptAlertButton = driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        //switch the focus otherwise the focus remains on the webpage not on the alert:
        Alert promptAlert=driver.switchTo().alert();
        //send the keys(its the type of alert that requests to type in something before clicking ok so those are the Keys!:
        promptAlert.sendKeys("Batch 12 is the best");
        promptAlert.accept();






    }
}
