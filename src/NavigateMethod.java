import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//set property, we need to
        // know what driver we are using
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.google.com/?client=safari");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);//pause the execution for 2sec,not used in real life
        driver.navigate().refresh();
        //driver.close();//closing the current tab
        driver.quit();//close the whole browser



    }
}
