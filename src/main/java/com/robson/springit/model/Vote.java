package com.robson.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data  // Uses Lombok to auto-generate getters, setters, equals, to-string etc.
@NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    // user
    // link

}
