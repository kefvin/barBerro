package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	
	Client client = new Client();
	List<Beguda> begudes = new ArrayList<Beguda>();

	public Comanda(){
		
	}

	public Comanda(Client client, List<Beguda> begudes){
		this.client = client;
	}

}
