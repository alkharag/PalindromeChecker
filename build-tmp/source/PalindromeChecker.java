import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String noSpace = new String();
  //removes spaces 
  for(int i=0;i<word.length();i++)
  {
     if(Character.isLetter(word.charAt(i))){noSpace += word.charAt(i);}
  }
  //return sWord.toLowerCase();

  //counts number of letters in the word
  // int count = 0;
  // for(int i = 0; i < noSpace.length(); i ++)
  // {
  //    if(Character.isLetter(noSpace.charAt(i)) == true)
  //    {
  //      count ++;
  //    }
  // }
  //return count;
  String beginning = new String();
  String ending = new String();
  for(int i =0;i < (noSpace.length()+1)/2; i++)
  {
    beginning += noSpace.substring(i,i+1);
    System.out.println(beginning);
  }
  for(int i =noSpace.length();i > (noSpace.length())/2; i--)
  {
    ending += noSpace.substring(i-1,i);
    System.out.println(ending);
  }
  if(beginning.toLowerCase().equals(ending.toLowerCase())){return true;}
  else{return false;}
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
