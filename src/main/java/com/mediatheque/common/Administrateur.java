/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@DiscriminatorValue("Administrateur")
public class Administrateur extends Adherent implements Serializable {

}
