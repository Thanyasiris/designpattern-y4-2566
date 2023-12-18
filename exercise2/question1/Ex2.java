import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    // รับเลข
    public static List<Integer> getInput(List<Integer> nums) {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);

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
    public static void collect(List<Integer> nums) {
        Collections.sort(nums);
    }

    // แสดงผล
    public static void display(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums = getInput(nums);
        collect(nums);
        display(nums);
    }
}