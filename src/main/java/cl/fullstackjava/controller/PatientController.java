package cl.fullstackjava.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.fullstackjava.model.dto.Patient;
import cl.fullstackjava.model.response.Response;
import cl.fullstackjava.model.service.PatientService;

@Controller
@RequestMapping("/")
public class PatientController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);	
	private PatientService patientService;
		
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@GetMapping
	public String listPatients(Model model){
		Response<List<Patient>> response = patientService.getAllPatients();
		if(response.isSuccess()) {
			model.addAttribute("patients", response.getData());
			logger.info(response.getMessage());
		} else {
			model.addAttribute("error", response.getMessage());
			logger.error(response.getMessage());
		}
		logger.info("Redireccionando a la vista de lista de pacientes");
		return "patients";
	}

}
