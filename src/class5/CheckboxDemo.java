package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
   public static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        //locating  checkboxes and storing them in the list
        List<WebElement> optionCheckBoxes=driver.findElements(By.cssSelector("input[class='cb1-element']"));
        int size= optionCheckBoxes.size();
        System.out.println(size);

        //looping through each element from the list line18
        for (WebElement option : optionCheckBoxes) {

            String checkBoxTValue = option.getAttribute("value");
            if(checkBoxTValue.equals("Option-2")){
                option.click();
                break;
            }
        }

    }

}
