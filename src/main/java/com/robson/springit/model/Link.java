package com.robson.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data   // Uses Lombok to auto-generate getters, setters, equals, to-string etc.
@NoArgsConstructor
public class Link extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    // comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

    public Link(@NonNull final String title, @NonNull final String url) {
        if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
        } else if (url == null) {
            throw new NullPointerException("url is marked non-null but is null");
        } else {
            this.title = title;
            this.url = url;
        }
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

}
