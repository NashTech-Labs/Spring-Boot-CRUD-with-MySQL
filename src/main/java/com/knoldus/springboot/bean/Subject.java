package com.knoldus.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {

    /**
     * id variable for subject
     */
    @Id
    private String id;
    /**
     * name variable for subject
     */
    private String name;


    /**
     * constructor Subject
     */
    public Subject() {

    }

    /**
     * method Subject
     * @param id subject id
     * @param name subject name
     */
    public Subject(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * method to get id
     * @return id of subject
     */
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
