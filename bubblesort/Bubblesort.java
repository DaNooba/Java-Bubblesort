package bubblesort;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bubblesort {

    // Start program
    public static void main(String[] args) {
        //error handling
        try {
            // create jframe
            JFrame window = new JFrame("Bubblesort");
            window.setContentPane(new GUI());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.pack();
            window.setVisible(true);
        } catch (Exception e) {
            // well, "error handling" might be a bit of a stretch
            System.err.println("Application has stopped working"); System.exit(1);
        }

    }

    //Sort array
    public static String[] sort(String range, String lenght) {
        // preset array and other variables
        int unorderedList[] = { 8, 5, 10, 15, 3, 1, 13, 2, 4, 12 };
        String output = "";
        String out[] = {"", "", ""};
        String unordered = "";

        // see if we should generate random numbers
        if (GUI.checkButton()) {
            // So called "input validation"
            try {
                // generate random array
                unorderedList = generateRandomArray(Integer.parseInt(lenght), Integer.parseInt(range));
            } catch (Exception e) {
                // return error message
                out[0] = "Please enter valid numbers.";
                return out;
            }
        }

        // Array to string
        for (int i : unorderedList)
        {
            unordered = unordered + i + ", ";
        }

        // unsorted array goes here
        out[1] = unordered.substring(0, unordered.length()-2);

        // check current time
        long startTime = System.currentTimeMillis();

        // actually sort the array
        int tmp[] = bubblesort(unorderedList);

        // calculate runtime
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        // time goes here
        out[2] = Long.toString(elapsedTime);

        // array to string
        for (int i : tmp)
        {
            output = output + i + ", ";
        }

        // sorted array goes here
        out[0] = output.substring(0, output.length()-2);
        return out;

    }

    // sorts array
    private static int[] bubblesort(int[] nums)
    {
        boolean done = false;

        // iterate over array and check if it's not already sorted
        for (int i = 0;  i < nums.length && !done; i++)
        {
            done = true;

            for (int j = nums.length-1; j > i; j--)
            {
                if (nums[j] < nums[j-1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    done = false;
                }
            }
        }

        // return sorted array
        return nums;
    }

    // Generates a random array
    private static int[] generateRandomArray(int length, int range){
        int list[] = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++)
        {
            list[i] = random.nextInt(range);
        }
        return list;
    }

}
