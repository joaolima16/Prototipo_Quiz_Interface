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
	private String correctQuestion;
	private List<String> otherQuestions;
	private String response;
	 
	 public Questions(String correctQuestion, List<String> otherQuestions) {
	    setCorrectQuestion(correctQuestion);
	    setOtherQuestions(otherQuestions);
	  }
	  public String setCorrectQuestion(String question){
	    return this.correctQuestion = question;
	  }
	  
	  public String getCorrectQuestion() {
	    return correctQuestion;
	  }
	  
	  public void setOtherQuestions(List<String> otherQuestions){
		  this.otherQuestions = new ArrayList<String>();
		  for(String i: otherQuestions) {
			    this.otherQuestions.add(i);
			  }  
	  }
	  
	  public void getOtherQuestions() {
		  for(String i: this.otherQuestions) {
			    System.out.println(i);
			  }  
	  }
	  public String verifyResponse() {
		  for(String i: this.otherQuestions) {
			  if(correctQuestion.equalsIgnoreCase(i)) {
				 return response = "correta";
			  }
			  else {
				  response = "incorreta";
			  }
		
		  }
		  return response;
	  }
	  
	  
}

