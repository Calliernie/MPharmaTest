package pages;

import locators.PatientCreationPageLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientCreationPage extends PatientCreationPageLocators {

    private WebDriver driver;
    private String firstName = "Ernest";
    private String middleName = "Kwame";
    private String lastName = "Amuzu";
    private String phoneNumber = "0543273508";
    private String dateOfBirth = "04181992";
    private String address = "C/O RUTH ESI AMUZU, U.P.O.BOX 63, KNUST - KUMASI,GHANA";
    private String fullName = firstName + " " + middleName + " " + lastName;

    public PatientCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeFirstName() {
        driver.findElement(
                By.name(getFirstName_name())).sendKeys(firstName);
    }

    public void typeMiddleName() {
        driver.findElement(
                By.name(getMiddleName_name())).sendKeys(middleName);
    }

    public void typeLastName() {
        driver.findElement(
                By.name(getLastName_name())).sendKeys(lastName);
    }

    public void typePhoneNumber() {
        driver.findElement(
                By.name(getPhoneNumber_name())).sendKeys(phoneNumber);
    }

    public void typeDateOfBirth() {
        driver.findElement(
                By.name(getDateOfBirth_name())).sendKeys(dateOfBirth);
    }

    public void typeAddress() {
        driver.findElement(
                By.xpath(getAddress_xpath())).sendKeys(address);
    }

    public void clickAddNewUserButton() {
        driver.findElement(
                By.xpath(getAddNewUserButton_xpath())).click();
    }

    public void checkCreatedPatientName() {
        Assert.assertEquals(fullName, driver.findElement(By.xpath(getCreatedUserFullName_xpath())).getText());
    }

    public void checkCreatedPatientAddress() {
        Assert.assertTrue(driver.findElement(By.xpath(getCreatedUserAddress())).getText().contains(address));
    }

    public void checkCreatedPatientDateOfBirth() {
        String month = dateOfBirth.substring(0, 2);
        String day = dateOfBirth.substring(2, 4);
        String year = dateOfBirth.substring(4, 8);

        System.out.println(formatDay(day));
        System.out.println(getMonth(month));
        System.out.println(year);

        String finalDate = formatDay(day) + " " + getMonth(month) + " " + year;
        String realDate = driver.findElement(By.xpath(getCreatedUserDateOfBirth())).getText();
        Assert.assertTrue(realDate.contains(finalDate));
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
