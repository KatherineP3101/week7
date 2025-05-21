import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);

        System.out.println("Provided array: " + Arrays.toString(nums));
        System.out.println("Expected array: " + Arrays.toString(expectedNums));
        System.out.println(Arrays.equals(result, expectedNums));

        System.out.println("Exercise 2");
        System.out.println(BracketChecker.isValid("([)]"));
        System.out.println(BracketChecker.isValid("(]"));
        System.out.println(BracketChecker.isValid("()[]{}"));
        System.out.println(BracketChecker.isValid("()"));

        System.out.println("Exercise 3");
        String input = "hello world";
        System.out.println("Input text: " + input);
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.merge(c, 1, Integer::sum);
        }

        charCountMap.forEach((key, value) ->
                System.out.println(key + " - " + value)
        );

        System.out.println("Exercise 4");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Original list: " + list); // [1, 2, 3, 4, 5, 6]

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("List after deleting all the even numbers: " + list);

    }

    private static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int k = i + 1; k < nums.length; k++) {
            nums[k] = 0;
        }

        return nums;
    }


}