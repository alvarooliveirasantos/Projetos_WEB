package br.com.indra.model.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 
	 String login = req.getParameter("email");
	 String senha =  req.getParameter("senha");
		
	br.com.indra.model.Login usuario = new br.com.indra.model.Login().RetornaLogin(login, senha);
	
	PrintWriter out = resp.getWriter();
	if (usuario != null){
		HttpSession	session = req.getSession();
		System.out.println("usuario logado " + usuario.getLogin());		
		session.setAttribute("usuario.logado", usuario);
		out.write("<html><body> Usuario logado </body></html>");
		Cookie cookie = new Cookie("usuario.logado", usuario.getLogin());
		cookie.setMaxAge(600);
		resp.addCookie(cookie);
		
	}
	else 	{	
	System.out.println("Usuario invalido");
		out.write("<html><body> Usuario invalido </body></html>");}
	/*
	
	
	//List<br.com.indra.model.Login> verificacao = new br.com.indra.model.Login().retornaLogin(login,senha);
	 
	 for (br.com.indra.model.Login login2 : verificacao) {
		 System.out.println(login2.getLogin());
		 System.out.println(login2.getSenha());
		 
		 
		 
		
	}
	 */
 }}

	

