/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletHTML;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author RubenHH
 */
//@WebServlet(name = "ServletCalcu", urlPatterns = {"/ServletCalcu"})
public class ServletCalcu extends HttpServlet{
    /**
     * 
     * @param req Request
     * @param res Response
     * @throws ServletException 
     * @throws IOException 
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //Llamo objeto números
        numeros n= new numeros();
        //Pongo valores a los dos numeros
        n.setNum1(Integer.parseInt(req.getParameter("num1")));
        n.setNum2(Integer.parseInt(req.getParameter("num2")));
        //Obtengo valor del boton con el que se llamó
        String boton=req.getParameter("boton");
        //Evaluó el valor y ejecuto operacion correspondiente 
        if(boton.equals("SUMA")){
            n.sumar();
        }
        if(boton.equals("RESTA")){
            n.restar();
        }
        if(boton.equals("MULTIPLICACION")){
            n.multi();
        }
        if(boton.equals("DIVISION")){
            n.divide();
        }
        //Imprimo HTML
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head><title>RESULTADO</title></head>");
        out.println("<body><br>");
        out.println("<h1><center>RESULTADO: "+n.getResult()+"</center></h1>");
        out.println("</body></html>");
        out.close();
    }
}
