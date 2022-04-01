package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
       fill out the form
       click on register
        close the browser*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Dana");
        driver.findElement(By.id("customer.lastName")).sendKeys("Cuzmiciov");
        driver.findElement(By.name("customer.address.street")).sendKeys("5 Fifth Ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("10001");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("8484488808");
        driver.findElement(By.id("customer.ssn")).sendKeys("464-11-2222");
        driver.findElement(By.id("customer.username")).sendKeys("dana@yahoo.com");
        driver.findElement(By.name("customer.password")).sendKeys("7bvb7h.");
        driver.findElement(By.id("repeatedPassword")).sendKeys("7bvb7h.");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
