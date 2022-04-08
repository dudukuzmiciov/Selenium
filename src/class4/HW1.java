package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username and password (username - Admin, password - Hum@nhrm123)
    //Click on login button
    //Then verify Syntax Logo is displayed.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//set property identify the driver u'll use
        WebDriver driver = new ChromeDriver();//this is launging browser/ creating an obj of the driver
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name ='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logInButton = driver.findElement(By.cssSelector("input#btnLogin"));
        logInButton.click();

        WebElement syntaxLogo = driver.findElement(By.xpath("//img[@alt = 'OrangeHRM']"));
        boolean logo = syntaxLogo.isDisplayed();
        System.out.println("Syntax Logo is displayed - "+logo);


    }
}
