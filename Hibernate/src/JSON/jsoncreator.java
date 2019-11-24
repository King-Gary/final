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
public class jsoncreator {




    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {



  jsoncreator employee = new jsoncreator();

  

  employee.put("name","Bob");

  employee.put("number","0010010");

  employee.put("state","GA");

  employee.put("salary","$35,000");

  

  System.out.println(employee);









  

    

}

    private void put(String name, String bob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
