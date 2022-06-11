package java11.app.thailan;

import java.util.HashMap;

public class MaxSubArray {

    public static int calculateMaximumSubArray(int []a) {
        int size = a.length;
        int prefix[] = new int[size];
        HashMap<Integer, Integer> first = new HashMap();
        HashMap<Integer, Integer> last = new HashMap();
        for(int i =0;i<size;i++) {
            if(i==0) {
                prefix[0] = a[0];
            } else {
                prefix[i] = prefix[i-1] + a[i];
            }

            if(!first.containsKey(a[i])) {
                first.put(a[i], i);
            }

            last.put(a[i], i);
        }

        int ans = -1;

        for (int i = 0; i < size; i++) {
            int start = first.get(a[i]);
            int end = last.get(a[i]);
            if(start == end) continue;
            int sum = 0;
            if (start == 0)
                sum = prefix[end];
            else
                sum = prefix[end] - prefix[start - 1];
            if (sum > ans)
                ans = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 1, 6, 6, 9, 9};
        System.out.print(calculateMaximumSubArray(arr));
    }
}
