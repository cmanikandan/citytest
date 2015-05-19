package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
        //String timestamp = System.getProperty("staging.timestamp");
	String timestamp = 
	    new java.text.SimpleDateFormat("MM/dd/yyyy h:mm:ss a").format(new Date());
        return "It is raining heavily. Application was staged at: " + timestamp;
    }
}
