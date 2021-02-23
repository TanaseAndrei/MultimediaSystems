package com.uploader.project.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class ContactInformation {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String uuid;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;
}
