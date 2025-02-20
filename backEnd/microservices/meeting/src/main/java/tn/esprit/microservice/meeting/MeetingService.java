package tn.esprit.microservice.meeting;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {


    private MeetingRepository meetingRepository;

    public List<Meeting> findAll() {
        return meetingRepository.findAll();
    }

}

