package JAVA_DSA_Kunal;

import java.util.ArrayList;

public class subsetvideo {
    public static void main(String[] args) {
//      subset(" ","abc");
        System.out.println(subset2("" ,"abc"));

    }

    static void subset(String p ,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }


    static ArrayList<String> subset2(String p , String up){
        if (up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset2(p+ch,up.substring(1));
       ArrayList<String > right=  subset2(p,up.substring(1));

       left.addAll(right);

       return left;
    }
}
