package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import page.ResultPage;
import page.SearchPage;


public class HotelStepsDef extends BaseUtil {
    public BaseUtil baseUtil;

    public HotelStepsDef(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("Browser is started")
    public void browserIsStarted() {
        driver = new ChromeDriver();
    }

    @Given("Open page Booking Search")
    public void openPageBookingSearch() {
        driver.get("https://www.booking.com/searchresults.en-gb.html");
        driver.manage().window().maximize();
    }

    @Given("Search hotel {string}")
    public void searchHotel(String hotelName) {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchFierlSetValue(hotelName);
        searchPage.searchButtonClick();
    }

    @When("Hotel {string} is displayed")
    public void hotelIsDisplayed(String nameHotel) {
        ResultPage resultPage = new ResultPage(driver);
        WebElement hotel = resultPage.getHotelName(nameHotel);
        Assert.assertTrue(hotel.isDisplayed(), "Hotel is not displayed");
    }

    @Then("Score hotel {string} is {string}")
    public void scoreHotelIsDisplayed(String nameHotel, String score) {
        ResultPage resultPage = new ResultPage(driver);
        WebElement scoreHotel = resultPage.getScoreHotel(nameHotel);
        Assert.assertEquals(scoreHotel.getText(), score, "Hotel score is not equal");
    }
}
