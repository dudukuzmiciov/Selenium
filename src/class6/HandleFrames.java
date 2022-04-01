package class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 forever");

        driver.switchTo().defaultContent(); //this will get the focus back manually if we moved on doing something
        // else, back on the focus frame/page

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        alert.accept();


        //now switch back to that iframe using a different method
        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to frame");
        //switch back to default:
        driver.switchTo().defaultContent();

        WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("hold your horses");


    }
}
