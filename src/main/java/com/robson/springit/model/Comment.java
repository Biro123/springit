package com.robson.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data  // Uses Lombok to auto-generate getters, setters, equals, to-string etc.
@NoArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    // Link
    @ManyToOne
    private Link link;

}
