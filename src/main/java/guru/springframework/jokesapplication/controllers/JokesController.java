package guru.springframework.jokesapplication.controllers;

import guru.springframework.jokesapplication.services.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesController(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

    @RequestMapping("/")
    public String getJokes(Model model){

        model.addAttribute("jokes", chuckNorrisQuotes.getRandomQuote());

        // Return the books/list thymeleaf template view we've now implemented.
        return "index";
    }
}
