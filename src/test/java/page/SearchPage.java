package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    public WebDriver driver;
    private By SEARCHFIELDSELECTOR = By.id("ss");
    private By SEARCHBUTTONSELECTOR = By.xpath("//button[@data-sb-id]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFierlSetValue(String value) {
        driver.findElement(SEARCHFIELDSELECTOR).click();
        driver.findElement(SEARCHFIELDSELECTOR).sendKeys(value);
    }

    public void searchButtonClick() {
        driver.findElement(SEARCHBUTTONSELECTOR).click();
    }
}
