package tn.esprit.microservice.job;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mic2/jobs")
public class JobRestAPI {
    //simple web service for testing
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello I'm Microservice Job";
    }


    @Autowired
    private JobService jobService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Job>> listCandidat(){
        return new ResponseEntity<>(jobService.findAll(),
                HttpStatus.OK);

    }
}
