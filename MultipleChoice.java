/**
 * @(#)MultipleChoice.java
 *
 *
 * @author 
 * @version 1.00 2014/12/10
 */


public class MultipleChoice extends TestQuestion{

	public int choicesCount;
	public String[] choices;
	
	public boolean onOneLine;

    public MultipleChoice(int choicesCount) {
    	super();
    	this.choicesCount = choicesCount;
    	this.choices = new String[choicesCount];
    	
    	for(int i = 0; i < choicesCount; i++){
    		choices[i] = GetInfo.getString("Enter choice #" + (i+1));
    	}
    	
  		onOneLine = GetInfo.getYesNo("Would you like the questions to be on one line?");
    }
    
    public String getQuestionFromArray(){
		String builder = "";
		builder += this.question + "\n";
		
		for(int i = 0; i < choices.length; i++){
			builder += (i + 1) + ") " + choices[i] + (onOneLine ? "   " : "");
			builder += onOneLine ? "" : "\n";
		}
		
		builder += "\n*************************************************************\n";
		
		return builder;
    }
    
}