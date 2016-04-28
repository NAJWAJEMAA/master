package urouen.STB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(value = "/resumer")
public class STBController {

	
	@RequestMapping(value = "/resumer/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String displayResumeWithId(@PathVariable("n") String id) {
		
		
		
		return "accueil";
	}

}
