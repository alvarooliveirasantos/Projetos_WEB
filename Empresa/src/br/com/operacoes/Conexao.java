package br.com.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
		
	public static EntityManager abreconexao(){
		
	return emf.createEntityManager();
	}

}
