package br.uninove.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

private static EntityManager em;

private Conexao(){

}

public static EntityManager abreconexao(){
if(em == null){
EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
em = emf.createEntityManager();
}
return em;
}

}