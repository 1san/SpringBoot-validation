package com.san.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.san.model.User;
import com.san.repository.UserRepository;

@Controller
public class HomeController {
	@Autowired
	UserRepository userRepo;

	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/register")
	public String register(Model m) {
		m.addAttribute("user", new User());
		return "register";
	}

	@RequestMapping(value = "/addUser")
	public String addUser(@Valid @ModelAttribute("user") User user, BindingResult r) {
		if(r.hasErrors()) {return "register";}
		System.out.println(user.toString());
		userRepo.save(user);
		return "home";
	}

	@RequestMapping(value = "/userDetails")
	public String userDetails(Model m) {
		m.addAttribute("user", userRepo.findAll());
		return "userDetails";
	}

	@RequestMapping(value = "/delete/{id}")
	public String delete(@PathVariable(name = "id") long id) {
		userRepo.deleteById(id);
		return "redirect:/userDetails";
	}

	@RequestMapping(value = "/update/{id}")
	public String update(@PathVariable(name = "id") long id, Model m) {
		m.addAttribute("users", userRepo.getOne(id));
		m.addAttribute("user",new User());
		return "updatePage";
	}

	@RequestMapping(value = "/update/submitUpdate")
	public String submitUpdate(@ModelAttribute("user") User user, BindingResult r) {
		userRepo.saveAndFlush(user);
		return "redirect:/userDetails";
	}
}