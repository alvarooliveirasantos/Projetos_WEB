package br.uninove.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uninove.model.Reserva;

public class ReservaDAO {

private Reserva reserva = new Reserva();
	

public void NovaReserva(Reserva reserva)
{
	EntityManager em = Conexao.abreconexao();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(reserva);
	tx.commit();
	em.close();
	System.out.println("Cadastro de reserva feito");
	
	
	
}
}