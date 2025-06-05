package JAVA_DSA_Kunal.Algorithms;

public class KarpRabinAlgo {

    private static final int prime = 101;

    private double calculateHash(String str){
        double hash = 0;

        for (int i =0 ; i< str.length();i++){
            hash = hash + str.charAt(i) * Math.pow(prime,i);
        }
        return hash;
    }



}
