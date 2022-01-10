package Recursion2.DivideAndConquer;


public class QuickSort {
    public static void main(String[] args) {
        int[] listToSort = {1,5,3,2,8,7,6,4};
        printList(listToSort);
        quickSort(listToSort);
        System.out.println("After quicksort: ");
        printList(listToSort);
        
    }
    public static void quickSort(int[] list) {
        int n = list.length;
        qSort(list, 0, n - 1);

    }

    private static void qSort(int[] list, int low, int high) {
        if (low < high) {
            int pivot = partition(list, low, high);
            qSort(list, low, pivot - 1);
            qSort(list, pivot + 1, high);

        }

    }

    private static int partition(int[] list, int low, int high) {
        int pivot = list[high];
        int i = low;
        for (int j = low; j < high; ++j) {
            if (list[j] < pivot) {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
            }
        }
        int temp = list[i];
        list[i] = list[high];
        list[high] = temp;
        return i;
    }

    private static void printList(int[] list) {
        System.out.print("[");
        for(int i = 0; i < list.length; i ++) {
            System.out.print(list[i]);
            if(i != list.length - 1){
                System.out.print(",");
            } 
        }
        System.out.println("]");
    }

    


}