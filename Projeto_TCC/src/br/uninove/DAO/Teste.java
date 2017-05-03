package br.uninove.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uninove.managebean.ReservaBean;
import br.uninove.model.Reserva;

public class Teste {
	public static void main (String[] args){

		Reserva reserva = new Reserva();
		reserva.setEstacionamento("fsfs");
		reserva.setHorarioEntrada("10");
		reserva.setHorarioSaida("11");
		
		new ReservaBean().salva(reserva);

}
}