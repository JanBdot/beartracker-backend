package baerenspielplatz.beartrackerbackend.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private Date date;

    private Float headsize;
    private Float height;
    private Float weight;

    @ManyToOne
    private Baby baby;

    public Measurement() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getHeadsize() {
        return headsize;
    }

    public void setHeadsize(Float headsize) {
        this.headsize = headsize;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
