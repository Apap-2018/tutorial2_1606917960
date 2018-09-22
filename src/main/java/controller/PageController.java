package controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
	@RequestMapping("/viral")
	public String viral() {
		return "viral";
	}
	
	/**
	@RequestMapping(value = {"challenge", "/challenge/{name}"})
	public String challenge(@PathVariable Optional<String> name, Model model) {
		if (name.isPresent()) {
			model.addAttribute("name", name.get());
		}
		else {
			model.addAttribute("name", "KB");
		}
		return "challenge";
	}
	**/
	
	@RequestMapping("/challenge")
	public String challenge(@RequestParam(value="name", required=false, defaultValue="kiki") 
	String name, Model model) {
		model.addAttribute("name", name);
		return "challenge";
	}
	/**
	@RequestMapping(value= {"/challenge", "/challenge/{name}"})
	public String challengePath(@PathVariable Optional<String> name, Model model) {
		if (name.isPresent()) {
			model.addAttribute("name", name.get());
		}
		else {
			model.addAttribute("name", "KB");
		}
		return "challenge";
		//model.addAttribute("name", name);
		//return "challenge";
	}
	**/
	
	@RequestMapping("/generator")
	public String generator(@RequestParam(value="a", defaultValue="0") int a, 
			@RequestParam(value="b", defaultValue="0") int b, 
			Model model){
		
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		
		if (a<=1 && b<=1) {
			model.addAttribute("text", "hm");
		}
		else {
			String txt = "h";
			String final_text = "";
			
			if (a<1) {
				txt = "hm";
			}
			else {
				for (int i = 0; i<a; i++) {
					txt += "m";
				}
			}
			
			for (int j = 0; j<b; j++) {
				final_text += txt + " ";
			}
			model.addAttribute("text", final_text);
		}
		return "generator";
	}
	
}


