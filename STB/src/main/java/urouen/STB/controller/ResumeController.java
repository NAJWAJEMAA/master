package urouen.STB.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import urouen.STB.model.StbType;
import urouen.STB.service.STBService;

@Controller
public class ResumeController {
	STBService service=new STBService();

	@ResponseBody
	@RequestMapping(value="/resumer",method = RequestMethod.GET)
	public String display() {
		
		return "redirect:resume";
	}

	
	
	@RequestMapping(value = "/resumer/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<StbType> getStbById(@PathVariable("id") int id) {
		
	return service.searchStbById(id);
	}

}
