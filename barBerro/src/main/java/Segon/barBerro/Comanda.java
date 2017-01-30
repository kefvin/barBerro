package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	
	Client client = new Client();
	Begudes begudes = new Begudes();

	public Begudes getBegudes() {
		return begudes;
	}

	public void setBegudes(Begudes begudes) {
		this.begudes = begudes;
	}

	public Comanda(){
		
	}

	public Comanda(Client client){
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
