/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dany
 */
public class Save extends HttpServlet {

    private List<Qualifications> students = new ArrayList<>();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("ESTOY EN EL POST");
        String action = request.getParameter("action");
        
        if (action.equals("")) {
           System.out.println("action está vacío");    
        } else {
            
            if ("Guardar".equals(action)) {
                String student = request.getParameter("alumno");
                String qualification = request.getParameter("nota");
                
                if (null == student) {
                    student = "";
                }
                if (null == qualification) {
                    qualification = "";
                }
                
                Qualifications q = new Qualifications(this.students.size(), student, qualification);
                this.students.add(q);
                
            }
        }
        
        request.setAttribute("students", this.students);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
