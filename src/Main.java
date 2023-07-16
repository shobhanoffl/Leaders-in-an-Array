import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int[] nos = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int c=0;
        for(int i=size-1; i>=0; i--){
            if(array[i]>max){
                nos[c]=array[i];
                c++;
                max=array[i];
            }
        }

        for(int i=0; i<size; i++){
            if(nos[i]!=0){
                System.out.println(nos[i]);
            }

        }

    }
}