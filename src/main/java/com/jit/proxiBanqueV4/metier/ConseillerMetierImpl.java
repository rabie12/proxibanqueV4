package com.jit.proxiBanqueV4.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IConseillerDao;
import com.jit.proxiBanqueV4.entites.Conseiller;
@Service
public class ConseillerMetierImpl implements IConseillerMetier {
	@Autowired
	private IConseillerDao conseillerDao;
	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		return conseillerDao.save(conseiller);
	}

	@Override
	public List<Conseiller> listeConseillers() {
		return conseillerDao.findAll();
	}

}
