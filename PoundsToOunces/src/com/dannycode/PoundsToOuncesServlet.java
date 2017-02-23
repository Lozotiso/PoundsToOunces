package com.dannycode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class PoundsToOuncesServlet
 */
@WebServlet("/PoundsToOuncesServlet")
public class PoundsToOuncesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PoundsToOuncesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>");
		out.println("Servlet Title");
		out.println("</title></head><body>");
		try {
			String poundsString = request.getParameter("pounds");
			if ((poundsString != null) && (poundsString.length() > 0)) {
				double pounds = Integer.parseInt(poundsString);
				double ounces = pounds * 16;
				out.println("<p>" + pounds + " pounds equals " + ounces + " ounces.");
			}
			else {
				out.println("<p>Enter a value for pounds to convert</p>");
				out.println("<form action = \"PoundsToOuncesServlet\" method=\"get\">");
				out.println("<p><label>Pounds: </label>");
				out.println("<input type=\"text\" name=\"pounds\" />");
				out.println("</p>");
				out.println("<p><input type=\"submit\" value=\"Submit\" />");
				out.println("<input type=\"reset\" value=\"Reset\" />");
				out.println("</p>");
				out.println("</form>");
			}
		}
		finally {
			out.println("</body></html>");
			out.close();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
