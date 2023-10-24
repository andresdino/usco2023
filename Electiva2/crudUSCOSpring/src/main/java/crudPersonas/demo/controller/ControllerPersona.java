package crudPersonas.demo.controller;


import crudPersonas.demo.model.Personas;
import org.springframework.ui.Model;
import crudPersonas.demo.interfaceService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ControllerPersona {

    @Autowired
    private IPersonaService personaService;


    @GetMapping("/listar")
    public String listar(Model model){
        List<Personas> personas = personaService.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
}
