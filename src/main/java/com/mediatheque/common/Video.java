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
@DiscriminatorValue("Video")
public class Video extends Media implements Serializable {

    private int limiteAge;
    @Enumerated(EnumType.STRING)
    private GenreVideo genreVideo;

    public Video() {
    }

    public Video(int limiteAge, GenreVideo genreVideo, String titre, String auteur, String resume, Byte[] pochette, int anneeParution) {
        super(titre, auteur, resume, pochette, anneeParution);
        this.limiteAge = limiteAge;
        this.genreVideo = genreVideo;
    }

    public GenreVideo getGenreVideo() {
        return genreVideo;
    }

    public void setGenreVideo(GenreVideo genreVideo) {
        this.genreVideo = genreVideo;
    }

    public int getLimiteAge() {
        return limiteAge;
    }

    public void setLimiteAge(int LimiteAge) {
        this.limiteAge = LimiteAge;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.genreVideo);
        hash = 59 * hash + this.limiteAge;
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
        final Video other = (Video) obj;
        if (this.genreVideo != other.genreVideo) {
            return false;
        }
        if (this.limiteAge != other.limiteAge) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Video{" + "genreVideo=" + genreVideo + ", limiteAge=" + limiteAge + '}';
    }

}
