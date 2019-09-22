package com.robson.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data   // Uses Lombok to auto-generate getters, setters, equals, to-string etc.
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // comments

}
