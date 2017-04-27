package br.uninove.managebean;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uninove.DAO.Conexao;
import br.uninove.model.Reserva;

@ManagedBean
public class ReservaBean {
	private Reserva reserva = new Reserva();
	
	public Reserva getReserva (){
		return this.reserva;
	}
	public void  setReserva (Reserva reserva) {
		this.reserva = reserva;
	}
	public void salva(Reserva reserva){
		EntityManager em = Conexao.abreconexao();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(reserva);
		tx.commit();
		em.close();
		System.out.println("cadastro OK");
		
		

	}

}