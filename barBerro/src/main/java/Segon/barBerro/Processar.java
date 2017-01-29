package Segon.barBerro;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class Processar extends DefaultHandler {
	
	boolean cervesa = false;
	boolean quantitat = false;
	
	public void startDocument(){
		
	}
	
	public void startElement(String uri, String localName, String qName, Attributes att){
		// qName = Nombre etiqueta
		System.out.print(qName);
		if(qName.equals("beguda")){
			quantitat = false;
			cervesa = false;
		}else if(qName.equals("quantitat")){
			quantitat = true;
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		// qName = Nombre etiqueta
		
	}
	
	public void characters(char[] ch, int start, int length){
		String text = new String(ch, start, length);
		
		if(text.equals("Cervesa")){
			cervesa = true;
		}
			
		if(cervesa == true && quantitat == true){
			int nombre = Integer.parseInt(text);
			if(nombre > 1){
				nombre = 1;
				text = String.valueOf(nombre);
				//System.out.print(nombre);
			}
				cervesa = false;
				quantitat = false;
		}
		System.out.print(" "+text);
	}
	
	public void endDocument(){
		
	}

}
