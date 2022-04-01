package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*navigate to fb.com
     click on create new account
     fill up all the textboxes
     click on sign up button
     close the pop up
     close the browser*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Dana");
        driver.findElement(By.name("lastname")).sendKeys("Cuzmiciov");
        driver.findElement(By.name("reg_email__")).sendKeys("876-907-7799");
        driver.findElement(By.id("password_step_input")).sendKeys("hiouy9.");
        driver.findElement(By.id("month")).sendKeys("March");
        driver.findElement(By.id("day")).sendKeys("01");
        driver.findElement(By.id("year")).sendKeys("2010");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.quit();




    }
}
