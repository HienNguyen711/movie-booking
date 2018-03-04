package com.project.moviebooking.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document

public class Movie {
    @Id
    private ObjectId id;

    @Indexed(name = "name")// add index when search with movie name
    private String name;

    private String description;

    private BigDecimal price;

    private String imageUrl;
}
