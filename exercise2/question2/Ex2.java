import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    // รับเลข
    public static List<Integer> getInput() {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < MAX) {

            String s = inp.nextLine();

            if (!validateNumber(s)) {
                continue;
            }
            int num = Integer.parseInt(s);
            if (!validateRange(num)) {
                continue;
            }
            nums.add(num);
        }

        inp.close();

        return nums;
    }

    // รับ Sorting Algorithm
    public static String getSortingAlgorithm() {
        String algorithm = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What algorithm to sort? 1. Seletion Sort, 2. Merge Sort, 3. Insertion Sort ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                algorithm = "Seletion Sort";
                break;
            case 2:
                algorithm = "Merge Sort";
                break;
            case 3:
                algorithm = "Insertion Sort";
                break;
            default:
                break;
        }
        inp.close();
        return algorithm;
    }

    // ตรวจสอบ type
    public static Boolean validateNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        return true;
    }

    // ตรวจสอบ range
    public static Boolean validateRange(int num) {
        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    // จัดเรียง
    public static void collect(List<Integer> nums, SortingAlgorithm algorithm) {
        // this is a typical implementation of the loosely coupled system
        // this class knows nothing about the question and its type (!!!)
        // THIS IS PURE ABSTRACTION
        algorithm.sort(nums);
    }

    // แสดงผล
    public static void display(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        List<Integer> nums = getInput();
        String type = getSortingAlgorithm();
        SortingAlgorithm algorithm = null;
        switch (type) {
            case "Seletion Sort":
                algorithm = new SelectionSort();
                break;
            case "Merge Sort":
                algorithm = new MergeSort();
                break;
            case "Insertion Sort":
                algorithm = new InsertionSort();
                break;
            default:
                break;
        }
        collect(nums, algorithm);
        display(nums);
    }
}