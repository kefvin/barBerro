package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Begudes {
	

	List<Beguda> beguda = new ArrayList<Beguda>();
	
	public Begudes(){
		
	}
	
	public Begudes(List<Beguda> begudesL){
		this.beguda=begudesL;
	}

	public List<Beguda> getBeguda() {
		return beguda;
	}

	public void setBeguda(List<Beguda> beguda) {
		this.beguda = beguda;
	}

	
}
