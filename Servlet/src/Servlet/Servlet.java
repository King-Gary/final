/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

/**
 *
 * @author Gary
 */
import java.io.*;
import javax.servlet.*;
public class Servlet extends ServletRequest{
    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
    res.setContentType("text/html");
    PrintWriter pwriter=res.getWriter();
    pwriter.print("<html>");
    pwriter.print("<body>");
    pwriter.print("<h2>Generic Servlet Example</h2>");
    pwriter.print("Welcome");
    pwriter.print("</body>");
    pwriter.print("</html>");
    }
}
    