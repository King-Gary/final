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
public class Third implements Handler{
    public void show()
  {
    System.out.println("Displaying Third Page");
  }
        public void show(Third third) {
        throw new UnsupportedOperationException("Displaying Third Page"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(First first) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(Second second) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
