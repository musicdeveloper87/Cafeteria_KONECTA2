/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.productos;
import modelo.productos2;

/**
 *
 * @author ACER
 */
@WebServlet(name = "productoscontrol", urlPatterns = {"/productoscontrol"})
public class productoscontrol extends HttpServlet {

   
    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        productos2 Productos2=new productos2();
        String accion;
        RequestDispatcher dispatcher=null;
        accion=request.getParameter("accion");
        if (accion==null || accion.isEmpty()){
            dispatcher=request.getRequestDispatcher("Productos/index.jsp");
            List<productos>listaProductos=productos2.ListarProductos();
            request.setAttribute("lista", listaProductos);
        }
        dispatcher.forward(request, response);
    }

    
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    
     
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
