package GraphQL.television_service.bo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Television variables using regular structure
 * instead of Lombok, compared to main service.
 * Will need to update in the future.
 */
@Entity
@Table(name = "TELEVISION")
public class Television implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TELEVISION_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "WRITERS")
    private String writers;

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

    public String getWriters() {
        return writers;
    }

    public void setWriters(String author) {
        this.writers = author;
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
//    public void setMedia(Media media) {
//        this.media = media;
//    }
}

