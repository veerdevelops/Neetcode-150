import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 4};

        // Single method solution
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                System.out.println("Contains duplicate? true");
                return;  // exit immediately when duplicate found
            }
            set.add(num);
        }
        System.out.println("Contains duplicate? false");
    }
}
