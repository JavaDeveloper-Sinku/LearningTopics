package JAVA_DSA_Kunal;

public class recursion {
    public static void main(String[] args) {

        System.out.println(febi(10));
    }

    static int febi(int n){
        if (n < 2){
            return n;
        }

        return febi(n-1) + febi(n-2);

    }
}
