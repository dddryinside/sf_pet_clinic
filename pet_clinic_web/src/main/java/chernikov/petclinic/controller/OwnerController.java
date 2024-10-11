package chernikov.petclinic.controller;

import chernikov.petclinic.sevices.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class OwnerController {
    private final OwnerService ownerService;

    @RequestMapping("/owners")
    public String getOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners";
    }
}
