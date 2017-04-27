package br.com.indra.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCAutomovelDAO implements AutomovelDAO {

	/*public void salva(Automovel automovel) {
		conexao.save(automovel);
		}
	*/
	
	@Override
	public void salva(Automovel automovel) {
		String sql = "insert into automoveis " + "(anoFabricacao, anoModelo, marca, modelo, observacoes)"
+"values (?,?,?,?,?)";
	Connection cn = abreconexao();
	try{
		PreparedStatement pst = null;
		pst =cn.prepareStatement(sql);
		
		pst.setInt(1, automovel.getAnoFabricacao());
		pst.setInt(2, automovel.getAnoModelo());
		pst.setString(3, automovel.getMarca());
		pst.setString(4, automovel.getModelo());
		pst.setString(5, automovel.getObservacoes());
		pst.execute();
	}
	catch(SQLException e)
	{
		throw new RuntimeException(e);
	}
	finally{
		try {
			cn.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
	}
		
	}

	private Connection abreconexao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Automovel> lista() {
			List<Automovel> automoveis = new ArrayList<Automovel>();
			String sql = "select * from Automovel";
			Connection cn = abreconexao();
			try{
			PreparedStatement pst = cn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while( rs.next() ) {
			Automovel automovel = new Automovel();
			automovel.setId(rs.getLong("id"));
			automovel.setAnoFabricacao(rs.getInt("anoFabricacao"));
			automovel.setAnoModelo(rs.getInt("anoModelo"));
			automovel.setMarca(rs.getString("marca"));
			automovel.setModelo(rs.getString("modelo"));
			automovel.setObservacoes(rs.getString("observacoes"));
			automoveis.add(automovel);
			}
			} catch (SQLException e) {
			throw new RuntimeException(e);
			} finally {
			try {
			cn.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
			}
			return automoveis;
			}
	}


