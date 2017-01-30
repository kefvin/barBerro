package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comandes {	

	List<Comanda> comanda = new ArrayList();
	
	public Comandes(){
		
	}
	
	public List<Comanda> getComanda() {
		return comanda;
	}

	public void setComanda(List<Comanda> comanda) {
		this.comanda = comanda;
	}

	
	public Comandes(List<Comanda> comanda){
		this.comanda = comanda;
	}

}
