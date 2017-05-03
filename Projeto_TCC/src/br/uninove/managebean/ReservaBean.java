package br.uninove.managebean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.DAO.Conexao;
import br.uninove.model.Reserva;

@ManagedBean
@RequestScoped
public class ReservaBean{
	private Reserva reserva = new Reserva();
	
	public Reserva getReserva (){
		return reserva;
	}
	public void  setReserva (Reserva reserva) {
		this.reserva = reserva;
	}
	
	public void Salva(Reserva reserva){
		EntityManager em = Conexao.abreconexao();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(reserva);
		tx.commit();
		//em.close();
		System.out.println("cadastro OK");
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("painel.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String salva(Reserva reserva){
			EntityManager em = Conexao.abreconexao();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(reserva);
			tx.commit();
			//em.close();
			System.out.println("cadastro OK");
			return "pagamento";
			
			
	
		

	}

}