package br.uninove.managebean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uninove.DAO.Conexao;
import br.uninove.model.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario(){
		return usuario;
	}
	public void setUsuario(Usuario usuario){
		this.usuario = usuario;
	}
	public void Salva(Usuario usuario){
	EntityManager em = Conexao.abreconexao();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(usuario);
	tx.commit();
	//em.close();
	System.out.println("cadastro OK");
	try {
		FacesContext.getCurrentInstance().getExternalContext().redirect("login.html");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
}
