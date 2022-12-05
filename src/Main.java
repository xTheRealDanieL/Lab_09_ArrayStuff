import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        int count=0;
        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        for (int l = 0; l < dataPoints.length; l++) {
            dataPoints[l] = gen.nextInt(100);
        }

        for (int l = 0; l < dataPoints.length; l++) {
            System.out.printf("%4d", dataPoints[l]);
            System.out.print(" |");
        }

        int sum = 0;
        double ave = 0;

        for (int l = 0; l < dataPoints.length; l++) {
            sum += dataPoints[l];
        }

        ave = sum / dataPoints.length;

        System.out.println();
        System.out.println("The average of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + ave);
        System.out.println("Sum using public static method: " + sum(dataPoints));

        int target = SafeInput.getRangedInt(in, "Enter a value you want to find", 1, 100);

        for (int l = 0; l < dataPoints.length; l++) {
            dataPoints[l] = gen.nextInt(100);
        }

        for (int l = 0; l < dataPoints.length; l++) {
            System.out.printf("%4d", dataPoints[l]);
            System.out.print(" |");
        }

        System.out.println();

        for (int l = 0; l < dataPoints.length; l++) {
            if (dataPoints[l] == target) {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("The target value was found " + count + " time");
        } else if (count ==0)
        {
            System.out.println("The target value wasn't found");
        } else
        {
            System.out.println("The target value was found " + count + " times");
        }
        System.out.println("Finding target using public static method: " + occuranceScan(dataPoints,68));
        System.out.println("Finding target using public static method which return boolean: " + contains(dataPoints,68));

        boolean found=false;

        int val = SafeInput.getRangedInt(in, "Enter a value you want to find", 1, 100);

        for (int l = 0; l < dataPoints.length; l++) {
            dataPoints[l] = gen.nextInt(100);
        }

        for (int l = 0; l < dataPoints.length; l++) {
            System.out.printf("%4d", dataPoints[l]);
            System.out.print(" |");
            if (dataPoints[l] == val) {
                System.out.println();
                System.out.println("The value " + val + " was found at array index " + l);
                found=true;
                break;
            }
        }
        System.out.println();
        if(!found)
        {
            System.out.println("Did not find the value " + val);
        }

        int max = dataPoints[0];
        int min = dataPoints[0];

        for (int l = 0; l < dataPoints.length; l++) {
            if(dataPoints[l] > max)
            {
                max = dataPoints[l];
            }
            if(dataPoints[l] < min)
            {
                min = dataPoints[l];
            }
        }

        for (int l = 0; l < dataPoints.length; l++) {
            System.out.printf("%4d", dataPoints[l]);
            System.out.print(" |");
        }

        System.out.println();
        System.out.println("The min is " + min);
        System.out.println("Finding min using public static method: " + min(dataPoints));
        System.out.println("The max is " + max);
        System.out.println("Finding max using public static method: " + max(dataPoints));



        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }

    public static double getAverage(int values[])
    {
        double ave= 0;
        double total=0;

        for(int l=0; l < values.length; l++)
        {
            total += values[l];
        }
        ave = total/ values.length;
        return ave;
    }

    public static int min(int values[])
    {
        int min = values[0];

        for (int l = 0; l < values.length; l++) {
            if(values[l] < min)
            {
                min = values[l];
            }
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = values[0];

        for (int l = 0; l < values.length; l++) {
            if(values[l] > max)
            {
                max = values[l];
            }
        }
        return max;
    }

    public static int occuranceScan(int values[], int target)
    {
        int count=0;
        for (int l = 0; l < values.length; l++) {
            if (values[l] == target) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int values[])
    {
        int sum=0;
        for (int l = 0; l < values.length; l++) {
            sum += values[l];
        }
        return sum;
    }

    public static boolean contains(int values[], int target)
    {
        boolean found=false;
        for (int l = 0; l < values.length; l++) {
            if (values[l] == target) {
                found=true;
            }
        }
        return found;
    }
}
