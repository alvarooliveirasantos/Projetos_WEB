package br.com.indra.model;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.Table;

import br.com.indra.persistence.Conexao;

@Entity
@Table(name="Login")
public class Login {
	
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String login;
	private int  senha ;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void Salvar(String login, int senha){
		EntityManager em = Conexao.abreconexao();
	    Login logon = new Login();
	    logon.setLogin(login);
	    logon.setSenha(senha);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(logon);
		tx.commit();
		em.close();
		
	}
	//
	
	/*public List<Login> retornaLogin(String usuario, String senha){
		List<Login> Login;
	//	usuario = "alvaro";
	//	senha = "123";
		int pass = Integer.parseInt(senha);
		EntityManager em = Conexao.abreconexao();
		String sql = "select a from Login as a where a.login = :usuario and a.senha = :senha";
	  	Query q = em.createQuery(sql,Login.class);
		q.setParameter("usuario", usuario);
		q.setParameter("senha", pass);
	  	Login = q.getResultList();
		return Login;
		
		
	}
	    */
		public Login RetornaLogin(String usuario, String senha){
		Login Login;	
		//usuario = "alvaro";
	    //senha = "123";
		int pass = Integer.parseInt(senha);
		EntityManager em = Conexao.abreconexao();
		String sql = "select a from Login as a where a.login = :usuario and a.senha = :senha";
	  	Query q = em.createQuery(sql,Login.class);
		q.setParameter("usuario", usuario);
		q.setParameter("senha", pass);
		try{
		return 	Login = (br.com.indra.model.Login) q.getSingleResult();
		}
		catch (NoResultException e) {
			return null;
		}
			// TODO: handle exception
		}
}		
		
	

	

