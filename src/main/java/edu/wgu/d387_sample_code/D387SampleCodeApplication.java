package edu.wgu.d387_sample_code;

//import il8n.TimeConversion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.wgu.d387_sample_code.il8n.DisplayMessage;
import java.util.Locale;


@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		// Create threads for the Welcome Message in French and English
		DisplayMessage welcomeMessageEnglish = new DisplayMessage(Locale.US);
		Thread englishWelcomeThread = new Thread(welcomeMessageEnglish);
		englishWelcomeThread.start();

		DisplayMessage welcomeMessageFrench = new DisplayMessage(Locale.CANADA_FRENCH);
		Thread frenchWelcomeThread = new Thread(welcomeMessageFrench);
		frenchWelcomeThread.start();


	}

}