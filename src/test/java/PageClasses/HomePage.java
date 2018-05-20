package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	@FindBy(id = "tab-flight-tab-hp")
	WebElement flightTab;

	@FindBy(id = "flight-origin-hp-flight")
	WebElement flightOriginInput;

	@FindBy(id = "flight-destination-hp-flight")
	WebElement flightDestinationInput;

	@FindBy(id = "flight-departing-hp-flight")
	WebElement departingDate;

	@FindBy(id = "flight-returning-hp-flight")
	WebElement returningDate;

	@FindBy(id = "flight-adults-hp-flight")
	WebElement adults;

	@FindBy(id = "flight-children-hp-flight")
	WebElement children;

	@FindBy(css = ".btn-primary.btn-action.gcw-submit")
	WebElement search;

	@FindBy(css = ".alert.alert-error.validation-alert")
	WebElement alertpopup;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightTab() {
		flightTab.click();
	}

	public void inputOrigin() {
		flightOriginInput.sendKeys("Chicago");
	}

	public void inputDestination() {
		flightDestinationInput.sendKeys("Newyork");
	}

	public void departingDate() {
		departingDate.sendKeys("23-11-2018");
	}

	public void returningDate() {
		returningDate.sendKeys("23-11-2018");
	}

	public  void adults() {
		Select sel = new Select(adults);
		sel.selectByValue("2");
	}
	public void children() {
		Select sel = new Select(children);
		sel.selectByVisibleText("3");

	}
	public void clickSearch() {
		search.click();
	}
	public void alertpopup() {
		if(alertpopup.isDisplayed()) {System.out.println("alert to enter age of children");}
	}
}
