/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author João Vitor
 */
import java.util.ArrayList;
import java.util.List;


public final class Questions  {
	private String correctResponse;
	private String response;
	 
	 public Questions(String correctResponse, String Response) {
	    setCorrectResponse(correctResponse);
	    setOtherResponses(Response);
	  }
	  public String setCorrectResponse(String response){
	    return this.correctResponse = response;
	  }
	  
	  public String getCorrectResponse() {
	    return correctResponse;
	  }
	  
	  public void setOtherResponses(String Response){
		  this.response = Response;
		
	  }
	  
	  public String getResponse() {
		 return response; 
	  }
	  public String verifyResponse() {
			  if(correctResponse.equalsIgnoreCase(getResponse())) {
				 return response = "correta";
			  }
			  else {
				 response = "incorreta";
			  }	  
		  return response;
	  }
	  
	  
}

