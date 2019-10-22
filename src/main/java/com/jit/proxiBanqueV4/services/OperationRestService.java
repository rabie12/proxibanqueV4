package com.jit.proxiBanqueV4.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.metier.IOperationMetier;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe OperationRestService WS
 */
@RestController
public class OperationRestService {
	@Autowired
	private IOperationMetier operationMetier;
	/**
	 * Méthode qui permet de verser un montant sur un compte
	 * @param idCompte
	 * @param montant
	 * @param idConseiller
	 * @return boolean
	 */
	@RequestMapping(value = "/proxiBanque/versement",method = RequestMethod.PUT)
	public boolean verser(@RequestParam String idCompte,@RequestParam double montant,@RequestParam int idConseiller) {
		return operationMetier.verser(idCompte, montant, idConseiller);
	}
	/**
	 *  Méthode qui permet de retirer un montant d'un compte
	 * @param idCompte
	 * @param montant
	 * @param idConseiller
	 * @return boolean
	 */
	@RequestMapping(value = "/proxiBanque/retrait",method = RequestMethod.PUT)
	public boolean retirer(@RequestParam String idCompte,@RequestParam double montant,@RequestParam int idConseiller) {
		return operationMetier.retirer(idCompte, montant, idConseiller);
	}
	/**
	 * Méthode Rest qui permet d'effectuer le virement compte à compte
	 * @param operation
	 * @return boolean
	 */
	@RequestMapping(value = "/proxiBanque/virement",method = RequestMethod.PUT)
	public boolean virement(@RequestBody HashMap<String,Object> operation) {
		String idCompte1=(String) operation.get("idCompte1");
		String idCompte2=(String) operation.get("idCompte2");
		double montant=(int) operation.get("montant");
		int idConseiller=(int) operation.get("idConseiller");
		return operationMetier.virement(idCompte1, idCompte2, montant, idConseiller);
	}

}
