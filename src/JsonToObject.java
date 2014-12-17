import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.tata.java.beans.StudentBean;

/**
 * Copyright @ Paarmita Software and Consulting Pvt Ltd.
 * All Rights are reserved to Paarmita.
 * http://www.paarmita.com
 */

/**
 * @author Tatarao voleti
 * @date   Dec 17, 2014
 * 
 */
public class JsonToObject {
	
	public static void main(String arg[]){
		
		String studentJson = "{'sId':null,'sName':null,'sCourse':null,'customList':'[{'sId':'212','sName':'Tatarao,'sCourse:'MCA','customList':[]}]'}";
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES,true);
		
		try {
			// Get Student Object data from json format
			StudentBean sb = mapper.readValue(studentJson,StudentBean.class);
			System.out.println("From String "+sb.toString());
			
			// Get Student Object data from json file
			StudentBean sbFile = mapper.readValue(new File("tata.json"),StudentBean.class);
			System.out.println("From Json File "+sbFile.toString());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
