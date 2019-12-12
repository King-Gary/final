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
public class Controller {
    private Student model;
   private View view;

   public Controller(Student model, View view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName1(name);		
   }

   public String getStudentName(){
      return model.getName1();		
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo1(rollNo);		
   }

   public String getStudentRollNo(){
      return model.getRollNo1();		
   }

   public void updateView(){				
      view.printStudentDetails(model.getName1(), model.getRollNo1());
   }	
}
