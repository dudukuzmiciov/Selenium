package reviewClass2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement femaleBtn = driver.findElement(By.xpath("//input[@value='Female'and@name='optradio']"));
        //check if the radio button is enabled
        System.out.println("the female radio button is enabled "+femaleBtn.isEnabled());
        //check if the radio btn female is displayed:
        System.out.println("the female radio btn is displayed "+femaleBtn.isDisplayed());
        //check if its selected or not
        System.out.println("the female radio btn is selected "+femaleBtn.isSelected());

        //if the button is not selected then click on it
        if (!femaleBtn.isSelected()){
            femaleBtn.click();
        }
        //check the status of selection again
        System.out.println("the female radio btn is selected "+femaleBtn.isSelected());

        //to get all the links in the current webpage:
       List<WebElement> links = driver.findElements(By.tagName("a"));

       //get that specific link out of the links list
       for(WebElement link:links){
           //System.out.println(link.getText()); //we will get a list with all links including blank spaces
           String name = link.getText();
           if(!name.isEmpty()){
               System.out.println(name);
           }
       }





    }
}
