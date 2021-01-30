package com.example.mynotificationsvc.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "attender", schema = "notification")
@AllArgsConstructor
@NoArgsConstructor
public class Attender extends EntityWithUUID {

    @Column
    private String firstName;

    @Column
    private String lastName;


}
