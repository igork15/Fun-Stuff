
/*
Method takes two strings and finds the ASCII deletion distance between the two strings.
*/
public int distance(String str1, String str2){

//Initialize distance to 0
int distance = 0;
int str1Length = str1.length();
int str2Length = str2.length();

//Must check the length of the strings
if(str1Length == str2Length){
    int j = 0;//initialize index for other string

    for(int i = 0; i < str1Length; i++){
        int one = str1.charAt(i);
        int two = str2.charAt(j);
    
        if(one == two){
        //do nothing
       
        }else{
            distance += one + two;       
        }

        j++;
    }
//This executes if str2 is greater than str1    
}else if(str2Length > str1Length){
    int foo = str2Length - str1Length-1;//Finding the difference between both string lengths to determine how long the loop should go
    int j = str2Length-1;//Initialize index for other string

    //This loop is meant to add the characters that don't have a corresponding character to the distance counter 
    //
    //                              ex: cat     ex: ballcap
    //                                   at             cap
    //the cat example the 'c' will
    //be added to the distance counter
    //the ballcap example the 'b' 'a' 'l' 'l'
    //will be added to the counter
    for(int k = 0; k <= foo; k++){
        distance += str2.charAt(k);
        
    }

    //Starting at the length of str1(shorter string) so we can go backwards through the strings. Once the loop is done we will have 
    //gone through all the parallel characters, such as "cap" in ballcap and cap or the "at" in cat and at. As we're doing that we
    //check for equality, if they're equal we do nothing, if they are different we add both values to the distance variable.
    for(int i = str1Length-1; i >= 0; i--){
        int one = str1.charAt(i);
        int two = str2.charAt(j);
    
        if(one == two){
        //do nothing
       
        }else{
            distance += one + two; 
        }

        j--;
    } 
//This executes if str1 is greater than str2. Same logic as above.
}else if(str1Length > str2Length){
    int foo = str1Length - str2Length-1;
    int j = str1Length-1;

    for(int k = 0; k <= foo; k++){
        distance += str1.charAt(k);
    }

    for(int i = str2Length-1; i >= 0; i--){
        int one = str1.charAt(j);
        int two = str2.charAt(i);
    
        if(one == two){
        //do nothing
       
        }else{
            distance += one + two; 
        }

        j--;
    }  
}
return distance;
}