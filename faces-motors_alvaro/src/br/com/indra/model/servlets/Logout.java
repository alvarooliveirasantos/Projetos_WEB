package br.com.indra.model.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/logout")
public class Logout extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getSession().removeAttribute("usuario.logado");
		PrintWriter out = resp.getWriter();
		
		Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();
		if (cookie == null){
			out.println("<html><body> usuario n estava logado </body></html>");
			return;
		}
		cookie.setMaxAge(0);
		resp.addCookie(cookie);
		
		out.println("<html><body>Deslogado com sucesso</body></html>");
	}
}
