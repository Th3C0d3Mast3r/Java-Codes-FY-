import java.util.Arrays;
import java.util.Scanner;

public class GradeStat {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the Number of entries (or enter -1 to exit): ");
            int n = obj.nextInt();

            if (n == -1) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            int marks[] = new int[n]; // array creation
            System.out.println("Enter " + n + " Marks below:");
            for (int i = 0; i < n; i++)
            {
                marks[i] = obj.nextInt();
            }
            display(n, marks);

            int num;
            do {
                System.out.println("WHAT DO YOU WANT TO SEE NOW?");
                System.out.println("(1) AVERAGE\n(2) MEDIAN\n(3) MAX and MIN\n(4) STANDARD DEVIATION");
                System.out.println("(Enter -1 to go back to the number of entries input)");

                num = obj.nextInt();

                switch (num) {
                    case 1:
                        avg(marks);
                        break;

                    case 2:
                        median(marks);
                        break;

                    case 3:
                        minMax(marks);
                        break;

                    case 4:
                        stdev(marks);
                        break;

                    case -1:
                        System.out.println("Going back to the number of entries input.");
                        break;

                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                        break;
                }
            } while (num != -1);
        }
    }

    private static void display(int n, int marks[]) {
        System.out.println("Marks entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    private static void avg(int marks[]) {
        double avg = 0;
        for (int mark : marks) {
            avg += mark;
        }
        avg = avg / marks.length;
        System.out.println("THE AVERAGE IS: " + avg);
    }

    private static void minMax(int marks[]) {
        Arrays.sort(marks);
        int len = (marks.length) - 1;
        System.out.println("THE MINIMUM IS: " + marks[0]);
        System.out.println("THE MAXIMUM IS: " + marks[len - 1]);
    }

    private static void median(int marks[]) {
        double medians = 0;
        int mids = (marks.length) / 2;
        if (marks.length % 2 == 0) // case of even data
        {
            medians = (marks[mids - 1] + marks[mids]) / 2.0;
            System.out.println("MEDIAN IS: " + medians);
        } else {
            mids = (marks.length + 1) / 2;
            medians = marks[mids - 1];
            System.out.println("MEDIAN IS: " + medians);
        }
    }

    private static void stdev(int[] marks) {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double mean = sum / marks.length;
        double squaredDifferencesSum = 0;
        for (int mark : marks) {
            double difference = mark - mean;
            squaredDifferencesSum += Math.pow(difference, 2);
        }
        double variance = squaredDifferencesSum / marks.length;
        double stdDeviation = Math.sqrt(variance);

        System.out.printf("THE STANDARD DEVIATION IS: %.2f", stdDeviation);
    }
}