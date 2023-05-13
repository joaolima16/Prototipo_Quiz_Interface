/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author João Vitor
 */
public final class Questions {

    private String question;
    private String correctResponse;
    private String responses[];
    private String responseUser;

    public Questions(String question, String correctResponse, String Responses[]) {
        setCorrectResponse(correctResponse);
        setOtherResponses(Responses);
        setQuestion(question);
        setResponseUser(responseUser);
    }

    public String getResponseUser() {
        return responseUser;
    }

    public void setResponseUser(String responseUser) {
        this.responseUser = responseUser;
    }

    public void setCorrectResponse(String response) {
        this.correctResponse = response;
    }

    public String getCorrectResponse() {
        return correctResponse;
    }

    public void setOtherResponses(String response[]){   
        this.responses = response;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void getResponse() {
        for (String i : this.responses) {
            System.out.println(i);
        }

    }

    public boolean verifyResponse() {
       if(correctResponse.equalsIgnoreCase(getResponseUser())){
           return true;
       }
        return false;
    }

}
