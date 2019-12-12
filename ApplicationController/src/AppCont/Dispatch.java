/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCont;

import java.util.HashMap;

/**
 *
 * @author Gary
 */
public class Dispatch {
    private HashMap<String,Handler> theHandler;
    private First  first;
  private Second second;
  private Third  third;

  public Dispatch()
  {
    first = new First();
    second = new Second();
    third = new Third();
    theHandler = new HashMap<String, Handler>();
  }

  public void dispatch( String request )
  {
      Handler thisHandler = theHandler.get(request);
      int x = 1 + (int) (Math.random() * 3);
      if(x == 1)
      {
           thisHandler.show(first);
      }
      if(x == 2)
      {
           thisHandler.show(second);
      }
      if(x == 3)
      {
           thisHandler.show(third);
      }
      /*
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
*/
  }
}
