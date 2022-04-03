package roar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortingTheOddPositionArrayMethod {
    public  void sorter(Object... array)  {
        ArrayList<Integer> b = new ArrayList<>();
        int z = 0;
        for (int i = 0; i < array.length; i++){
            if ((Integer) array[i] % 2 != 0)
                b.add(i);
        }
        int c[] = new int[b.size()];
        for (int i = 0; i < b.size(); i++) {
            int f = b.get(i);
            c[i] =(int) array[f];
        }
        Arrays.sort(c);
        for (int i = 0; i < b.size(); i++) {
            int i1 = b.get(i);
            array[i1] = c[i];

        }
        System.out.print("[");
        for (int f = 0; f < array.length; f++) {
            if (f == array.length - 1){
                System.out.print(array[f]);
                break;
            }
            System.out.print(array[f] + ", ");
        }
        System.out.println("]");


    }
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        Scanner f = new Scanner(System.in);
        while (true){
            int v = f.nextInt();
            if(v == 0){
                break;
            }
            ls.add(v);
        }
        SortingTheOddPositionArrayMethod l = new SortingTheOddPositionArrayMethod();
        l.sorter(ls.toArray());

        // System.out.println(GenM.maximum("Ahmed",4));
    }
}
