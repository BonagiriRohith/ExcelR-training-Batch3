class ArraySorter {
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

public class Demo074 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        ArraySorter sorter = new ArraySorter();
        sorter.bubbleSort(array);
        
        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}