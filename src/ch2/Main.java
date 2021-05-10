package ch2;

public class Main {
    public static String FooBarQix(int n){
        String toReturn ="";
        if(n%3==0){
            toReturn+="Foo";
        }
        if(n%5==0){
            toReturn+="Bar";
        }
        if(n%7==0){
            toReturn+="Qix";
        }

        while (n!=0){
            if(n%10==3)
                toReturn+="Foo";
            if(n%10==5)
                toReturn+="Bar";
            if(n%10==7)
                toReturn+="Qix";

            n /=10;

        }
        return toReturn;
    }
    public static void main(String[] args) {
        int n = 3155;
        System.out.println(FooBarQix(n));

    }
}
