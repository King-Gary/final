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
public class Dispatch {
    private First  first;
  private Second second;
  private Third  third;

  public Dispatch()
  {
    first = new First();
    second = new Second();
    third = new Third();
  }

  public void dispatch( String request )
  {
    if( request.equalsIgnoreCase("FIRST") )
    {
      first.show();
    }
    else if( request.equalsIgnoreCase("SECOND") )
    {
      second.show();
    }
    else
    {
      third.show();
    }
  }
}
