package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class DDwithIterator {
    //DD-DROP DOWN
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement departmentsDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(departmentsDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);
    //Single select of amazon (the search department:
        if(!isMultiple) {
            //get all options and store them in a list of web elements:
            List<WebElement> options = select.getOptions();
            //iterating through elements:
            Iterator<WebElement> it =options.iterator();

            while(it.hasNext()){
                WebElement ddOption = it.next();
                String optionText = ddOption.getText(); //get all departments
                System.out.println(optionText); // print all departments
            }
        }

    }
}
