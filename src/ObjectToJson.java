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
/*
 * Copyright @ Parmita Solutions Pvt Ltd.
 * All Rights are reserved to Parmita.
 * http://www.parmita.co.in
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.tata.java.beans.StudentBean;


/**
 * 
 * @author 	:-	Tatarao voelti
 * date		:- 	Dec 17, 2014 
 */
public class ObjectToJson {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		StudentBean sBean = new StudentBean("212","Tatarao","MCA");
		
		// Use this bean for list of student beans
		StudentBean sBeanList = new StudentBean();
		sBeanList.setCustomList(new ArrayList<StudentBean>());
		sBeanList.getCustomList().add(sBean);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES,true);
		try{
			mapper.writeValue(new File("tata.json"),sBeanList);
			// Use following method for proper alignment
			// mapper.defaultPrettyPrintingWriter().writeValue(new File("tata.json"),sBean);
		}
		catch(JsonParseException jpe){
			jpe.printStackTrace();
		}
		catch(JsonMappingException jpe){
			jpe.printStackTrace();
		}
		catch(IOException jpe){
			jpe.printStackTrace();
		}
	}
}
