package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//setting up the properties
        WebDriver driver=new ChromeDriver();//launching the browser
        driver.get("https://www.ebay.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a")); //here we find all elements and store them in a container
        //our container is "List" "allLinks"-is the name we gave to that container
        System.out.println("Number of links "+allLinks.size()); //will print out how many links on the webpage are

        //Print all links in console from the container (line15) LIST OF WebElements
        for(WebElement link: allLinks){
            String linkText= link.getText(); //every time it loops it gets the text from getText() element
            //now each of those values printed in console have actual links!
            //this is how we will get printed ONLY THE LINKS:
            String fullLink=link.getAttribute("href");
            //System.out.println(linkText);
            //after line21 in console will get a long list including big empty spaces,those are
            //links with no text.
            if(!linkText.isEmpty()){
                System.out.println(linkText +"  "+fullLink); //with this code we get rid of all those "no text links"
                //empty spaces and only got the list of links with text (considering line 24 is not there yet)


            }
        }
    }
}
