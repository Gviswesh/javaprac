public class greaterelement {
    public static int[] replaceElements(int[] arr) {
        int length = arr.length;
        int max = -1; // variable to store the maximum value encountered

        for (int i = length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = max; // replace the current element with the maximum value
            max = Math.max(max, current); // update the maximum value if necessary
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] replacedArr = replaceElements(arr);
        System.out.println("Array after replacement:");
        for (int num : replacedArr) {
            System.out.print(num + " ");
        }
    }
}
