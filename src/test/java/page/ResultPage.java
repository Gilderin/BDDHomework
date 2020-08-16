package page;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waiters;

public class ResultPage {
    public WebDriver driver;
    private String nameHotel = "//span[contains(text(),'replace')]";
    private String hotelScore = "//span[contains(text(),'replace')]/ancestor::" +
            "div[@class='sr_item_content sr_item_content_slider_wrapper ']//div[@aria-label]";

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHotelName(String name) {
        Waiters waiters = new Waiters(BaseUtil.driver);
        String tmpNameHotel = nameHotel.replace("replace", name);
        waiters.waitForVisibility(By.xpath(tmpNameHotel));
        return driver.findElement(By.xpath(tmpNameHotel));
    }

    public WebElement getScoreHotel(String name) {
        Waiters waiters = new Waiters(BaseUtil.driver);
        String tmpHotelScore = hotelScore.replace("replace", name);
        waiters.waitForVisibility(By.xpath(tmpHotelScore));
        return driver.findElement(By.xpath(tmpHotelScore));
    }
}
