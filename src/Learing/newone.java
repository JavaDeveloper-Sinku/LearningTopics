package Learing;


import java.sql.SQLOutput;

public class newone {

    public static int getMaxDeletions(String s) {
        // Write your code here
        int deletions = 0;
        for(int i = 1 ; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                deletions++;
            }
        }

        return deletions;
    }


    public static void match(String s ){

        for (int i = 0; i<= s.length();i++){
        }
    }


    public static void main(String[] args) {


        String name  ="RUDRL";

        System.out.println(getMaxDeletions(name));

    }



}
