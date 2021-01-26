package com.example.mynotificationsvc.domain;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {

    private String street;
    private String house;
    private String postCode;
    private String city;
    private String county;
    private String country;
}
