package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        //check the checkbox:
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected " + checkbox1.isSelected());
        checkbox1.click();
        Thread.sleep(1000);
        //locate and print in console the text you get after selecting the checkbox:
        WebElement textelement = driver.findElement(By.xpath("//div[text()='Success - Check box is checked']"));
        System.out.println(textelement.getText());
        Thread.sleep(2000);
        //deselect the checkbox:
        checkbox1.click();

        //Multiple checkboxes
        //get all available options: select all (4 in this example) checkboxes:
        //find the atribute that will select all 4
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(2000);
        for (WebElement checkbox : checkboxes) {
            checkbox.click(); //deselect them all

        }
    }
}
