import java.util.*;
public class pass{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String number="1234567890,./<>?;:[]{}!@#$%^&*()_+-=";
        String combination=upper+lower+number;
        int len=8;
        char pass[]= new char[len];
        Random r= new Random();
        for(int i=0;i<len;i++){
            pass[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password is:"+new String(pass));
    }
}