package com.uploader.project.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class Video {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column
    private String name;

    @Column
    private String type;

    @Lob
    private byte[] data;

    @Column
    private int minutes;
}
