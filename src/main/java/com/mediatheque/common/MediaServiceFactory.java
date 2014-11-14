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
public class MediaServiceFactory {

    private static MediaService mediaSrv = null;

    public static MediaService getMediaServiceImpl() {

        if (mediaSrv == null) {

            mediaSrv = new MediaServiceImpl();
        }
        return mediaSrv;
    }
}
