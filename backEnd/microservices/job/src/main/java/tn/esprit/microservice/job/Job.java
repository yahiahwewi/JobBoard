package tn.esprit.microservice.job;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Job {

    public Job() {

    }

    public long getId() {
        return id;
    }



    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private String status;


    public Job(String title, String description, String status) {
  this.title = title;
  this.description = description;
  this.status = status;

    }

}
