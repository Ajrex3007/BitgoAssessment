package atmosol.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CitySelectPageObjectRepo {

    public CitySelectPageObjectRepo(WebDriver driver){
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath="//select[@name='fromPort']")
    public WebElement FromCity;


    @FindBy(xpath= "//select[@name='toPort']")
    public WebElement ToCity;

    @FindBy(xpath="//input[@value='Find Flights']")
    public WebElement FindFlightBtn;


    @FindBy(xpath="//a[contains(text(),'destination of the week')]")
    public WebElement DestinationLink;

    @FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
    public WebElement ChooseFligth;


    @FindBy(xpath="//p[contains(text(),'Total Cost:')]")
    public WebElement totalCost;

    @FindBy(xpath="//input[@value='Purchase Flight']")
//    @FindBy(xpath="//input[@value=' Flight']")
    public WebElement purchaseFligth;




    @FindBy(xpath="//td[text()='Id']//following-sibling::td")
    private WebElement BookingID;


    public WebElement getBookingID() {
        return BookingID;
    }




}
