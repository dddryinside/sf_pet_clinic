package chernikov.petclinic.controller;

import chernikov.petclinic.sevices.VetService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class VetController {
    private final VetService vetService;

    @PostConstruct
    public void init() {
        System.out.println("VetController initialized");
    }

    @GetMapping("/vets")
    public String getVets(Model model) {
        System.out.println("vets");
        model.addAttribute("vets", vetService.findAll());
        return "vets";
    }
}
