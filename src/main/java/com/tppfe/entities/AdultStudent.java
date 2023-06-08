package com.tppfe.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Adult")
public class AdultStudent extends Student{

    private String cin;

    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
}
