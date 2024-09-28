package edu.wgu.d387_sample_code.il8n;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> displayWelcome (@RequestParam("lang") String lang) { // Request the html lang parameter here
        Locale locale = Locale.forLanguageTag(lang); // create locale object based on lang parameter
        DisplayMessage welcomeMessage = new DisplayMessage(locale); // create welcomeMessage to pull the corresponding lang
        return new ResponseEntity<>(welcomeMessage.getDisplayMessage(), HttpStatus.OK); // respond
    }
}

