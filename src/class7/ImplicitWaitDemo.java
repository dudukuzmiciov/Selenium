package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static String url = "https://syntaxprojects.com/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //get actually waits fully until page is loaded

        //managing the time out: implicit kind of time out:
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //time units specify what is 20, seconds,
        // hours, days etc. sets the wait for the element we are searching. this like will take care of any searches performed
        //in this class. HAS TO BE ADDED AFTER GETTING THE URL (line16)

        WebElement startPracticingButton = driver.findElement(By.id("btn_basic_example"));
        startPracticingButton.click();


    }
}
