//Takes a string and translates it to Pig Latin.
//Can translate an entire sentence.
public String toPigLatin(String string){
 String result = "";
 String tempPig = "";
 
 for(int i = 0; i <= string.length()-1; i++){
     char ch = string.charAt(i);
     
     if(ch != ' '){
         tempPig += ch;
     }else if(ch == ' ' && i > 0 && tempPig != ""){
         result += strToPig(tempPig) + " ";
         tempPig = "";
     }if(i == string.length()-1 && ch != ' '){
         result += strToPig(tempPig) + " ";
     }
 }
 
return result;
}

//Takes a string and translates it to English from Pig Latin
//Can translate an entire sentence.
public String toEnglish(String string){
 String result = "";
 String tempEng = "";
 
 for(int i = 0; i <= string.length()-1; i++){
     char ch = string.charAt(i);
     
     if(ch != ' '){
         tempEng += ch;
     }else if(ch == ' ' && i > 0 && tempEng != ""){
         result += strToEng(tempEng) + " ";
         tempEng = "";
     }if(i == string.length()-1 && ch != ' '){
         result += strToEng(tempEng) + " ";
     }
  }
 
 
 return result;
}

//Translates a single word to pig latin
public String strToPig(String string){
 return string.substring(1, string.length()) + string.charAt(0) + "ay";
}
//Translates a single word to English
public String strToEng(String string){
 return string.charAt(string.length()-3) + string.substring(0, string.length()-3);
}