package atmosol.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class rfpio {

    public static <List> void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.amazon.in");

       java.util.List<WebElement> firstColElementList =  driver.findElements(By.xpath("//tr[1]/td"));
       Boolean status = false;
        String expectedText = "Venkatesh";


       for(WebElement ele : firstColElementList){
           if(ele.getText().contains(expectedText)){
               status = true;

           }

       }



        Assert.assertTrue(status);

       String parent = driver.getWindowHandle();

       driver.findElement(By.xpath("//button")).click(); //open new tab

        java.util.List<String> allTabs = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(allTabs.get(1));

        driver.switchTo().window(parent);




    }

}
