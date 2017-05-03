package br.uninove.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.managebean.ReservaBean;
import br.uninove.model.Reserva;

@WebServlet(urlPatterns="/novareserva")
public class NovaReserva extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Reserva reserva = new Reserva();
		
		reserva.setEstacionamento(req.getParameter("estacionamento"));
		reserva.setHorarioEntrada(req.getParameter("entrada"));
		reserva.setHorarioSaida(req.getParameter("saida"));
		reserva.setMarca(req.getParameter("marca"));
		reserva.setVeiculo(req.getParameter("modelo"));
		reserva.setPlaca(req.getParameter("placa"));		
		reserva.setObservacoes(req.getParameter("observacoes"));
		new ReservaBean().salva(reserva);
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/Paginas/jsp/agendamento.xhtml");
		dispatcher.forward(req, resp);
		
		
	}
}
