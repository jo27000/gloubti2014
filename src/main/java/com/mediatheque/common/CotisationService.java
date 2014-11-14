package com.mediatheque.common;

import java.util.Date;
import java.util.List;

public interface CotisationService {

    public Cotisation add(Cotisation cotisation);

    public int remove(Cotisation cotisation);

    public int update(Cotisation cotisation);

    public List<Cotisation> getAll(int debut, int nbParPage, SortDirection ordre);

    public Cotisation getById(long id);

    public List<Cotisation> getByDate(Date date, int debut, int nbParPage, SortDirection ordre);

    public List<Cotisation> getByValeur(long valeur, int debut, int nbParPage, SortDirection ordre);

    public Cotisation getByAdherent(Adherent adherent);

    public int getCount();

    public int getCountByValeur(long valeur);

    public int getCountByDate(Date date);
}
