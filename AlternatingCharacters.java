import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
		
	Start From index 1 of the string, since we'll be comparing the character of the string at index i with 
	the character of the string at index i-1
	If two consecutive characters are equal, increment the number of minimum deletions needed
		
	*/
    
    static int minDeletions(String s){
        int minDeletes = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                minDeletes++;
            }
        }
        
        return minDeletes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(minDeletions(in.next()));
        }
    }
}
