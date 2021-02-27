package sk.ivanmolcan.springudemy3.springudemy3.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/greeting")
public class HelloController {
    //    @RequestMapping(value = "/basic", method = RequestMethod.GET)
    @RequestMapping("/basic")
    public String sayHello(){
        return "<h1>Hello512</h1>";
    }

    @RequestMapping("/proper")
    public String sayPropperHello(){
        return "<h1>Hello there, how are you?</h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm(){
        return "<form action=\"/greeting/user_greeting\" method=\"post\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }
//@RequestParam je na parametre v url napr z formulara
//@PathVariable je na parametre v path napr.{id}

    @RequestMapping(value="/user_greeting", method= RequestMethod.POST)
    public String printUserGreeting(@RequestParam String fname, @RequestParam String lname){
        return "Hello there " + fname.toUpperCase() + " " + lname.toUpperCase();
    }

    @RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
    public String getOrder(@PathVariable String id){
        return "Order ID: " + id;
    }
}
