package com.jit.proxiBanqueV4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.metier.IOperationMetier;

@RestController
public class OperationRestService {
	@Autowired
	private IOperationMetier operationMetier;
	@RequestMapping(value = "/versement",method = RequestMethod.PUT)
	public boolean verser(@RequestParam String idCompte,@RequestParam double montant,@RequestParam Long idConseiller) {
		return operationMetier.verser(idCompte, montant, idConseiller);
	}
	@RequestMapping(value = "/retrait",method = RequestMethod.PUT)
	public boolean retirer(@RequestParam String idCompte,@RequestParam double montant,@RequestParam Long idConseiller) {
		return operationMetier.retirer(idCompte, montant, idConseiller);
	}
	@RequestMapping(value = "/virement",method = RequestMethod.PUT)
	public boolean virement(@RequestParam String idCompte1,@RequestParam String idCompte2,@RequestParam double montant,@RequestParam Long idConseiller) {
		return operationMetier.virement(idCompte1, idCompte2, montant, idConseiller);
	}

}
