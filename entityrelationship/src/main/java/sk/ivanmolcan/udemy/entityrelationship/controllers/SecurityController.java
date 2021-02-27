package sk.ivanmolcan.udemy.entityrelationship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sk.ivanmolcan.udemy.entityrelationship.dao.UserAccountRepository;
import sk.ivanmolcan.udemy.entityrelationship.entities.UserAccount;

@Controller
public class SecurityController {

    @Autowired
    UserAccountRepository accountRepo;

    @Autowired
    BCryptPasswordEncoder bCryptEncoder;


    @GetMapping("/register")
    public String register(Model model) {
        UserAccount userAccount = new UserAccount();
        model.addAttribute("userAccount", userAccount);

        return "security/register";
    }

    @PostMapping("/register/save")
    public String saveUser(Model model, UserAccount user) {
        user.setPassword(bCryptEncoder.encode(user.getPassword()));
        accountRepo.save(user);
        return "redirect:/";
    }
}
