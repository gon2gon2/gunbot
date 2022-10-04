package gon.practice.gunbot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GunController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("user", "2gun1");
        return "hello";
    }
}
