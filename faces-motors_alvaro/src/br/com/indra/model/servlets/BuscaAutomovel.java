package br.com.indra.model.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.indra.managebean.AutomovelBean;
import br.com.indra.model.Automovel;

@WebServlet(urlPatterns="/listar")
public class BuscaAutomovel extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>"
				+ "<body>");
		out.println("ola mundo</br>");
		out.println("ul");
	    Collection<Automovel> auto = new AutomovelBean().getAutomoveis();
	    for (Automovel automovel : auto) {
	    	out.println("<li>" + automovel.getMarca());
			
		}
	    out.println("/ul");
	    out.println("</body></html>");
			
	}
}
