/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Gary
 */
public class Testing {
    public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      View view = new View();

      Controller controller = new Controller(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Gary");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName1("Gary");
      student.setRollNo1("1");
      return student;
   }
}
