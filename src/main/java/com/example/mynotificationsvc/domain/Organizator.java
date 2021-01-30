package com.example.mynotificationsvc.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "organizator", schema = "notification")
@AllArgsConstructor
@NoArgsConstructor
public class Organizator extends EntityWithUUID {

    @Column
    private String firstName;

    @Column
    private String lastName;


}
