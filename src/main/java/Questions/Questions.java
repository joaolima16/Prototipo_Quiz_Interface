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
	private List<String> otherResponses;
	private String response;
	 
	 public Questions(String correctResponse, List<String> otherQuestions) {
	    setCorrectResponse(correctResponse);
	    setOtherResponses(otherQuestions);
	  }
	  public String setCorrectResponse(String response){
	    return this.correctResponse = response;
	  }
	  
	  public String getCorrectResponse() {
	    return correctResponse;
	  }
	  
	  public void setOtherResponses(List<String> otherQuestions){
		  this.otherResponses = new ArrayList<String>();
		  for(String i: otherQuestions) {
			    this.otherResponses.add(i);
			  }  
	  }
	  
	  public void getOtherResponses() {
		  for(String i: this.otherResponses) {
			    System.out.println(i);
			  }  
	  }
	  public String verifyResponse() {
		  for(String i: this.otherResponses) {
			  if(correctResponse.equalsIgnoreCase(i)) {
				 return response = "correta";
			  }
			  else {
				 response = "incorreta";
			  }
		
		  }
		  return response;
	  }
	  
	  
}

