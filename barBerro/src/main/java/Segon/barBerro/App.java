package Segon.barBerro;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    	
        // Tengo que buscar las "comandas", dentro las "begudes" y dentro de esas "begudes"
    	// tengo que hacer que solo haya una "beguda" que como nombre tenga cerbeza y solo haya 1
    	// Ojo! En una comanda->begudes, puede haber más de una etiqueta "beguda"
    	
    	
    	try{
    		// LEER
    		
    		//Si, em vaig equivocar i vaig ver el procés de gestió de les dades i lectura amb el SAX
    		
//    		SAXParserFactory sax = SAXParserFactory.newInstance();
//    		sax.setNamespaceAware(true);
//    		
//    		SAXParser parser = sax.newSAXParser();
//    		parser.parse( new File("D:\\clase\\2DAW\\workspace\\barBerro\\src\\main\\resources\\comandes1.xml"), new Processar());

    		JAXBContext context = JAXBContext.newInstance(Comandes.class);
    		
    		Unmarshaller lector = context.createUnmarshaller();
    		Comandes comandes = (Comandes) lector.unmarshal(new File("D:\\clase\\2DAW\\Programacio\\Git\\barBerro\\barBerro\\src\\main\\resources\\comandes1.xml"));
    		
    		Runner runner = new Runner(comandes);
    		runner.buscaBegudesComanda();
    		
    		
    		// ESCRIBIR
    		Marshaller creador = context.createMarshaller();
    		creador.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true ); // Da formato al guardado
    		creador.marshal(comandes, System.out); // Lo muestra por consola (Puede que haya que cambiar "comandes")
    		// Lo graba en un archivo (Puede que haya que cambiar "comandes")
	        creador.marshal(comandes, new File("D:\\clase\\2DAW\\Programacio\\Git\\barBerro\\barBerro\\src\\main\\resources\\comandes.xml")); 
    		
    	}catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
    	
    }
}
