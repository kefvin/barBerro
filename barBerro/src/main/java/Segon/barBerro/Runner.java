package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;

public class Runner {
	
	Comandes comandesC;
	List<Comanda> comandes = new ArrayList();
	
	public Runner(){
		
	}
	
	public Runner(Comandes comandesC){
		this.comandesC = comandesC;
		comandes = comandesC.getComanda();
	}
	
	public void buscaBegudesComanda(){
		for(Comanda comanda:comandes){
			Begudes begudesL = comanda.getBegudes();
			buscaBegudesBeguda(comanda);
		}
	}

	private void buscaBegudesBeguda(Comanda comanda) {
		
		
	}
	
}
