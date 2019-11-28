/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

/**
 *
 * @author Gary
 */




import java.io.FileReader;

import java.util.Iterator;

import java.util.Map;



import org.json.simple.JSONArray;

import org.json.simple.JSONObject;





/*

    This is a simple program to parse objects in a JSON file and display them.

*/

public class jsonparser {



    public static void main(String[] args) throws Exception {

        // parsing file "JSONExample.json"

        Object obj = new jsonparser().parse(new FileReader("C:\\Users\\Gary\\CIT360\\ProjectCIT360\\JSON\\src\\JSON\newjson.json"));



        // typecasting obj to JSONObject

        JSONObject jObject = (JSONObject) obj;



        // getting firstName and lastName

        String fName = (String) jObject.get("fName");

        String lName = (String) jObject.get("lName");



        System.out.println("First Name: " + fName);

        System.out.println("Last Name: " + lName);



        // getting age

        long age = (long) jObject.get("age");

        System.out.println("Age: " + age);



        // getting address

        Map address = ((Map) jObject.get("State"));

        System.out.println("State: ");



        // iterating address Map

        Iterator<Map.Entry> itr1 = address.entrySet().iterator();

        while (itr1.hasNext()) {

            Map.Entry pair = itr1.next();

            System.out.println("\t" + pair.getKey() + " : " + pair.getValue());

        }






    }

    private Object parse(FileReader fileReader) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
