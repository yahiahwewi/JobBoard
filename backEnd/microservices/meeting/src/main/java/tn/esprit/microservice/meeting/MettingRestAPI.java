package tn.esprit.microservice.meeting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mic2/meeting")

public class MettingRestAPI {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello I'm Microservice Candidat";
    }
    @Autowired
    private MeetingService meetingService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Meeting>> listMeetings() {
        return new ResponseEntity<>(meetingService.findAll(),
                HttpStatus.OK);

    }

}
