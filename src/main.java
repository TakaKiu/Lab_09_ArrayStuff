import java.util.Random;
import java.util.Scanner;
class Lab_09_ArrayStuff {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i > 0) {
                System.out.print(" | ");
            }
            System.out.printf("%d", dataPoints[i]);
        }


        int sum = sum(dataPoints);
        double average = (double) sum / dataPoints.length;

        System.out.println("\n\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);


        Scanner scanner = new Scanner(System.in);
        int userValue = 0;
        while (true) {
            System.out.print("Enter an integer between 1 and 100: ");
            userValue = scanner.nextInt();

            if (userValue >= 1 && userValue <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
            }
        }


        int count = occuranceScan(dataPoints, userValue);
        System.out.println("\nThe value " + userValue + " appears " + count + " times in the array.");


        while (true) {
            System.out.print("Enter another integer between 1 and 100: ");
            userValue = scanner.nextInt();

            if (userValue >= 1 && userValue <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
            }
        }


        int position = indexOf(dataPoints, userValue);
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }


        int min = min(dataPoints);
        int max = max(dataPoints);

        System.out.println("\nMinimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);


        double avg = getAverage(dataPoints);
        System.out.println("Average of dataPoints is: " + avg);


        System.out.println("The dataPoints array " + (contains(dataPoints, userValue) ? "contains" : "does not contain")
                + " the value " + userValue);
    }


    public static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static int occuranceScan(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }


    public static int indexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    public static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}