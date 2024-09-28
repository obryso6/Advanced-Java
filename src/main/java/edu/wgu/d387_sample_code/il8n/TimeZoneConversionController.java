package edu.wgu.d387_sample_code.il8n;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/api")
public class TimeZoneConversionController {

    @GetMapping("/convert-times")
    public String getConvertedTimes() {
        // Define the fixed presentation time directly here
        ZonedDateTime presentationTime = ZonedDateTime.of(2024, 10, 11, 14, 0, 0, 0, ZoneId.of("America/New_York"));

        // Return the formatted time string
        return "Join us for a live presentation held at the Landon Hotel on October 11th, 2024 at " + TimeConversion.getConvertedTimes(presentationTime);
    }
}

