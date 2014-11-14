package com.mediatheque.common;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author saturne
 */
@Entity
public class Cotisation implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateCotisation;
    private Long valeur;

    public Cotisation() {
    }

    public Cotisation(Date dateCotisation, Long valeur) {
        this.dateCotisation = dateCotisation;
        this.valeur = valeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.dateCotisation);
        hash = 89 * hash + (int) (this.valeur ^ (this.valeur >>> 32));
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
        if (!Objects.equals(this.dateCotisation, other.dateCotisation)) {
            return false;
        }
        if (this.valeur != other.valeur) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cotisation{" + "id=" + id + ", dateCotisation=" + dateCotisation + ", valeur=" + valeur + '}';
    }

}
