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
public class EmpruntServiceFactory {

    private static EmpruntService empruntSrv = null;

    public static EmpruntService getEmpruntServiceImpl() {

        if (empruntSrv == null) {

            empruntSrv = new EmpruntServiceImpl();
        }
        return empruntSrv;
    }
}
