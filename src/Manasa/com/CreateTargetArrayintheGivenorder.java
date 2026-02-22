package Manasa.com;
import java.util.Scanner;

public class CreateTargetArrayintheGivenorder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];
        int[] target = new int[n];

        // Read nums array
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Read index array
        for (int i = 0; i < n; i++) {
            index[i] = input.nextInt();
        }

        // Create target array
        for (int i = 0; i < n; i++) {

            // Shift elements to the right
            for (int j = n - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            // Insert element at correct position
            target[index[i]] = nums[i];
        }

        // Print target array
        for (int i = 0; i < n; i++) {
            System.out.print(target[i] + " ");
        }
    }
}