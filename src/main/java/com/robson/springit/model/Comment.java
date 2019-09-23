package com.robson.springit.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
// Use Lombok to auto-generate getters, setters, equals, to-string etc.
@Data
@NoArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    // Link
    @ManyToOne
    @NonNull
    private Link link;

    public Comment(@NonNull String body, @NonNull Link link) {
        this.body = body;
        this.link = link;
    }
}
