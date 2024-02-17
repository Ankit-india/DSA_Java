package src.assignments.sorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = new int[]{7,8,9,6,5,4,3,2,1};
        mergeSort(arr, 0, arr.length );
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j < end) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];

        }
    }
}
