package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDD {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement statesDD = driver.findElement(By.name("States"));//using element it is a single dropdown to identify
        //we can use Select class because our element has select tag
        Select select = new Select(statesDD); //create an object inside () is the element
        //check if the select class has multiple values or no:
        boolean isMultiple = select.isMultiple();//true-multiple select Dropdown
        System.out.println(isMultiple);
        //only if the value is true we can interact with it:
        if (isMultiple) {
            List<WebElement> options = select.getOptions();
            //iterating through the web elements:
            for (WebElement option : options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);

            }
        }
        //select.deselectByIndex(5);
        select.deselectAll();
    }
}
