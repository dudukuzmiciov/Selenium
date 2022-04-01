package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
    public static void main(String[] args) {
        /**
         * Task
         * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify
         * logout
         * close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //Now "inspect" the page:

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester"); //username
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"); //password
        driver.findElement(By.className("button")).click(); //log in button

        String title= driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Title is Correct");
        }else{
            System.out.println("Title is not Correct");

        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
