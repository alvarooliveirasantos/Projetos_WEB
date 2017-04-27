package br.uninove.managebean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.uninove.DAO.UsuarioDAO;
import br.uninove.model.Usuario;

@ManagedBean(name="login")
public class LoginBean {
	
	UsuarioDAO usuariodao = new UsuarioDAO();
	Usuario usuario = new Usuario();
	
	private String Login(){
		usuario = usuariodao.buscaUsuario(usuario.getNome(), usuario.getSenha());
		if (usuario ==null){
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario não encontrado","erro no login"));
			return null;
		}
		else 
			return "/Pesquisa";
	}


public Usuario getUsuario(){
	return usuario;
}
public void setUsuario(Usuario usuario){
	
	this.usuario = usuario;
}
}

 