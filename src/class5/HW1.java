package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        /*TC 1: Facebook dropdown verification.Open chrome browser.Go to "https://www.facebook.com"
        click on create new account. Verify: month dd has 12 month options .day dd has 31 day options.
        year dd has 115 year options. Select your date of birth. Quit browser */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);

        //get the desired dropdown:
         WebElement daysoption = driver.findElement(By.cssSelector("select#day"));
        //use seleenium select class:
        Select days=new Select((daysoption));
        //select a particular value of the day:
        days.selectByValue("5");
        Thread.sleep(2000);
        //select by index:
        days.selectByIndex(0);//this will select day one
        Thread.sleep(2000);
        days.selectByVisibleText("25");

        //print all  the options of the dropdown:
        //get all the options using select class:
        List<WebElement> options=days.getOptions();

        for(WebElement option:options){
            System.out.println(option.getText());

            //to get a value we use getAtribute method:
            //option.getAttribute("value");

        }

    }
}
