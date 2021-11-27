package locators;

import config.Setup;
import org.openqa.selenium.WebDriver;

public class PatientCreationPageLocators extends Setup {
    WebDriver driver = getDriver();

    //locators for targeting input elements while adding a new patient
    private String firstName_xpath = "//input[@data-test-id='first-name']";
    public String middleName_xpath = "//input[@data-test-id='middle-name']";
    private String lastName_xpath = "//input[@data-test-id='last-name']";
    private String phoneNumber_xpath = "//input[@data-test-id='phone-number']";
    private String dateOfBirth_xpath = "//input[@data-test-id='dob']";
    private String address_xpath = "//textarea[@data-test-id='address']";
    private String addNewUserButton_xpath = "//a[@data-test-id='submit-btn']";

    //locators for checking the newly added patient
    private String createdUserFullName_xpath = "//*[@id=\"root\"]/div/div[2]/main/div[1]/div[2]/h4";
    private String createdUserAddress = "//*[@id=\"root\"]/div/div[2]/main/div[1]/div[2]/p[1]";
    private String createdUserDateOfBirth = "//*[@id=\"root\"]/div/div[2]/main/div[1]/div[2]/p[2]";

    public String getFirstName_xpath() {
        return firstName_xpath;
    }

    public String getMiddleName_xpath() {
        return middleName_xpath;
    }

    public String getLastName_xpath() {
        return lastName_xpath;
    }

    public String getPhoneNumber_xpath() {
        return phoneNumber_xpath;
    }

    public String getDateOfBirth_xpath() {
        return dateOfBirth_xpath;
    }

    public String getAddress_xpath() {
        return address_xpath;
    }

    public String getAddNewUserButton_xpath() {
        return addNewUserButton_xpath;
    }

    public String getCreatedUserFullName_xpath() {
        return createdUserFullName_xpath;
    }

    public String getCreatedUserAddress() {
        return createdUserAddress;
    }

    public String getCreatedUserDateOfBirth() {
        return createdUserDateOfBirth;
    }
}
