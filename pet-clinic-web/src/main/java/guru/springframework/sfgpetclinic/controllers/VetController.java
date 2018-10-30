package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 14:38
 * Created in guru.springframework.sfgpetclinic.controllers for sfg-pet-clinic
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
