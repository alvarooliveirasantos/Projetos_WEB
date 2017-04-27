package br.com.indra.model;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

public class HibernateAutomovelDAO implements AutomovelDAO{

	@Override
	public void salva(Automovel a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Automovel> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public void salva(Automovel a) {
		Session s = abreConexao();
		Transaction tx = s.beginTransaction();
		s.save(a);
		tx.commit();
		s.close();
		
	}

	@Override
	public List<Automovel> lista() {
		// TODO Auto-generated method stub
		Session s = abreConexao();
		List<Automovel> automoveis = s.createQuery("from Automoveis").list();
		s.close();
		return automoveis;
		
		
		return null;
	}

}
*/
}