package atmosol.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowHandling {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("url.com");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//div")).click(); // opens multiple window

        Set<String> allHandles = driver.getWindowHandles();

        for(String handle : allHandles){
            driver.switchTo().window(handle);
            if(driver.getTitle().contains("expectedTitle")){
                //operation

                Select selection = new Select(driver.findElement(By.xpath("//select[@id='country']")));
                selection.selectByVisibleText("VisibleOption");
                selection.selectByIndex(1);
                selection.selectByValue("valueText");

                driver.switchTo().defaultContent();

            }

        }



//        git clone url
//                git checkout -b branchname
//            git add.
//        git commit -m commitmessage
//            git push origin



    }
}
