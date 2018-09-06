     public int distance(String str1, String str2){

        int distance = 0;
        if(str1.length() == str2.length()){
            int j = 0;
            for(int i = 0; i < str1.length(); i++){
                int one = str1.charAt(i);
                int two = str2.charAt(j);
            
                if(one == two){
                //do nothing
               
                }else{
                    distance += one + two;
                
                
                }
                j++;
            }
        }else if(str2.length() > str1.length()){
            int foo = str2.length() - str1.length()-1;
            int j = str2.length()-1;
            for(int k = 0; k <= foo; k++){
                distance += str2.charAt(k);
                
            }
            for(int i = str1.length()-1; i >= 0; i--){
                int one = str1.charAt(i);
                int two = str2.charAt(j);
            
                if(one == two){
                //do nothing
               
                }else{
                    distance += one + two;
                
                
                }
                j--;
            }            
        }else if(str1.length() > str2.length()){
            int foo = str1.length() - str2.length()-1;
            int j = str1.length()-1;
            for(int k = 0; k <= foo; k++){
                distance += str1.charAt(k);
            }
            for(int i = str2.length()-1; i >= 0; i--){
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