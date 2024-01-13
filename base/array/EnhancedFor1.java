package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for 문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("------------------------");

        /*향상된 for 문 == for-each 문 */

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
