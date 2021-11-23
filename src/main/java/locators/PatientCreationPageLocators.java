package locators;

import org.openqa.selenium.WebDriver;

public class PatientCreationPageLocators {
    private WebDriver driver;
    //locators for targeting input elements while adding a new patient
    private String firstName_name = "firstName";
    public String middleName_name = "middleName";
    private String lastName_name = "lastName";
    private String phoneNumber_name = "phoneNumber";
    private String dateOfBirth_name = "dob";
    private String address_xpath = "//*[@id=\"root\"]/div/div[1]/main/div[4]/textarea";
    private String addNewUserButton_xpath = "//*[@id=\"root\"]/div/div[1]/div/a";

    //locators for checking the newly added patient
    private String createdUserFullName_xpath = "//*[@id=\"root\"]/div/div[2]/main/div[1]/div[2]/h4";
    private String createdUserAddress = "//*[@id=\"root\"]/div/div[2]/main/div[1]/div[2]/p[1]";
    private String createdUserDateOfBirth = "//*[@id=\"root\"]/div/div[2]/main/div[1]/div[2]/p[2]";

    public String getFirstName_name() {
        return firstName_name;
    }

    public String getMiddleName_name() {
        return middleName_name;
    }

    public String getLastName_name() {
        return lastName_name;
    }

    public String getPhoneNumber_name() {
        return phoneNumber_name;
    }

    public String getDateOfBirth_name() {
        return dateOfBirth_name;
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
