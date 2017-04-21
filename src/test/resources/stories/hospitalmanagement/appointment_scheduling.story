Meta:

Narrative:
As user of hospital management system
I want to schedule an appointment between a patient and a doctor
So that the patient can visit the doctor

Scenario: Schedule a succesful appointment
Given that the user access to the appointment scheduling form
And the user enters a doctor <doctorId>
And the user enters a patient <patientId>
And the user select a date <date>
And the user register some observations <observations>
When the user saves the information entered
Then the confirmation message <message> is displayed in a new window
And the information entered is displayed
| date       | doctorId | doctorName | patientId | patientName | observations |
| 04/23/2017 | 1111     | Juan       | 9999      | Jose        | obs 1        |

Examples:
| doctorId | patientId | date       | observations | message                        |
| 1111     | 9999      | 04/23/2017 | obs 1        | Datos guardados correctamente. |

Scenario: Schedule an appointment with an unexisting doctor
Given that the user access to the appointment scheduling form
And the user enters a doctor <doctorId>
And the user enters a patient <patientId>
And the user select a date <date>
And the user register some observations <observations>
When the user saves the information entered
Then the confirmation message <message> is displayed in a new window
And the information entered is displayed
| date       | doctorId | doctorName | patientId | patientName | observations |
| 04/24/2017 | 1234     |            | 9999      | Jose        | obs 1        |

Examples:
| doctorId | patientId | date       | observations | message                                                                    |
| 1234     | 9999      | 04/24/2017 | obs 1        | El campo 'Documento de identidad' no se encuentra entre nuestros doctores. |

Scenario: Schedule an appointment with an unexisting patient
Given that the user access to the appointment scheduling form
And the user enters a doctor <doctorId>
And the user enters a patient <patientId>
And the user select a date <date>
And the user register some observations <observations>
When the user saves the information entered
Then the confirmation message <message> is displayed in a new window
And the information entered is displayed
| date       | doctorId | doctorName | patientId | patientName | observations |
| 04/26/2017 | 1111     | Juan       | 1234      |             | obs 1        |

Examples:
| doctorId | patientId | date       | observations | message                                                                                 |
| 1111     | 1234      | 04/26/2017 | obs 1        | El campo 'Documento de identidad' no se encuentra entre nuestros pacientes registrados. |

Scenario: Schedule an appointment with an invalid date
Given that the user access to the appointment scheduling form
And the user enters a doctor <doctorId>
And the user enters a patient <patientId>
And the user select a date <date>
And the user register some observations <observations>
When the user saves the information entered
Then the confirmation message <message> is displayed in a new window
And the information entered is displayed
| date       | doctorId | doctorName | patientId | patientName | observations |
| 04/10/2017 | 1111     | Juan       | 9999      | Jose        | obs 1        |

Examples:
| doctorId | patientId | date       | observations | message                 |
| 1111     | 9999      | 04/26/2017 | obs 1        | Fecha de cita no valida |

