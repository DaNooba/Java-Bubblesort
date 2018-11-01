package bubblesort;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bubblesort {

    // Start program
    public static void main(String[] args) {
        try {
            JFrame window = new JFrame("Bubblesort");
            window.setContentPane(new GUI());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.pack();
            window.setVisible(true);
        } catch (Exception e) {
            System.exit(0);
        }

    }

    //Sort array
    public static String[] sort(String range, String lenght) {
        int unorderedList[] = { 8, 5, 10, 15, 3, 1, 13, 2, 4, 12 };
        if (GUI.checkButton()) {
            // So called "input validation"
            try {
                unorderedList = convertIntegers(generateRandomArray(Integer.parseInt(lenght), Integer.parseInt(range)));
            } catch (Exception e) {
                System.exit(0);
            }
        }

        String unordered = "";
        // Array to string
        for (int i : unorderedList)
        {
            unordered = unordered + i + ", ";
        }

        String output = "";
        String out[] = {"", "", ""};
        out[1] = unordered.substring(0, unordered.length()-2);

        long startTime = System.currentTimeMillis();

        int tmp[] = bubblesort(unorderedList);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        out[2] = Long.toString(elapsedTime);

        for (int i : tmp)
        {
            output = output + i + ", ";
        }



        // output = output.substring(1, output.length()-1);
        out[0] = output.substring(0, output.length()-2);
        return out;

    }

    private static int[] bubblesort(int[] nums)
    {
        boolean done = false;

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

        return nums;
    }

    // Generates a random list
    private static List<Integer> generateRandomArray(int lenght, int range){
        ArrayList<Integer> list = new ArrayList<Integer>(lenght);
        Random random = new Random();

        for (int i = 0; i < lenght; i++)
        {
            list.add(random.nextInt(range));
        }
        return list;
    }

    // Converts random list to array
    private static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

}
