package Segon.barBerro;

public class Beguda {
	
	String nom = null;
	int quantitat = 0;	
	
	public Beguda(){
		
	}
	
	public Beguda(String nom, int quantitat){
		this.nom = nom;
		this.quantitat = quantitat;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

}
