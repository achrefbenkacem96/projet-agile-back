package com.esprit.spring.ftthback.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class ColumnSup {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name ;
    private String value ;

    public ColumnSup(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public ColumnSup() {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
