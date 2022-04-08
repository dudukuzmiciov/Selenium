package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    //HRMS Application Negative Login:
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text "Password cannot be empty" is displayed.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//set property identify the driver u'll use
        WebDriver driver = new ChromeDriver();//this is launging browser/ creating an obj of the driver
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement logInButton = driver.findElement(By.cssSelector("input#btnLogin"));
        logInButton.click();

        WebElement invalidPassword = driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(invalidPassword.getText());

        Thread.sleep(2000);
        driver.quit();




    }
}
