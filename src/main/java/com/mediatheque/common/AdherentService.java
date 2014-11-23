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

    public int add(Adherent adherent);

    public int remove(Adherent adherent);

    public int update(Adherent adherent);

    public List<Adherent> getAll(int debut, int nbParPage, SortDirection ordre);

    public Adherent getById(Long id);

    public List<Adherent> getByNom(String nom, int debut, int nbParPage, SortDirection ordre);

    public List<Adherent> getByPrenom(String prenom, int debut, int nbParPage, SortDirection ordre);

    public Adherent getByLogin(String login, String password);

    public Adherent getByMail(String mail);

    public Adherent getByTel(String tel);

    public List<Adherent> getByDateNaissance(Date dateNaissance, int debut, int nbParPage, SortDirection ordre);

    public int getCount();

    public int getCountByNom(String nom);

    public int getCountByPrenom(String prenom);

    public int getCountByDateNaissance(Date dateNaissance);
}
