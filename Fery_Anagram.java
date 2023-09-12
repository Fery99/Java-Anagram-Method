package ProjectTaik.BelajarJava.Tugas13;

import java.util.Arrays;

public class Fery_Anagram {
    static boolean Nilai (String A, String B){
        A= A.toLowerCase();
        B= B.toLowerCase();
        char [] a= A.toCharArray();
        char [] b= B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a, b);
        return result;
    }
    public static void main(String[] args) {
        String A, B;
        A= "CATaCttCA";
        B= "tacTaCAct";
        Boolean hasil = Nilai(A, B);
        System.out.println("Analisis Anagram, Variable A & B adalah.." + hasil);
    }
}


