package crudPersonas.demo.controller;


import crudPersonas.demo.model.Personas;
import org.springframework.ui.Model;
import crudPersonas.demo.interfaceService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("eliminar/{id}")
    public String delete(@PathVariable int id){
        personaService.delete(id);
        return "redirect:/listar";
    }

    @PostMapping("/save")
    public String save(@Validated Personas p){
        personaService.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("persona", new Personas());
        return "form";
    }



}
