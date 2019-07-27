/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students;

/**
 *
 * @author dany
 */
public class Qualifications {
    
    private int id;
    private String name;
    private String qualification;

    public Qualifications(int id, String name, String qualification) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
}
