package atmosol.StepDef;

import atmosol.ObjectRepo.CitySelectPageObjectRepo;
import atmosol.Utils.DriverManager;
import atmosol.Utils.illegalLocatorException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ConsolidatedStep {

    WebDriver driver;

    @Given("I launch the application")
    public void i_launch_the_application() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        driver = DriverManager.getDriver();

        driver.get("https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732");
        driver.manage().window().maximize();




    }
    @Given("I enter the {string} and {string}")
    public void i_enter_the_and(String fromCity, String toCity) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);
        Select fromDropdown = new Select(objCitySelect.FromCity);
        fromDropdown.selectByVisibleText(fromCity);

//        CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);
        Select toDropdown = new Select(objCitySelect.ToCity);
        toDropdown.selectByVisibleText(toCity);

        objCitySelect.FindFlightBtn.click();







    }
    @Given("I validate the title of the page")
    public void i_validate_the_title_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        WebElement HeadingElement = driver.findElement(By.xpath("//h3"));




        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(HeadingElement));

        String ActualText = HeadingElement.getText();

        String ExpectedText = "25 of 2875 Transactions";

        System.out.println(ActualText);

        Assert.assertEquals(ActualText, ExpectedText);
    }

    @Then("I Click on the ChooseThisFlight Button for the lowest price")
    public void i_click_on_the_choose_this_flight_button_for_the_lowest_price() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);
    objCitySelect.ChooseFligth.click();

    }
    @Then("I validate the Total cost is present")
    public void i_validate_the_total_cost_is_present() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);
    Boolean status = objCitySelect.totalCost.isDisplayed();

    Assert.assertTrue(status);
    }
    @Then("I click on the purchaseFlight button")
    public void i_click_on_the_purchase_flight_button() throws illegalLocatorException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        try{
            CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);


            objCitySelect.purchaseFligth.click();

        } catch (Exception e ){
            throw new illegalLocatorException("Locator is incorrect");

        }

    }
    @Then("the ID should be displayed")
    public void the_id_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);


        String bookinID = objCitySelect.getBookingID().getText();


        System.out.println(bookinID+" is the Booking ID generated");


     driver.quit();
    }

    @Then("I validate the destination of the week")
    public void iValidateTheDestinationOfTheWeek() {

        CitySelectPageObjectRepo objCitySelect = new CitySelectPageObjectRepo(driver);
        objCitySelect.DestinationLink.click();

//        ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
//
//        driver.switchTo().window(allTabs.get(1));

        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains("vacation")){
            Assert.assertTrue(Boolean.TRUE);

        } else{
            Assert.assertTrue(Boolean.FALSE);

        }

        driver.navigate().back();




    }
}
