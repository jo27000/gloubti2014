/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

import java.util.List;

/**
 *
 * @author saturne
 */
public interface MediaService {

    public Media add(Media media);

    public int remove(Media media);

    public int update(Media media);

    public Media getById(long id);

    public List<Media> getByTitre(String titre, int debut, int nbParPage, SortDirection ordre);

    public List<Media> getByAuteur(String auteur, int debut, int nbParPage, SortDirection ordre);

    public List<Media> getByAnneeParution(int anneeParution, int debut, int nbParPage, SortDirection ordre);

    public List<Media> getByMotCle(String motCle);

    public List<Media> getAll(int debut, int nbParPage, SortDirection ordre);

    public List<Livre> getAllLivre(int debut, int nbParPage, SortDirection ordre);

    public List<Video> getAllVideo(int debut, int nbParPage, SortDirection ordre);

    public List<Musique> getAllMusique(int debut, int nbParPage, SortDirection ordre);

    public List<Livre> getByEditeur(String editeur, int debut, int nbParPage, SortDirection ordre);

    public List<Livre> getByGenreLivre(GenreLivre genreLivre, int debut, int nbParPage, SortDirection ordre);

    public List<Video> getByGenreVideo(GenreVideo genreVideo, int debut, int nbParPage, SortDirection ordre);

    public List<Musique> getByGenreMusique(GenreMusique genreMusique, int debut, int nbParPage, SortDirection ordre);

    public List<Video> getByLimiteAge(int limiteAge, int debut, int nbParPage, SortDirection ordre);

    public int getCount();

    public int getCountLivre();

    public int getCountVideo();

    public int getCountMusique();

    public int getCountByTitre(String titre);

    public int getCountByAuteur(String auteur);

    public int getCountByAnneeParution(int anneeParution);

    public int getCountByMotCle(String motCle);

    public int getCountByEditeur(String editeur);

    public int getCountbyGenreLivre(GenreLivre genreLivre);

    public int getCountByGenreMusique(GenreMusique genreMusique);

    public int getCountByGenreVideo(GenreVideo genreVideo);

    public int getCountByLimiteAge(int limiteAge);
}
