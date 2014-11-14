/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

import java.util.Date;
import java.util.List;

/**
 *
 * @author saturne
 */
public interface AdherentService {

    public Adherent add(Adherent adherent);

    public int remove(Adherent adherent);

    public int update(Adherent adherent);

    public List<Adherent> getAll(int debut, int nbParPage, SortDirection ordre);

    public Adherent getAdherentById(long id);

    public List<Adherent> getAdherentByNom(String nom, int debut, int nbParPage, SortDirection ordre);

    public List<Adherent> getAdherentByPrenom(String prenom, int debut, int nbParPage, SortDirection ordre);

    public Adherent getAdherentByMail(String mail);

    public Adherent getAdherentByTel(String tel);

    public List<Adherent> getAdherentByDateNaissance(Date dateNaissance, int debut, int nbParPage, SortDirection ordre);

    public int getCount();

    public int getCountByNom(String nom);

    public int getCountByPrenom(String prenom);

    public int getCountByDateNaissance(Date dateNaissance);
}
