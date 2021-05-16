package course_1.ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Cate elemente sunt?");
        int number = sc.nextInt();

        System.out.println("Introduceti elementele:");
        for(int i = 0; i < number; i++)
        {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        int i = 0, counter = 0, poz;

        while(arrayList.size() != 0 && i < arrayList.size()){
            //System.out.println("Element: " + arrayList.get(i));
            poz = Collections.binarySearch(arrayList,(arrayList.get(i) *(-1)));
            if(poz >= 0 && poz != i){
                //System.out.println("Poz Opus: " + poz);
                arrayList.remove(poz);
                arrayList.remove(i);
                counter++;
                continue;
            }
            i++;

        }

        System.out.println("Numarul de perechi:");
        System.out.println(counter);


    }
}
