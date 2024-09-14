package com.javatp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Minor")
public class MinorStudent extends Student {

    private boolean isAuthorized;

    public boolean isAuthorized() {
        return isAuthorized;
    }
    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
