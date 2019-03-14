/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Controler;
import java.io.*;

import java.net.*;

import java.util.Scanner;

import java.util.logging.Level;

import java.util.logging.Logger;

/**
 *
 * @author Gary
 */
public class URLHTTP {
    public static void main(String[] args) throws Exception {

         Scanner keyboard = new Scanner(System.in);

        System.out.println("What url would you like to test?");

        String webaddress = keyboard.nextLine();

        URL url = new URL(webaddress);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        try {

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());

            readStream(in);

        } finally {

            urlConnection.disconnect();

        }

    }



    private static void readStream(InputStream in) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}

  
