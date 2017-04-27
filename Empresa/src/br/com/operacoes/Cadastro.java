package br.com.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.funcionarios.Cargo;
import br.com.funcionarios.Departamento;
import br.com.funcionarios.Funcionario;

public  class Cadastro {

EntityManager em = Conexao.abreconexao();

public void CadastroFuncionario(Funcionario funcionario){
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
	//EntityManager em = emf.createEntityManager();
	

	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(funcionario);
	tx.commit();
	em.close();
	//emf.close();
	System.out.println("Cadastrado com sucesso");
}
public void CadastroCargo(Cargo cargo){
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(cargo);
	tx.commit();
	em.close();
	emf.close();
	System.out.println("Cadastrado com sucesso");
}
public void CadastroDepartamento(Departamento departamento){
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(departamento);
	tx.commit();
	em.close();
	emf.close();
	System.out.println("Cadastrado comsucesso");
}

}
