/**
 * @(#)TestMain.java
 *
 *
 * @author 
 * @version 1.00 2014/12/10
 */
import java.util.*;

public class TestMain {

    public static void main(String[] args)

    {

               String [] TestType = {"Multiple Choice", "Essay"};

               int nbrOfLines = 0;

               ArrayList testList = new ArrayList();

 				do{
 				
					int choice = GetInfo.getOption("Which type of question would you like?", TestType);
               
              		if(choice == 0){
  						MultipleChoice mult = new MultipleChoice(GetInfo.getInt("How many choices"));      
  					
  						testList.add(mult);     	
              		}else if(choice == 1){
						EssayQuestion essay = new EssayQuestion(GetInfo.getInt("How many line breaks?"));
				
						testList.add(essay);
              		}
 				}while(GetInfo.getYesNo("Would you like to input another question?"));

				String builder = "";
   
				for(Object obj : testList){
					TestQuestion question = (TestQuestion) obj;
					
					builder += question.getQuestionFromArray();
				}
				
				GetInfo.showMessage(builder);
    }
    
    
}