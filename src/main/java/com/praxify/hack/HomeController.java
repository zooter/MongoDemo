package com.praxify.hack;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praxify.hack.DAO.SpringMongoConfig;
import com.praxify.hack.template.Patient;

import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
 	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticateUser(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
 	
 	
 	@RequestMapping(value = "/regForm", method = RequestMethod.GET)
	public String regForm(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "regForm";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "login";
	}
	
	
	@RequestMapping(value="/registerPatient",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
    public String addPatient(Model model){
        logger.info("Rest call to test Crud operations");
        Patient patient=new Patient("Ashwat", "Iyer","01-05-1989" ,"ashwathdr@gmail.com", new Date().toString(),"9738482973",  "4576");
        logger.info("Trying to save patient details: "+patient);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        mongoOperation.save(patient);
        List<Patient> patientList = mongoOperation.findAll(Patient.class);
        System.out.println("Patient Details :"+patientList.size());
        for(Patient pa : patientList){
        	
        	System.out.println(pa.toString());
        }
        logger.info("saved Patient is: "+mongoOperation.findAll(Patient.class));
        return "successPatientRegistration";
    }
    
	
	
}
