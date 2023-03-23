package Arrays;

import java.util.Scanner;

public class ubung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int obem;
        int kofa2 = 0;
        int kofa1 = 0;
        System.out.println("Type in obem: ");
        obem = input.nextInt();
        int kofa = 2;

        do{
            if(kofa == 2) {
                kofa = 3;
                if(obem < 3){
                    break;
                }
            }else {
                kofa = 2;
            }
            obem = obem - kofa;
            if(kofa == 2){
                kofa1++;
            } else{
                kofa2++;
            }

        }while(obem > 1);

        System.out.println("Broi kofi ot 2 litra = " + kofa1);
        System.out.println("Broi kofi ot 3 litra = " + kofa2);
    }
}

