/**
 * @(#)EssayQuestion.java
 *
 *
 * @author 
 * @version 1.00 2014/12/10
 */


public class EssayQuestion extends TestQuestion{

	int blankSpaces;

    public EssayQuestion(int numberOfBlanks) {
    	this.blankSpaces = numberOfBlanks;
    }
    
    public String getQuestionFromArray(){
    	String builder = "";
    	
    	builder += this.question + "\n"; 
    	for(int i = 0; i < blankSpaces; i++){
    		builder += "__________________________________________________\n";
    	}
    	
    	builder += "\n*************************************************************\n";
    	
    	return builder;
    }
}