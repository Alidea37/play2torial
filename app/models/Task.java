package models;

import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.GeneratedValue;


@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;

   // @Required
    private String contents;
  
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getContents() {
    	return contents;
    }
    
    public void setContents(String contents) {
    	this.contents = contents;
    }

}