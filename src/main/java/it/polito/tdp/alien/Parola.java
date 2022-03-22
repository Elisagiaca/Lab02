package it.polito.tdp.alien;

import java.util.LinkedList;

public class Parola {
	
		private String parolaAliena;
		LinkedList<String> listaTraduzioni;
		
		public String getParolaAliena() {
			return parolaAliena;
		}
		public void setParolaAliena(String parolaAliena) {
			this.parolaAliena = parolaAliena;
		}
		public LinkedList<String> getListaTraduzioni() {
			return listaTraduzioni;
		}
		
		public Parola(String parolaAliena) {
			super();
			this.parolaAliena = parolaAliena;
			this.listaTraduzioni = new LinkedList<>();
		}
		
		
		public String stampaLista() {
			String stringaFinale = "";
			for (String s : this.listaTraduzioni) {
				stringaFinale = stringaFinale + s + "\n";
			}
			return stringaFinale;
		}
		
}

