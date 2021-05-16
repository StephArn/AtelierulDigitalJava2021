package course_1.ch4;

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

        int i = 0, counter = 0;

        while(arrayList.size() != 0 && i < arrayList.size())
        {
            int l = i + 1;
            int r = arrayList.size() - 1;
            int x = arrayList.get(i);
            boolean found = false;
            while (l < r)
            {
                if (x + arrayList.get(l) + arrayList.get(r) == 0)
                {
                    //System.out.print(x+" "+arrayList.get(l) +" "+ arrayList.get(r));
                    counter++;
                    arrayList.remove(r);
                    arrayList.remove(l);
                    arrayList.remove(i);
                    found = true;
                    break;
                }

                else if (x + arrayList.get(l) + arrayList.get(r) < 0)
                    l++;

                else
                    r--;
            }
            if(found) continue;
            i++;
        }

        System.out.println("Numarul de perechi:");
        System.out.println(counter);
    }
}
