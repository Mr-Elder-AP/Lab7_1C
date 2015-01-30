public abstract class TestQuestion

{

    protected String question;

    public TestQuestion()
    {

    	question = GetInfo.getString("INPUT the Question here: ");

    }

    //-------------------------------------------------------------------------------------------------------------------------------------

    //  Abstract Method  -  Used in the children to read questions stored in an array in the driver program.

    //-------------------------------------------------------------------------------------------------------------------------------------

    public abstract String getQuestionFromArray();

}