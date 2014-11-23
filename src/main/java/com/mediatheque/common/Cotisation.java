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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Cotisation implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateCotisation;
    private Long valeur;
    @OneToOne
    private Adherent adherent;

    public Cotisation() {
    }

    public Cotisation(Date dateCotisation, Long valeur, Adherent adherent) {
        this.dateCotisation = dateCotisation;
        this.valeur = valeur;
        this.adherent = adherent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Date getDateCotisation() {
        return dateCotisation;
    }

    public void setDateCotisation(Date dateCotisation) {
        this.dateCotisation = dateCotisation;
    }

    public Long getValeur() {
        return valeur;
    }

    public void setValeur(Long valeur) {
        this.valeur = valeur;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.dateCotisation);
        hash = 53 * hash + Objects.hashCode(this.valeur);
        hash = 53 * hash + Objects.hashCode(this.adherent);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cotisation other = (Cotisation) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateCotisation, other.dateCotisation)) {
            return false;
        }
        if (!Objects.equals(this.valeur, other.valeur)) {
            return false;
        }
        if (!Objects.equals(this.adherent, other.adherent)) {
            return false;
        }
        return true;
    }

}
