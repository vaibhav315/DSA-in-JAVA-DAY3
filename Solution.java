

  public class Solution{
     public void  reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
     public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        sol.reverseArray(arr);

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
 }




