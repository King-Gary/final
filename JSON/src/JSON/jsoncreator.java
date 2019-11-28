/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;
/**
 *
 * @author Gary
 */
public class jsoncreator {




    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) throws IOException {
        JSONObject employee = new JSONObject();
        employee.put("Name", "Gary");
        employee.put("age", 26);
        employee.put("State", "CT");
        try (FileWriter file = new FileWriter("C:\\Users\\Gary\\CIT360\\ProjectCIT360\\JSON\\src\\JSON\file.txt")){
           file.write(employee.toJSONString());
           System.out.println("Object written to JSON");
        }
    }
