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
public class CotisationServiceFactory {

    private static CotisationService cotisationSrv = null;

    public static CotisationService getCotisationServiceImpl() {

        if (cotisationSrv == null) {

            cotisationSrv = new CotisationServiceImpl();
        }
        return cotisationSrv;
    }
}
