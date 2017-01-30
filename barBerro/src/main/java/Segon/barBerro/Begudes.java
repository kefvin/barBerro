package Segon.barBerro;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Begudes {
	
	@XmlElement(name="beguda")
	List<Beguda> begudes = new ArrayList<Beguda>();
	
	public Begudes(){
		
	}
	
	public Begudes(List<Beguda> begudes){
		this.begudes=begudes;
	}

	public List<Beguda> getBegudes() {
		return begudes;
	}

	public void setBegudes(List<Beguda> begudes) {
		this.begudes = begudes;
	}

}
