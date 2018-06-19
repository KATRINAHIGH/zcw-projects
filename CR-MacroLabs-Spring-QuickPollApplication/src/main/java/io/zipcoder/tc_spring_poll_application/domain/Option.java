package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Option {

    @Id  //denotes primary key of this entity
    @GeneratedValue //configures increment of the specified column(field)
    @Column(name = "OPTION_ID")  //specifies mapped column for a persistent property or field
    private long id;
    @Column(name = "OPTION_VALUE")
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}



