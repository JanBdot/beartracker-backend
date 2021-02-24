package de.baerenspielplatz.beartrackerbackend.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Diaper extends Entry {

    @Enumerated(EnumType.ORDINAL)
    private DiaperAmount poopAmount;

    @Enumerated(EnumType.ORDINAL)
    private DiaperAmount peeAmount;

    private Boolean hasDiarrhea;

    public Diaper() {
    }

    public DiaperAmount getPoopAmount() {
        return poopAmount;
    }

    public void setPoopAmount(DiaperAmount poopAmount) {
        this.poopAmount = poopAmount;
    }

    public DiaperAmount getPeeAmount() {
        return peeAmount;
    }

    public void setPeeAmount(DiaperAmount peeAmount) {
        this.peeAmount = peeAmount;
    }

    public Boolean getHasDiarrhea() {
        return hasDiarrhea;
    }

    public void setHasDiarrhea(Boolean hasDiarrhea) {
        this.hasDiarrhea = hasDiarrhea;
    }
}
