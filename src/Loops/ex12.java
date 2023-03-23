package Loops;

public class ex12 {
    public static void main(String[] args) {
       for(int i = 100; i < 1000; i++){
           int a = i/100;
           int b = (i/10)%10;
           int c = i%10;
           if(a != b && b != c && a != c){
               System.out.println(i);
           }
       }

    }
}
