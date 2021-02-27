package sk.ivanmolcan.springudemy2.springudemy2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sk.ivanmolcan.springudemy2.springudemy2.domain.User;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("formdData", new User());
        return "index";
    }

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public String processFormData(){
        return "";
    }
}
