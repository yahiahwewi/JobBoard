package tn.esprit.microservice.meeting;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Meeting {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String location;
    private String startDate;
    private String endDate;

}
