package cl.fullstackjava.model.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.fullstackjava.model.Gender;
import cl.fullstackjava.model.dto.Patient;
import cl.fullstackjava.model.response.Response;

@Service
public class PatientServiceImpl implements PatientService {
	
	// Lista de pacientes simulada
	private List<Patient> patients = new ArrayList<>();
	
	
	public PatientServiceImpl() {
		patients.add(new Patient(1, "Juan", "Perez", Gender.MALE, LocalDate.of(2000, 5, 15), "El Aromo 123", "111111111-1", "juan.p@mail.com", LocalDate.of(2024, 7, 15), LocalDate.of(2024, 7, 24), "COVID-19"));
		patients.add(new Patient(2, "María", "Gonzales", Gender.FEMALE, LocalDate.of(1980, 7, 4), "Arturo Prat 888", "222222222-2", "maria.g@mail.com", LocalDate.of(2024, 7, 15), null, "Amigdalitis"));
		patients.add(new Patient(3, "Andrez", "Muñoz", Gender.MALE, LocalDate.of(2004, 9, 18), "Arturo Prat 888", "333333333-3", "andres.m@mail.com", LocalDate.now(), null, "COVID-19"));
		patients.add(new Patient(4, "Carlos", "Machuca", Gender.MALE, LocalDate.of(1995, 3, 10), "Las Palmeras 456", "444444444-4", "carlos.machuca@mail.com", LocalDate.of(2024, 7, 10), null, "Gripe"));
		patients.add(new Patient(5, "Ana", "Soto", Gender.FEMALE, LocalDate.of(1990, 1, 22), "Los Robles 789", "555555555-5", "ana.soto@mail.com", LocalDate.of(2024, 7, 11), null, "Migraña"));
		patients.add(new Patient(6, "Pedro", "Gómez", Gender.MALE, LocalDate.of(1985, 12, 5), "Av. Libertador 1010", "666666666-6", "pedro.gomez@mail.com", LocalDate.of(2024, 7, 12), LocalDate.of(2024, 7, 18), "Fractura de pierna"));
	}

	@Override
	public Response<Void> createPatient(Patient patient) {
		return null;
	}

	@Override
	public Response<List<Patient>> getAllPatients() {
		return new Response<>(true, "Lista de paciente leida correctamente", patients);
	}

	@Override
	public Response<Patient> getPatientById(int id) {
		return null;
	}

	@Override
	public Response<Void> updatePatient(Patient patient) {
		return null;
	}

	@Override
	public Response<Void> deletePatient(int id) {
		return null;
	}

}
