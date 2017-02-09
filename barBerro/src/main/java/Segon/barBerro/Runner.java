package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;

public class Runner {
	
	Comandes comandesC;
	List<Comanda> comandes = new ArrayList();
	
	int cerveses = 0;
	boolean massaCerveses = false;
	
	public Runner(){
		
	}
	
	public Runner(Comandes comandesC){
		this.comandesC = comandesC;
		comandes = comandesC.getComanda();
	}
	
	public void buscaBegudesComanda(){
		for(int i=comandes.size()-1;i>=0;i--){
			buscaBegudesBeguda(comandes.get(i));
			if(massaCerveses){
				comandes.remove(comandes.get(i));
				massaCerveses = false;
			}
		}
	}

	private void buscaBegudesBeguda(Comanda comanda) {
		cerveses = 0;
		Begudes begudesBegudes = comanda.getBegudes();
		List<Beguda> begudes = begudesBegudes.getBeguda();
		for(Beguda beguda: begudes){
			buscarCerveza(beguda);
		}
	}

	private void buscarCerveza(Beguda beguda) {
		String nom = beguda.getNom();
		if(nom.equals("Cervesa")){
			int quantitat = beguda.getQuantitat();
			cerveses += quantitat;
			comprovaCerveses(quantitat);			
		}
	}

	private void comprovaCerveses(int quantitat) {
		if(quantitat>1 || cerveses>1){
			massaCerveses = true;
		}
		
	}
	
}
