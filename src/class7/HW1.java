package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify (compare) the titles for each page
    Print out the title of the all pages */
        public static String url ="https://demoqa.com/browser-windows";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //time units specify what is 20, seconds,
        String mainPageHandle = driver.getWindowHandle();
        /*click on New Tab and print the text from new tab in the console
        click on New Window and print the text from new window in the console
         click on New Window Message and print the text from new window in the console
         */
        WebElement newTab = driver.findElement(By.cssSelector("button[id= 'tabButton']"));
        newTab.click();
        System.out.println(newTab.getText());
        WebElement newWindow = driver.findElement(By.xpath("//button[text() = 'New Window']"));
        newWindow.click();
        System.out.println(newWindow.getText());
        WebElement newWindowMessage = driver.findElement(By.cssSelector("button[id= 'messageWindowButton']"));
        newWindowMessage.click();
        System.out.println(newWindowMessage.getText());

        //get everything together and store in a set:
        Set<String> allWindowHandles = driver.getWindowHandles(); //this set has all the windows
        //iterate through each and every window and get their title and print it out in console:
        Iterator<String> iterate = allWindowHandles.iterator();
        while(iterate.hasNext()){
            String handle=iterate.next(); //move one step forward
            //get the 3 child tabs
            if(!mainPageHandle.equals(handle)){
            driver.switchTo().window(handle);

            String title = driver.getTitle(); //get title of each window
                System.out.println(title);
                //driver.close();
            }
        }
        //driver.switchTo().window(mainPageHandle);
    }

}
