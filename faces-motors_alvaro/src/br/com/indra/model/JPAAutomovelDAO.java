package br.com.indra.model;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.indra.persistence.Conexao;

public class JPAAutomovelDAO implements AutomovelDAO{

	
	@Override
	public void salva(Automovel a) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.abreconexao();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<Automovel> lista() {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.abreconexao();
		List<Automovel> automoveis = em.createQuery("select a from Automovel a").getResultList();
		em.close();
		return automoveis;
	}

}
