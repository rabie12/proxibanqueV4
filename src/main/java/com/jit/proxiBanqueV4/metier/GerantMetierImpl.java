package com.jit.proxiBanqueV4.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IGerantDao;
import com.jit.proxiBanqueV4.entites.Gerant;
@Service
public class GerantMetierImpl implements IGerantMetier {
	@Autowired
	private IGerantDao gerantDao;
	@Override
	public Gerant saveGerant(Gerant gerant) {
		return gerantDao.save(gerant);
	}

	@Override
	public List<Gerant> listeGerants() {
		return gerantDao.findAll();
	}

}
