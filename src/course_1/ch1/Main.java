package course_1.ch1;

public class Main {
    public static void PrintFizzBuzzRizzJazz(){
        //unfinished
        for(int i=1; i<=100; i++){
            if(i%3==0){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }
            if(i%7==0){
                System.out.print("Rizz");
            }
            if(i%11==0){
                System.out.print("Jazz");
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        PrintFizzBuzzRizzJazz();
    }
}
