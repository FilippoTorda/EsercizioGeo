package net.codejava.javaee;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProgettoServlet
 */
@WebServlet("/ProgettoServlet")
public class ProgettoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProgettoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long numero;

		try {

			if (request.getParameter("numero") != null && !request.getParameter("numero").isEmpty()) {

				numero = Long.parseUnsignedLong(request.getParameter("numero"));

				long fact = 1;

				for (long i = 1; i <= numero; i++) {
					fact = i * fact;
				}
				
				System.out.println("Metodo utilizzato: doGet");
				System.out.println("Il fattoriale di " + numero + " è " + fact);
				request.setAttribute("RISULTATO", fact);
				request.getRequestDispatcher("/index.jsp").forward(request, response);

			} else {

				request.setAttribute("ERRORE", "Inserire un numero");
				request.getRequestDispatcher("/index.jsp").forward(request, response);

			}

		} catch (NumberFormatException e) {

			request.setAttribute("ERRORE", "Inserire un numero intero");
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long numero;

		try {

			if (request.getParameter("numero") != null && !request.getParameter("numero").isEmpty()) {

				numero = Long.parseUnsignedLong(request.getParameter("numero"));

				long fact = 1;

				for (long i = 1; i <= numero; i++) {
					fact = i * fact;
				}
				
				System.out.println("Metodo utilizzato: doPost");
				System.out.println("Il fattoriale di " + numero + " è " + fact);
				request.setAttribute("RISULTATO", fact);
				request.getRequestDispatcher("/index.jsp").forward(request, response);

			} else {

				request.setAttribute("ERRORE", "Inserire un numero");
				request.getRequestDispatcher("/index.jsp").forward(request, response);

			}

		} catch (NumberFormatException e) {

			request.setAttribute("ERRORE", "Inserire un numero intero");
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		}

	}
}

