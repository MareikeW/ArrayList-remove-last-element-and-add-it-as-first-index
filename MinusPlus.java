import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*This program reads four Strings from the keyboard and puts them into an ArrayList. 
Then the last element will be removed and put at first place in the ArrayList. This happens two times.
At the end the new word order will be displayed.*/

public class MinusPlus { 
    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> wordList = new ArrayList<String>();
        System.out.println("Please enter four words:");
        
        for (int i=0; i<4; i++){
            String s = reader.readLine(); //reads four words from the keyboard
            wordList.add(s);
        }
        for (int i = 0; i<2; i++){ //this procedure happens twice
            String s = wordList.remove(3); //removes the last element in the list
            wordList.add(0,s); //adds the last element to the front of the list
        }
        for (int i=0; i<wordList.size(); i++){
            System.out.println(wordList.get(i)); //the new list order gets displayed
        }
    }
}
