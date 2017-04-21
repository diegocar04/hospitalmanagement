package com.sura.guidewire.policycenter.definitions;

import com.sura.guidewire.policycenter.steps.AppointmentSchedulingSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class AppointmentSchedulingDefinitions {

    @Steps
    private AppointmentSchedulingSteps appointmentSchedulingSteps;

    @Given("that the user access to the appointment scheduling form")
    public void givenThatTheUserAccessToTheSchedulingAppointmentForm() {
        appointmentSchedulingSteps.openSchedulingAppointmentForm();
    }

    @Given("the user enters a doctor <doctorId>")
    public void givenTheUserEntersAnExistingDoctor(@Named("doctorId") String doctorId) {
        appointmentSchedulingSteps.inputDoctorId(doctorId);
    }

    @Given("the user enters a patient <patientId>")
    public void givenTheUserEntersAnExistingPatient(@Named("patientId") String patientId) {
        appointmentSchedulingSteps.inputPatientId(patientId);
    }

    @Given("the user select a date <date>")
    public void whenTheUserSelectAValidDatedate(@Named("date") String date) {
        appointmentSchedulingSteps.inputAppointmentDate(date);
    }

    @Given("the user register some observations <observations>")
    public void whenInputsSomeObservationsobservations(@Named("observations") String observations) {
        appointmentSchedulingSteps.inputObservations(observations);
    }

    @When("the user saves the information entered")
    public void whenSaveTheInformationEntered() {
        appointmentSchedulingSteps.saveAppointment();
    }

    @Then("the confirmation message <message> is displayed in a new window")
    public void thenTheConfirmationMessagemessageIsDisplayedInANewWindow(@Named("message") String message) {
        appointmentSchedulingSteps.validateConfirmationMessage(message);
    }

    @Then("the information entered is displayed $appointmentData")
    public void thenTheInformationEnteredIsDisplayed(ExamplesTable appointmentData){
         appointmentSchedulingSteps.validateAppointmentInformation(appointmentData);
    }
}
