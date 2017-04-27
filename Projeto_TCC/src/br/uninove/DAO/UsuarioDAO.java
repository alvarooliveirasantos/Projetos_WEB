package br.uninove.DAO;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.uninove.model.Usuario;

public class UsuarioDAO {

	public  Usuario buscaUsuario(String user, String senha) {
		Usuario usuarioa ;
		EntityManager em = Conexao.abreconexao();
		String sql = ("select a from Usuario as a where a.nome = :usuario and a.senha = :senha");
		Query q = em.createQuery(sql,Usuario.class);
		q.setParameter("usuario", user);
		q.setParameter("senha", senha);
		
		try{		
		return usuarioa = (Usuario) q.getSingleResult();
		}
		catch(NoResultException e)
		{
			return null;
		}
		

	
	

	
	}}
