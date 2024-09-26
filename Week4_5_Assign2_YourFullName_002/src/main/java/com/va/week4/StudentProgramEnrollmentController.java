package com.va.week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.va.week4.repo.StudentRepoInterface;

@Controller
public class StudentProgramEnrollmentController implements CommandLineRunner {

	@Autowired
	StudentRepoInterface repo;

	@PostMapping("/submitstudent")
	// @PostMapping("/studentForm")
	// @PostMapping("/programForm")
	// @PostMapping("/enrrollForm")
	public String submitstudent(@ModelAttribute Student student, Model model) {

		// Process the student and prepare data for the show-student.html page

		model.addAttribute("userName", student.getFirstName());
		// do for others!!!.. as Entity states.. 
		
		/*
		 * // model.addAttribute("email", student.getEmail()); //
		 * model.addAttribute("phoneNumber", student.getContactNumber()); //
		 * model.addAttribute("address", student.getAddressLine1() + ", " +
		 * student.getCity() + ", " + student.getProvince());
		 * 
		 * // student details model.addAttribute("productNumber",
		 * student.getProductNumber()); model.addAttribute("phoneBrand",
		 * student.getPhoneBrand()); model.addAttribute("phoneModel",
		 * student.getPhoneModel()); model.addAttribute("quantity",
		 * student.getQuantity()); model.addAttribute("totalPrice", student.getPrice());
		 */

	//	repo.save(new Student(model.addAttribute("userName", student.getFirstName()),));
/*
 * Modify the repo.save to attributes as entity demands.!
 */
		return "show-student";

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * //repo.save(null) // repo.save(new Student(5000, "YourName",
	 * "Java Developer..", 90000.00, 2));
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */

}
