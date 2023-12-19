import java.util.Collections;
import java.util.List;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> nums) {
        Collections.sort(nums);
        System.out.println("Merge sort is sorting the items " + nums.toString());
    }
}
