/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mediatheque.common;

/**
 *
 * @author Jonathan
 */
public class AdherentServiceFactory {

    private static AdherentService adherentSrv = null;

    public static AdherentService getAdherentServiceImpl() {

        if (adherentSrv == null) {

            adherentSrv = new AdherentServiceImpl();
        }
        return adherentSrv;
    }
}
