package com.sura.guidewire.policycenter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

@DefaultUrl("http://automatizacion.herokuapp.com/dcardona/appointmentScheduling")

public class AppointmentSchedulingPage extends PageObject {

    @FindBy(xpath = ".//*[@id='datepicker']")
    private WebElementFacade txtAppointmentDate;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/div[2]/input")
    private WebElementFacade txtPatientId;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/div[3]/input")
    private WebElementFacade txtDoctorId;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea")
    private WebElementFacade txtObservations;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/a")
    private WebElementFacade btnSave;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[1]/div/h1")
    private WebElementFacade lblPageTitle;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[2]/div[2]/p")
    private WebElementFacade lblConfirmationMessage;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/table/tbody/tr[1]/td[2]")
    private WebElementFacade lblAppointmentDate;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/table/tbody/tr[2]/td[2]")
    private WebElementFacade lblDoctorId;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/table/tbody/tr[3]/td[2]")
    private WebElementFacade lblDoctorName;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/table/tbody/tr[4]/td[2]")
    private WebElementFacade lblPatientId;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/table/tbody/tr[5]/td[2]")
    private WebElementFacade lblPatientName;
    @FindBy(xpath = ".//*[@id='page-wrapper']/div/div[3]/div/table/tbody/tr[6]/td[2]")
    private WebElementFacade lblObservations;

    public AppointmentSchedulingPage(WebDriver driver) {
        super(driver);
    }

    public void inputDoctorId(String doctorId) {
        txtDoctorId.sendKeys(doctorId);
    }

    public void inputPatientId(String patientId) {
        txtPatientId.sendKeys(patientId);
    }

    public void inputAppointmentDate(String date) {
        txtAppointmentDate.sendKeys(date);
    }

    public void inputObservations(String observations) {
        txtObservations.sendKeys(observations);
    }

    public void saveAppointment() {
        btnSave.click();
    }

    public void validateConfirmationMessage(String message) {
        String pageTitle = "Testing Dojo";
        //boolean validatePageTitle = lblPageTitle.getText().contains(pageTitle);
        //MatcherAssert.assertThat(validatePageTitle,Is.is(Matchers.equalTo(true)));
        MatcherAssert.assertThat(lblPageTitle.getText(), Matchers.containsString(pageTitle));
        MatcherAssert.assertThat(lblConfirmationMessage.getText(), Matchers.containsString(message));
    }

    public void validateAppointmentInformation(ExamplesTable appointmentData) {
        Map<String, String> appointmentInformation = appointmentData.getRows().get(0);
        MatcherAssert.assertThat(lblAppointmentDate.getText(), Is.is(Matchers.equalTo(appointmentInformation.get("date"))));
        MatcherAssert.assertThat(lblDoctorId.getText(), Is.is(Matchers.equalTo(appointmentInformation.get("doctorId"))));
        MatcherAssert.assertThat(lblDoctorName.getText(), Is.is(Matchers.equalTo(appointmentInformation.get("doctorName"))));
        MatcherAssert.assertThat(lblPatientId.getText(), Is.is(Matchers.equalTo(appointmentInformation.get("patientId"))));
        MatcherAssert.assertThat(lblPatientName.getText(), Is.is(Matchers.equalTo(appointmentInformation.get("patientName"))));
        MatcherAssert.assertThat(lblObservations.getText(), Is.is(Matchers.equalTo(appointmentInformation.get("observations"))));
    }
}
