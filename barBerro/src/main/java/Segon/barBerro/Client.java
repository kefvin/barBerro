package Segon.barBerro;

public class Client {
	
	String nom = null;
	String cognom = null;
	
	public Client(){
		
	}
	
	public Client(String nom, String cognom){
		this.nom = nom;
		this.cognom = cognom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

}
