package de.baerenspielplatz.beartrackerbackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class BreastMilk extends Entry {

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private BreastAmount breastAmount;

    private String note;

    public BreastMilk() {
    }

    public BreastAmount getBreastAmount() {
        return breastAmount;
    }

    public void setBreastAmount(BreastAmount breastAmount) {
        this.breastAmount = breastAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
