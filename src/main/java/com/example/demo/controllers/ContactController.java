package com.example.demo.controllers;
//import com.example.demo.controllers.ContactForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "home/contact"; // busca contact.html en /templates/home/
    }

    @PostMapping("/contact/send")
    public String sendContact(@Valid ContactForm contactForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "home/contact";
        }

        // Aquí podrías enviar un correo, guardar en DB, etc.
        model.addAttribute("listo jaja");
        return "home/contact";
    }
}
