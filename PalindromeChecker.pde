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

