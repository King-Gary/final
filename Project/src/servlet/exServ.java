/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Gary
 */
public class exServ {
    private String msg;
    public void initiation() throws ServletException
    {
        msg = "Servlet Ran!!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("<h1>" + msg + "</h1>");
    }
}