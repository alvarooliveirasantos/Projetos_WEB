package br.uninove.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.uninove.DAO.UsuarioDAO;
import br.uninove.model.Usuario;

@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet  {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("email");
		String senha = req.getParameter("senha");	
		
			
		Usuario usuario = new UsuarioDAO().buscaUsuario(user,senha);
		if (usuario != null){
		HttpSession session = req.getSession();
		session.setAttribute("usuario.logado",usuario);	
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/Paginas/jsp/agendamento.xhtml");
		dispatcher.forward(req, resp);
		System.out.println();
		}
		else 
		{
			PrintWriter out = resp.getWriter();
			System.out.println("usuario serrado");	
			//String script = "<html><body><script type='text/javascript'>alert('Usuario incorreto');</script></body></html>";
    		//System.out.println(script);
    		out.write("<html><body>script</body></html>");
    		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/Paginas/jsp/agendamento.xhtml");
    		dispatcher.forward(req, resp);	
    		
			
			
		}
	} 
}
