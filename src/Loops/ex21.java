package Loops;
import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int a1 = a;
        String b ;
        String c = "k";
        int check = 0;

      do {
          if(a%2 == 0){
              if(a%4 == 0){
                  b = "Pika";
              }else{
                  b = "Karo";
              }
          }else {
              while (a1 > 0) {
                  if (a1 == 3) {
                      check = 2;
                      break;
                  } else {
                      check = 1;
                  }
                  a1 = a1 - 4;
              }
              if (check == 1) {
                  b = "Spatiq";
              } else {
                  b = "Kupa";
              }
          }
          if (a <= 4) {
              c = "Dvoika";
          } else if (a <= 8) {
              c = "Troika";
          } else if (a <= 12) {
              c = "Chetvorka";
          } else if (a <= 16) {
              c = "Petica";
          } else if (a <= 20) {
              c = "Shestica";
          } else if (a <= 24) {
              c = "Sedmica";
          } else if (a <= 28) {
              c = "Osmica";
          } else if (a <= 32) {
              c = "Devqtka";
          } else if (a <= 36) {
              c = "Desqtka";
          } else if (a <= 40) {
              c = "Vale";
          } else if (a <= 44) {
              c = "Dama";
          } else if (a <= 48) {
              c = "Pop";
          } else if (a <= 52) {
              c = "Aso";
          }
          System.out.println(c + " " + b);
          a = a + 1;
          a1 = a;

      }while(a != 53);

    }
}
