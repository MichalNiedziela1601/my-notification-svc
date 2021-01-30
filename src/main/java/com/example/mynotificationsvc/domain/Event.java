package com.example.mynotificationsvc.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Table(name = "event", schema = "notification")
@Entity
@Data
public class Event extends EntityWithUUID {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Embedded
    private Address address;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_event_attender"))
    private List<Attender> attenders = new LinkedList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Event_Organizator",
            joinColumns = { @JoinColumn(name = "event_id")},
            inverseJoinColumns = { @JoinColumn(name = "organizator_id")}
    )
    private Set<Organizator> organizators;
}
