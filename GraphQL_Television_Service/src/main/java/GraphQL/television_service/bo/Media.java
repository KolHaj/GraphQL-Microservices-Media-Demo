package GraphQL.television_service.bo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Media variables using regular structure
 * instead of Lombok, compared to main service.
 * Will need to update in the future.
 */
@Entity
@Table(name = "MEDIA_TELEVISION")
public class Media implements Serializable {
    @Id
    @Column(name = "MEDIA_ID")
    private String id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "REGION")
    private String region;

    @Column(name = "RELEASE")
    private int release;

    @Column(name = "SALES")
    private int sales;

//    @OneToOne(mappedBy = "media")
//    private Television television;

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
