public static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int i = 0;
        
        while (i < arr.length) {
            // Check if current element is in correct position
            // arr[i] should equal i+1 (1-indexed to 0-indexed)
            if (arr[i] != i + 1) {
                // Swap arr[i] with element at its target position
                int targetIndex = arr[i] - 1;  // Where arr[i] should go
                
                // Swap
                int temp = arr[i];
                arr[i] = arr[targetIndex];
                arr[targetIndex] = temp;
                
                swaps++;
                // Don't increment i, check this position again
            } else {
                // Element is in correct position, move to next
                i++;
            }
        }
        
        return swaps;
    }
