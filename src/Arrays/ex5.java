package Arrays;

public class ex5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = i*3;
        }
        for(int i = 0; i < 10; i++){
            if(i<9) {
                System.out.print(array[i] + ",");
            }else{
                System.out.println(array[i]);
            }
        }


    }
}
