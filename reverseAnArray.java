import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int i = m;
        int j = arr.length-1;
        for(i=m,j=arr.length-1; i<j; i++,j-- ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}