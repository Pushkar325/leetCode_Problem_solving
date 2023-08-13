import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingNinja {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int targetSum) {
        ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
         int n=arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int left = i + 1, right = n - 1, target = targetSum - arr[i];
                while (left < right) {
                    if (arr[left] + arr[right] == target) {
                        triplets.add((ArrayList<Integer>) Arrays.asList(arr[i], arr[left], arr[right]));
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (arr[left] + arr[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return triplets;

    }
    
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 5, 0, 6};
        int targetSum = 9;
        
        List<List<Integer>> triplets = findTriplets(arr, targetSum);
        
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
