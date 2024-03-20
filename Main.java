import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter year: ");
        int input = s1.nextInt();
        if (input%4 == 0 && input%100 != 0 || input%400 == 0){
            System.out.print("This is a leap year");
        } else {
            System.out.print("This is not a leap year");
        }
        s1.close();
    }
}