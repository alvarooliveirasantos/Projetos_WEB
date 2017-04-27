package br.com.indra.model.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.indra.managebean.AutomovelBean;

@WebServlet(urlPatterns = "/novoAutomovel")
public class CadastrarAutomovel extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String automovel= req.getParameter("automovel");
	new AutomovelBean().salva(automovel);
	PrintWriter out = resp.getWriter();
	out.println("<html><body>Veiculo adicionado com sucesso " + automovel);
	
	}
}
