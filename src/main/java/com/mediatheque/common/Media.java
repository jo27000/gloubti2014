/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Media")
public class Media implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private String auteur;
    private String resume;

    @Lob
    private Byte[] pochette;
    private int anneeParution;

    public Media() {
    }

    public Media(String titre, String auteur, String resume, Byte[] pochette, int anneeParution) {
        this.titre = titre;
        this.auteur = auteur;
        this.resume = resume;
        this.pochette = pochette;
        this.anneeParution = anneeParution;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Byte[] getPochette() {
        return pochette;
    }

    public void setPochette(Byte[] pochette) {
        this.pochette = pochette;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public void setAnneeParution(int anneeParution) {
        this.anneeParution = anneeParution;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.titre);
        hash = 59 * hash + Objects.hashCode(this.auteur);
        hash = 59 * hash + Objects.hashCode(this.resume);
        hash = 59 * hash + Arrays.deepHashCode(this.pochette);
        hash = 59 * hash + this.anneeParution;
        return hash;
    }

    @Override
    public String toString() {
        return "Media{" + "id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", resume=" + resume + ", pochette=" + pochette + ", anneeParution=" + anneeParution + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Media other = (Media) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.auteur, other.auteur)) {
            return false;
        }
        if (!Objects.equals(this.resume, other.resume)) {
            return false;
        }
        if (!Arrays.deepEquals(this.pochette, other.pochette)) {
            return false;
        }
        if (this.anneeParution != other.anneeParution) {
            return false;
        }
        return true;
    }
}
