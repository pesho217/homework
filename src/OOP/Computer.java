package OOP;
import java.util.Scanner;
public class Computer {
    Scanner input = new Scanner(System.in);
    int year;
    int price;
    static boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

    void changeOperationSystem(String newoperationSystem){
        operationSystem = newoperationSystem;
    }

    void useMemory(int memory){
        if(memory <= freeMemory) {
            freeMemory = freeMemory - memory;
        }else{
            System.out.println("Not enough free Memory!");
        }
    }

    public static void main(String[] args) {
        Computer Computer1 = new Computer();
        Computer1.year = 2020;
        Computer1.price = 1000;
        Computer1.isNotebook = false;
        Computer1.hardDiskMemory = 1000;
        Computer1.freeMemory = 200;
        Computer1.operationSystem = "Linux";
        Computer1.useMemory(100);

        Computer Computer2 = new Computer();
        Computer2.year = 2021;
        Computer2.price = 2000;
        Computer2.isNotebook = true;
        Computer2.hardDiskMemory = 500;
        Computer2.freeMemory = 150;
        Computer2.operationSystem = "Windows";
        Computer2.changeOperationSystem("IOS");

        System.out.println("The year of the first Computer is: " + Computer1.year) ;
        System.out.println("The free Memory of the first Computer is: " + Computer1.freeMemory);
        System.out.println("The price of the second Computer is: " + Computer2.price);
        System.out.println("The operation System of the second Computer is: " + Computer2.operationSystem);
    }

}


