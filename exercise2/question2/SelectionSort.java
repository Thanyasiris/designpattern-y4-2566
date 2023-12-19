import java.util.Collections;
import java.util.List;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> nums) {
        Collections.sort(nums);
        System.out.println("Selection sort is sorting the items " + nums.toString());
    }
}
