package com.crudclientes.proyecto1Clientes.controller;
import com.crudclientes.proyecto1Clientes.entity.Persona;
import com.crudclientes.proyecto1Clientes.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String ListarPersonas(Model model){
        model.addAttribute("personas",  personaService.listarPersonas())
                return "persona-list"
    }
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "persona-form";
    }
    @PostMapping
    public String guardarPersona( Persona persona){
        personaService.guardar(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model){
        model.addAttribute("persona", personaService.obtenerPorId(id));
        return "persona-form";
    }
    @GetMapping("/eliminar/{id}")
        public String eliminarPersona(@PathVariable Long id){
         personaService.eliminarPorId(id);
    }

}