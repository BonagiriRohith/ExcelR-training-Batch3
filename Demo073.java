class DuplicateFinder {
    public void printDuplicates(int[] array) {
        int[] duplicates = new int[array.length];
        int duplicateIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !isInArray(duplicates, array[i])) {
                    duplicates[duplicateIndex++] = array[i];
                    break;
                }
            }
        }
        
        System.out.println("Duplicate elements:");
        for (int i = 0; i < duplicateIndex; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
    
    private boolean isInArray(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
        
        DuplicateFinder finder = new DuplicateFinder();
        finder.printDuplicates(array);
    }
}