package cl.fullstackjava.model.service;

import java.util.List;

import cl.fullstackjava.model.dto.Patient;
import cl.fullstackjava.model.response.Response;

public interface PatientService {
	Response<Void> createPatient(Patient patient);
	Response<List<Patient>> getAllPatients();
	Response<Patient> getPatientById(int id);
	Response<Void> updatePatient(Patient patient);
	Response<Void> deletePatient(int id);
}
