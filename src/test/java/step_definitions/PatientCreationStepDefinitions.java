package step_definitions;

import config.Setup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.PatientCreationPageLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientCreationStepDefinitions extends Setup {
    WebDriver driver = getDriver();
    PatientCreationPageLocators locators = new PatientCreationPageLocators();

    private String firstName = "Ernest";
    private String middleName = "Kwame";
    private String lastName = "Amuzu";
    private String phoneNumber = "0543273508";
    private String dateOfBirth = "04181992";
    private String address = "C/O RUTH ESI AMUZU, U.P.O.BOX 63, KNUST - KUMASI,GHANA";
    private String fullName = firstName + " " + middleName + " " + lastName;

    @Given("I type the patient's first name")
    public void typeFirstName() {
        driver.findElement(
                By.xpath(locators.getFirstName_xpath())).sendKeys(firstName);
    }

    @And("I type the patient's middle name")
    public void typeMiddleName() {
        driver.findElement(
                By.xpath(locators.getMiddleName_xpath())).sendKeys(middleName);
    }

    @And("I type the patient's last name")
    public void typeLastName() {
        driver.findElement(
                By.xpath(locators.getLastName_xpath())).sendKeys(lastName);
    }

    @And("I type the patient's phone number")
    public void typePhoneNumber() {
        driver.findElement(
                By.xpath(locators.getPhoneNumber_xpath())).sendKeys(phoneNumber);
    }

    @And("I type the patient's date of birth")
    public void typeDateOfBirth() {
        driver.findElement(
                By.xpath(locators.getDateOfBirth_xpath())).sendKeys(dateOfBirth);
    }

    @And("I type the patient's address")
    public void typeAddress() {
        driver.findElement(
                By.xpath(locators.getAddress_xpath())).sendKeys(address);
    }

    @When("I click on the add new user button")
    public void clickAddNewUserButton() {
        driver.findElement(
                By.xpath(locators.getAddNewUserButton_xpath())).click();
    }

    @Then("I should see the added patient's full name")
    public void checkCreatedPatientName() {
        Assert.assertEquals(fullName, driver.findElement(By.xpath(locators.getCreatedUserFullName_xpath())).getText());
    }

    @And("I should see the added patient's address")
    public void checkCreatedPatientAddress() {
        Assert.assertTrue(driver.findElement(By.xpath(locators.getCreatedUserAddress())).getText().contains(address));
    }

    @And("I should see the added patient's date of birth")
    public void checkCreatedPatientDateOfBirth() throws InterruptedException {
        String month = dateOfBirth.substring(0, 2);
        String day = dateOfBirth.substring(2, 4);
        String year = dateOfBirth.substring(4, 8);

        System.out.println(formatDay(day));
        System.out.println(getMonth(month));
        System.out.println(year);

        String finalDate = formatDay(day) + " " + getMonth(month) + " " + year;
        String realDate = driver.findElement(By.xpath(locators.getCreatedUserDateOfBirth())).getText();
        Assert.assertTrue(realDate.contains(finalDate));
        Thread.sleep(5000);
    }

    public String formatDay(String day) {
        if (Integer.valueOf(day) >= 10 && Integer.valueOf(day) <= 20) {
            return day + "th";
        }
        switch (Integer.valueOf(day) % 10) {
            case 1:
                return day + "st";
            case 2:
                return day + "nd";
            case 3:
                return day + "rd";
            default:
                return day + "th";
        }
    }

    public String getMonth(String month) {
        switch (Integer.valueOf(month)) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Wrong month " + month;
        }
    }
}
