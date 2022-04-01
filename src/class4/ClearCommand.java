package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username =driver.findElement(By.id("ctl00_MainContent_username"));//username /we get an element in return.
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password")); //password
        password.sendKeys("test");
        WebElement loginButton= driver.findElement(By.className("button"));

        //CLEAR USER NAME AND PASSWORD:
        Thread.sleep(3000);
        username.clear(); //so for future, this codes will  clear the texts we insearted before
        password.clear(); //(in lines15,17) so we can add our  own texts
        driver.quit();
        // So we assigned (line 14 and  16) and created one variable that we can reuse in future
    }
}
