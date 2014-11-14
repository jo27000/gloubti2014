/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Samuel
 */
@Entity
public class Emprunt implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateEmprunt;
    @OneToOne
    private Adherent adherent;
    @OneToOne
    private Media media;

    public Emprunt() {
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDate(Date date) {
        this.dateEmprunt = date;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.dateEmprunt);
        hash = 73 * hash + Objects.hashCode(this.adherent);
        hash = 73 * hash + Objects.hashCode(this.media);
        return hash;
    }

    @Override
    public String toString() {
        return "Emprunt{" + "id=" + id + ", date=" + dateEmprunt + ", adherent=" + adherent + ", media=" + media + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emprunt other = (Emprunt) obj;
        if (!Objects.equals(this.dateEmprunt, other.dateEmprunt)) {
            return false;
        }
        return true;
    }
}
