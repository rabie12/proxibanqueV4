package com.jit.proxiBanqueV4.entites;

public class Parametrage {
	static double decouvert=3000;
	static double solde=20;

	public static double getSolde() {
		return solde;
	}

	public static void setSolde(double solde) {
		Parametrage.solde = solde;
	}

	public static double getDecouvert() {
		return decouvert;
	}

	public static void setDecouvert(double decouvert) {
		Parametrage.decouvert = decouvert;
	}

}
