package br.com.indra.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.indra.model.Login;

public class PersistidorDeAutomovel {

	public static void main(String[] args) {
		
		
				
		/*Automovel auto = new Automovel();
		auto.setAnoFabricacao(2010);
		auto.setAnoModelo(2011);
		auto.setMarca("Fiat");s
		auto.setModelo("palio");
		auto.setObservacoes("ruim");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		em.close();
		System.out.println("ok");
		
		/*Query sql = em.createQuery("select a from Automovel a", Automovel.class);
		List<Automovel> automovel = sql.getResultList();
		
		for (Automovel a : automovel) {
			System.out.println((a.getModelo()));
		}
		*/
		//EntityTransaction tx = em.getTransaction();
		
		/*Automovel auto2 = em.getReference(Automovel.class, 1);
		Integer um = 1;
		auto2.setId(um);
		em.getTransaction().begin();
		em.remove(auto2);
	    em.getTransaction().commit();
		em.close();
		*/
		/*Login login = new Login();
		login.Salvar("alvaro", 123);
		System.out.println(login.getLogin()+ login.getSenha());
	    
		List<br.com.indra.model.Login> verificacao = new br.com.indra.model.Login().retornaLogin("usuario","senha");
		 
		 for (br.com.indra.model.Login login2 : verificacao) {
			 System.out.println(login2.getLogin());
			 System.out.println(login2.getSenha());
			 
			 {
				
		}*/
		
		 }}
