package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        Optional<Integer> secondSmallest = nums.stream().distinct().sorted().skip(1).findFirst();
        Optional<Integer> secondLargest = nums.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
        if (secondSmallest.isPresent()) {
            System.out.println("Second smallest element: " + secondSmallest.get());
        } else {
            System.out.println("The list does not have a second smallest element.");
        }

        if (secondLargest.isPresent()) {
            System.out.println("Second largest element: " + secondLargest.get());
        } else {
            System.out.println("The list does not have a second largest element.");
        }
    }
}

