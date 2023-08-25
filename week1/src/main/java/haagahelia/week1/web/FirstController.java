package haagahelia.week1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller //KANNATTAA MUISTAA 
public class FirstController {
	
	@RequestMapping
	@ResponseBody
	public String showMainPage() {
		
		return "localhost:8080, it's great to be back(end) studying!";
	}
	
	@RequestMapping("index")
	@ResponseBody
	public String showIndex() {
		return "This is index page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContact() {
		return "This is contact page";
	}
	
	@RequestMapping("hello") //http://localhost:8080/hello?yourname=John&location=moon
	@ResponseBody
	public String sayHello(@RequestParam (name="yourname") String name, 
			@RequestParam(name="location") String location) {
		
		return "Welcome to the " + location + " " + name + " !";
		
	}
	


}
