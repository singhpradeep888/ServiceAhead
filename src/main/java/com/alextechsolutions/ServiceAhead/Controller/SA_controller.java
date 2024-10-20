package com.alextechsolutions.ServiceAhead.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class SA_controller {
@GetMapping("/home")
    public RedirectView getHomePage(){
        return new RedirectView("index.html");
    }
    
}
