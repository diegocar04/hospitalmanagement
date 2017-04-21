Meta:

Narrative:
As user of hospital management system
I want to schedule an appointment between a patient and a doctor
So that the patient can visit the doctor

Scenario: Schedule a succesful appointment
Given that the user access to the appointment scheduling form
And the user enters an existing doctor <doctorId>
And the user enters an existing patient <patientId>
And the user select a valid date <date>
And the user register some observations <observations>
When the user saves the information entered
Then the confirmation message <message> is displayed in a new window
And the information entered is displayed
| date       | doctorId | doctorName | patientId | patientName | observations |
| 04/23/2017 | 1111     | Juan       | 9999      | Jose        | obs 1        |

Examples:
| doctorId | patientId | date       | observations | message                        |
| 1111     | 9999      | 04/23/2017 | obs 1        | Datos guardados correctamente. |