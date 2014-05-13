package it.appuntisoftware;

public class Utente {
	private String nome;
	private String cognome;
	private int età;
	
	public Utente(){
		this.nome="Inserisci nome";
		this.cognome="Inserisci cognome";
		this.età=18;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}
	
	
	

}
