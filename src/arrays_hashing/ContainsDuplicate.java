import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 4};
        System.out.println(hasDuplicate(nums));
    }

    // Single method that returns boolean
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // duplicate found
            }
            set.add(num);
        }
        return false;  // no duplicates
    }
}
