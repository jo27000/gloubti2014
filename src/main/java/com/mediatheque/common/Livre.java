package com.mediatheque.common;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Livre")
public class Livre extends Media implements Serializable {

    private String editeur;
    @Enumerated(EnumType.STRING)
    private GenreLivre genreLivre;

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public GenreLivre getGenreLivre() {
        return genreLivre;
    }

    public void setGenreLivre(GenreLivre genreLivre) {
        this.genreLivre = genreLivre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.editeur);
        hash = 89 * hash + Objects.hashCode(this.genreLivre);
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
        final Livre other = (Livre) obj;
        if (!Objects.equals(this.editeur, other.editeur)) {
            return false;
        }
        if (this.genreLivre != other.genreLivre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livre{" + "editeur=" + editeur + ", genreLivre=" + genreLivre + '}';
    }

}
