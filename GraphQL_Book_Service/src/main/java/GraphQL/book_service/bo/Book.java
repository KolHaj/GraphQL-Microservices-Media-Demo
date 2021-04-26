package GraphQL.book_service.bo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Book variables using regular structure
 * instead of Lombok, compared to main service.
 * Will need to update in the future.
 */
@Entity
@Table(name = "BOOK")
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "AVAILABLE")
    private boolean available;

    @Column(name = "MEDIA")
    private String media;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "media", referencedColumnName = "MEDIA_ID")
//    private Media media;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

//    public Media getMedia() {
//        return media;
//    }
//
//    public void setMedia(Media media) {
//        this.media = media;
//    }
}
