/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("dog or cat") >= 0 ){
            response = "Tell me more about your pets.";
        }
        if (statement.indexOf("nathan") >= 0){
            response = "Wow your teacher is cool!";
        }
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                
        {
            response = "Tell me more about your family.";
        
        }
        else if (statement.indexOf("brother") >= 0) {
            response = "I have a brother too!";
        }
        else if (statement.indexOf("gooba") >= 0){
            response = "goooooba, do you play among us?";
        }
        else if (statement.indexOf("friends") >= 0){
            response = "I don't have friends ;(";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    public String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4){
            response = "no way! me too!";
        }

        else if (whichResponse == 5){
            response = "idk, ask craig";
        }
    
        return response;
    }

    // Checks to see if the String word appears as a whole word
    // in the String str (in this case, a "whole word" means that 
    // word is not just a substring of some larger word in str)

    // This method should work regardless of the capitalization 
    // of str or word

    // The method returns the index of the first character in word
    // if it is found, and returns -1 otherwise. 
    public int findWord(String str, String word) {
        String r = str.toLowerCase();
        String w = word.toLowerCase();
        char gooba;
        char really;
        if (r.indexOf(w) == -1){
            return -1;
        }
        else{
            if (r.indexOf(w) > 0){
                gooba = r.charAt(r.indexOf(w) - 1);
            }
            else {
                gooba = ' ';
            }

            if (r.indexOf(w) + w.length() >= r.lengh()){
                really = ' ';
            }
            else{
                really = str.charAt(r.indexOf(w) + w.length());
            }
            if (gooba != ' ' && really != ' '){
                return -1;
            }
            else{
                return(r.indexOf(w));
            }
        }

    
    // We will work on the following methods later!

    /**
     * Take a statement with "I want <something>." and transform it into 
     * "Would you really be happy if you had <something>?"
     * @param statement the user statement, assumed to contain "I want"
     * @return the transformed statement
     */
    public String transformIWantStatement(String statement)
    {
        statement = statement.trim();
        String gooba = statement.substring(statement.length() - 1);
        if (gooba.equals(".")){
            statement = statement.substring(statement.length() - 1);
        }
        int kns = findWord(statement, "I want");
        String lkjos = statement.substring(kns + 7);
        return "would you really be happy if you had " + lkjos + "?";
    }


    /**
     * Take a statement with "I <something> you" and transform it into 
     * "Why do you <something> me?"
     * @param statement the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     */
    public String transformIYouStatement(String statement)
    {
        statement = statement.trim();
        String asl = statement.substring(statement.length() - 1);
        if (asl.equals(".")){
            statement = statement.substring(statement.length() - 1);
    
        }
        int oue = findWord(statement, "I");
        int weq = findWord(statement, "You");
        String you = statement.substring(oue + 1, weq).trim();

        return ("Why do you " + you + " me?");

    }

    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement)
    {
        statement = statement.trim();
        String asl = statement.substring(statement.length() - 1);
        if (asl.equals(".")){
            statement = statement.substring(statement.length() - 1);
    
        }
        int bd = findWord(statement, "I want to");
        String oir = statement.substring(bd + 9).trim();
        return "What would it mean to " + jkl + "?";
    }




    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement)
    {
        statement = statement.trim();
        String asl = statement.substring(statement.length() - 1);
        if (asl.equals(".")){
            statement = statement.substring(statement.length() - 1);
    
        }
        int oiuy = findWord(statement, "You");
        int pouss = findWord(statement, "Me");
        String llakdsf = statement.substring(oiuy + 3, pouss).trim();
        return "What makes you think that I " + llakdsf + " you?";
    }
}
