package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Contact;
import com.app.service.IContactService;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {
	@Autowired
	IContactService contactService;

	//@RequestMapping(value = { "/", "/addContact" }, method = RequestMethod.GET)
	 @GetMapping(value = {"/", "/addContact"})
	public String loadForm(Model model) {
		Contact c = new Contact();
		model.addAttribute("contact", c);
		return "contactInfo";

	}

	@PostMapping(value = "/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact c, Model model) {
		boolean isSaved = contactService.savecontact(c);
		if (isSaved) {
			model.addAttribute("succMsg", "Contact Saved");
		} else {
			model.addAttribute("errMsg", "Failed To Save Contact");

		}
		return "contactInfo";
	}
}
