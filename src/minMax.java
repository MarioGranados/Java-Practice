import java.util.Collections;
import java.util.List;

public class minMax {
    // Write your code here
    public void minMaxSolution (List<Integer> arr) {
        Collections.sort(arr);
        int maxSum = 0;
        int minSum = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(i == 0) {
                minSum += arr.get(i);
            } else if (i == arr.size() - 1) {
                maxSum += arr.get(i);
            } else {
                minSum += arr.get(i);
                maxSum += arr.get(i);
            }
        }
        System.out.println(maxSum);
        System.out.println(minSum);
    }

}
