/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCont;

/**
 *
 * @author Gary
 */
public class Second implements Handler{
       public void show()
  {
    System.out.println("Displaying Seocnd Page");
  }
    public void show(Second second) {
        throw new UnsupportedOperationException("Displaying Seocnd Page"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(First first) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(Third third) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
