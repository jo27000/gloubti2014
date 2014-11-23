package com.mediatheque.common;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Samuel
 */
public interface EmpruntService {

    public int add(Emprunt emprunt);

    public int remove(Emprunt emprunt);

    public int update(Emprunt emprunt);

    public List<Emprunt> getAll(int debut, int nbParPage, SortDirection ordre);

    public Emprunt getById(Long id);

    public List<Emprunt> getByDate(Date date, int debut, int nbParPage, SortDirection ordre);

    public List<Emprunt> getByAdherent(Adherent adherent, int debut, int nbParPage, SortDirection ordre);

    public List<Emprunt> getByMedia(Media media, int debut, int nbParPage, SortDirection ordre);

    public int getCount();

    public int getCountByDate(Date date);

    public int getCountByAdherent(Adherent adherent);

    public int getCountByMedia(Media media);
}
