package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdown {
    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //identify drop down by id:
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        //create an object of a select class and place the drop down you want to interact with:
        Select select = new Select(categoriesDD);

        //since interacting with multiple values create a list, and create a container with all the options you will loop through
        List<WebElement> options = select.getOptions();
        for(WebElement option:options) { //advanced loop
            String optionText = option.getText(); //whenever we iterate through the elements we get the text
            System.out.println(optionText); //printed all options
        }

        select.selectByValue("search-alias=appliances");
    }
}
