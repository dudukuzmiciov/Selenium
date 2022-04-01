package class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http:/fb.com");
        //driver.manage().window().maximize();
        String title=driver.getTitle(); //GET TITLE
        String expectedTitle="Facebook - Log In or Sign Up";
        if(title.equals(expectedTitle)){
            System.out.println("Title is Correct");
        }else{
            System.out.println("Title is Incorrect");
        }
        driver.quit();
    }
}
