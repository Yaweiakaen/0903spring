package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class RedirectExampleController {
 
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String authorInfo(Model model) {        
        return "redirect:/hello2";
    }
    @RequestMapping("/hello2")
    public String hello(Model model) {         
        model.addAttribute("greeting", "RedirectExampleController Hello Spring MVC");         
        return"helloworld";         
    }
}
