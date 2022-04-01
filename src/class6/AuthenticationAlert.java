package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                       //this kind of pup ups appear as a sign in pop up, and you cant actually inspect the page.
public class AuthenticationAlert {
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
                                //username:password@ /admin:admin@ (username and password are the same)
                                //we inserted that right between https://....and....the-inter..actual url
                                //this is how we handle an authentication alert, have username and password right before the url

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
