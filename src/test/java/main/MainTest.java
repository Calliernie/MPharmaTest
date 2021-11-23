package main;

import org.junit.Test;
import pages.PatientCreationPage;

public class MainTest extends Setup{
    PatientCreationPage createPatient;

    @Test
    public void createNewPatient() throws InterruptedException {
        //adding a new patient to the database
        createPatient = new PatientCreationPage(driver);
        createPatient.typeFirstName();
        createPatient.typeMiddleName();
        createPatient.typeLastName();
        createPatient.typePhoneNumber();
        createPatient.typeDateOfBirth();
        createPatient.typeAddress();
        createPatient.clickAddNewUserButton();

        //checking the details of the added patient
        createPatient.checkCreatedPatientName();
        createPatient.checkCreatedPatientAddress();
        createPatient.checkCreatedPatientDateOfBirth();

        Thread.sleep(5000);
    }
}
