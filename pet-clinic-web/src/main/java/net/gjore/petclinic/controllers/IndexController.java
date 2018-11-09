package net.gjore.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 14:06
 * Created in guru.springframework.sfgpetclinic.controllers for sfg-pet-clinic
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String index(){

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsMethod(){
        return "notimplemented";
    }

}
