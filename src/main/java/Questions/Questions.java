/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author João Vitor
 */


public final class Questions  {
	private String correctResponse;
	private String response[];
	 
	 public Questions(String correctResponse, String  response[]) {
	    setCorrectResponse(correctResponse);
	    setOtherResponses(response);
	  }
	  public void setCorrectResponse(String response){
	     this.correctResponse = response;
	  }
	  
	  public String getCorrectResponse() {
	    return correctResponse;
	  }
	  
	  public void setOtherResponses(String response[]){
		 this.response = response;
	  }
	  
	  public String[] getResponse() {
		 return response; 
	  }
	  public String verifyResponse() {
			  if(!correctResponse.equalsIgnoreCase(getResponse())) {
                              return "incorreta";
                          }
			  else {
                              return "correta";
                          }	  
		
	  }
	  
	  
}

