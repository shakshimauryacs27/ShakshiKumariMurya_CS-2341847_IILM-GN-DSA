class Solution {
    public String longestCommonPrefix(String[] strs) {
        
         Arrays.sort(strs);
         String string1= strs[0];
         String string2 = strs[strs.length-1];
         int i=0;
         while( i< string1.length()){
            if(string1.charAt(i)==string2.charAt(i)){
                 i++;
            }
            else {break;
            }

         }
         if(i==0) return "";
         else return string1.substring(0,i);
         }
    }