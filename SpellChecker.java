import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker
   {
      private String[] dictionary;
      
      // WRITE Your Methods HERE!
      public void print10(){
        //for (int i = 0; i < 10; i++){
        //  System.out.println(dictionary[i]);
        int count = 1;
        for (String str : dictionary){
          System.out.println(str);
          count++;
          if (count>10){
            break;
          }
        }
      }
      

      public boolean spellcheck(String word){
        for (String str : dictionary){
          if (word.equals(str)){
            return true;
          }
        }
        return false;
      }
      public void printStartsWith(String str){
        for (String word : dictionary){
          if (word.indexOf(str)==0){
            System.out.println(word);
          }
        }
      }

      public SpellChecker() {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }

    
   }