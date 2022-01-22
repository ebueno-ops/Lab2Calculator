package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emman
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
            throws ServletException, IOException
    {
    if ((request.getParameter("first") != null)&&(request.getParameter("second") != null))
    {
        try
        {
            String firstString = request.getParameter("first");
            int firstNo = Integer.parseInt(firstString);

            String secondString = request.getParameter("second");
            int secondNo = Integer.parseInt(secondString);

            int res = 0;

            String oper = request.getParameter("func");
            switch(oper)
            {
                case "add":
                    res = firstNo + secondNo;
                    request.setAttribute("result", "Result: " + res);
                    break;
                case "subtr":
                    res = firstNo - secondNo;
                    request.setAttribute("result", "Result: " + res);
                    break;
                case "multi":
                    res = firstNo * secondNo;
                    request.setAttribute("result", "Result: " + res);
                    break;
                case "divi":
                    res = firstNo / secondNo;
                    request.setAttribute("result", "Result: " + res);
                    break;
            }

        }
        catch (Exception ex)
        {
            request.setAttribute("result", "Result: invalid");
        }

    }
    else
    {
        request.setAttribute("result", "Result: invalid");
    }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
