import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu : ");
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<n; i ++){
            System.out.println((i+1)  + " . Elemanı : ");
            int a = input.nextInt();
            list.add(a);
        }
        System.out.println("Tekrar sayıları : ");
        for(int i = 0 ; i<n;i++){
            int check = list.get(i);
            for (int j = 0 ; j<n;j++){
                if (check == list.get(j)){
                    count++;
                }
                if (j==n-1){
                    System.out.println(check + " sayısı " + count + " kere tekrar edildi");
                    count = 0;
                }
            }


        }

    }
}