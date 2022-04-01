import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /* 1. launch the browser
     * 2. navigate to amazon website
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//always call this

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();//minor verification if the title is correct
        System.out.println(title+" "+url);
        driver.quit();

    }
}