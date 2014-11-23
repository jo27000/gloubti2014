package com.mediatheque.common;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@DiscriminatorValue("Musique")
public class Musique extends Media implements Serializable {

    @Enumerated(EnumType.STRING)
    private GenreMusique genreMusique;

    public Musique() {
    }

    public Musique(GenreMusique genreMusique, String titre, String auteur, String resume, Byte[] pochette, int anneeParution) {
        super(titre, auteur, resume, pochette, anneeParution);
        this.genreMusique = genreMusique;
    }

    public GenreMusique getGenreMusique() {
        return genreMusique;
    }

    public void setGenreMusique(GenreMusique genreMusique) {
        this.genreMusique = genreMusique;
    }

    @Override
    public String toString() {
        return "Musique{" + "genreMusique=" + genreMusique + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.genreMusique);
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
        final Musique other = (Musique) obj;
        if (this.genreMusique != other.genreMusique) {
            return false;
        }
        return true;
    }

}
