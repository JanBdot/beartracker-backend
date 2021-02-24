//package de.baerenspielplatz.beartrackerbackend.entities;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.UUID;
//
//@Entity
//@Table(name = "entries")
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Entry {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private UUID id;
//
//    @Column(nullable = false)
//    private Date _date;
//
//    @ManyToOne
//    private Baby baby;
//
//    @ManyToOne
//    private User byUser;
//
//    public Entry() {
//    }
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public Date getDate() {
//        return _date;
//    }
//
//    public void setDate(Date date) {
//        this._date = date;
//    }
//
//    public Baby getBaby() {
//        return baby;
//    }
//
//    public void setBaby(Baby baby) {
//        this.baby = baby;
//    }
//
//    public User getByUser() {
//        return byUser;
//    }
//
//    public void setByUser(User byUser) {
//        this.byUser = byUser;
//    }
//}
