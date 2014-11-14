/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Nico
 */
@Entity
@DiscriminatorValue("Administrateur")
public class Administrateur extends Adherent implements Serializable {

    public Administrateur(String nom, String prenom, String mail, String tel, Date dateNaissance, String login, String password) {
        super(nom, prenom, mail, tel, dateNaissance, login, password);
    }

    public Administrateur() {
    }

}
