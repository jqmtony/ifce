package br.edu.ifce.dao;

import java.util.List;

import br.edu.ifce.entity.VagaEstagio;
import br.edu.ifce.util.dao.GenericDAO;
import br.edu.ifce.util.exception.DAOException;

public class VagaEstagioDAO{

	private GenericDAO<VagaEstagio> dao = new GenericDAO<VagaEstagio>(VagaEstagio.class);
	
	public VagaEstagio add(VagaEstagio vaga) throws DAOException {
		return dao.add(vaga);
	}
	
	public VagaEstagio update(VagaEstagio vaga) throws DAOException{
		return dao.update(vaga);
	}
	
	public boolean remove(VagaEstagio vaga) throws DAOException{
		return dao.remove(vaga);
	}

	public List<VagaEstagio> findAll(){
		return dao.findAll();
	}
}
