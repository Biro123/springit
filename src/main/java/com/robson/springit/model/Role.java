package com.robson.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

    @ManyToMany (mappedBy = "roles")
    private Collection<User> users;
}
