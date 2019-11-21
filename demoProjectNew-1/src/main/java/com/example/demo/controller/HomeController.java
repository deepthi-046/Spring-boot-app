package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Student;
import com.example.demo.repository.StudentRepo;

//import antlr.collections.List;
@Controller
public class HomeController {
	@Autowired
	private StudentRepo repo;

		@GetMapping("/home")
		public String showHomePage() {
			
			System.out.print("ghfhgfhg");
			return "home";
			
		}
		@PostMapping("/success")
		public String succesPage() {
			return "success";
		}

		@PostMapping("/insert")
		public String showIndexPage(Student student,Model model) {
			
			model.addAttribute("s",student);
			repo.save(student);
			System.out.print(student.getPassword());
			return "success";
			
		}
		@GetMapping("insert/all")
		public String getStudents(Model model) {
			List<Student> slist=new ArrayList<Student>();
			slist=repo.findByUname("deepak");
			//slist=repo.findAll();
			model.addAttribute("slist",slist);
			return "view";
		}
		

}
