package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); //launch the browser (driver location)
        WebDriver driver= new ChromeDriver(); //creating the instance of chrome driver (object of the driver)
        driver.navigate().to("https://www.amazon.com");
        //navigate() can go back and forward and refresh and will keep the history of browser
        //get() waits for the page to fully load whereas navigate() will not
        //get() will not keep the history of the browser

        driver.manage().window().maximize();//same as next line but this one
        /*opens amazon page including the browsing bar on top.next line only
         opens google page and you can't open another next to it ->
        driver.manage().window().fullscreen();*/

        /*close() will close the current tab
        quit() will quit the whole browser
        fullscreen() will maximize the whole application
        maximize() will maximize browser and will have the control panel on top(back and forward, bookmarks etc)
         */
    }
}
