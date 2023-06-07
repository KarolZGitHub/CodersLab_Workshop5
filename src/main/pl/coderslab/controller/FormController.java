package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.Book;

@Controller
public class FormController {
    @GetMapping(path = "/bookForm")
    public String showForm(Model model){
        model.addAttribute("book", new Book());
        return "/bookForm";
    }
}
