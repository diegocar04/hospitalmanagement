package com.sura.guidewire.policycenter.steps;

import com.sura.guidewire.policycenter.pages.AppointmentSchedulingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class AppointmentSchedulingSteps extends ScenarioSteps {

    AppointmentSchedulingPage appointmentSchedulingPage;

    static final String APP_URL = "http://automatizacion.herokuapp.com/dcardona/appointmentScheduling";

    @Step
    public void openSchedulingAppointmentForm() {
        this.appointmentSchedulingPage.open();
    }

    @Step
    public void inputDoctorId(String doctorId) {
        appointmentSchedulingPage.inputDoctorId(doctorId);
    }

    @Step
    public void inputPatientId(String patientId) {
        appointmentSchedulingPage.inputPatientId(patientId);
    }

    @Step
    public void inputAppointmentDate(String date) {
        appointmentSchedulingPage.inputAppointmentDate(date);
    }

    @Step
    public void inputObservations(String observations) {
        appointmentSchedulingPage.inputObservations(observations);
    }

    @Step
    public void saveAppointment() {
        appointmentSchedulingPage.saveAppointment();
    }

    @Step
    public void validateConfirmationMessage(String message) {
        appointmentSchedulingPage.validateConfirmationMessage(message);
    }

    @Step
    public void validateAppointmentInformation(ExamplesTable appointmentData) {
        appointmentSchedulingPage.validateAppointmentInformation(appointmentData);
    }
}
