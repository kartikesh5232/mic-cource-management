package com.example.miccourcemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "course")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category;

    @Column(name = "publish_date")
    private LocalDate publishDate;
}