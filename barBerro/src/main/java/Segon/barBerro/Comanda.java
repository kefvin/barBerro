package Segon.barBerro;

import javax.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	//@XmlElement
	Client client = new Client();
	//@XmlElement
	Begudes begudes = new Begudes();
	
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

	public Begudes getBegudes() {
		return begudes;
	}

	public void setBegudes(Begudes begudes) {
		this.begudes = begudes;
	}

	
}
