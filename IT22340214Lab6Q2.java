import java.util.Scanner;

public class IT22340214Lab6Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 0;
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
            i++;
        }

        System.out.println("\nThe numbers you entered are:");

        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        average = (double) sum / 10;

        System.out.println("\n\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        sc.close();
    }
}