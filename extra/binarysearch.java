
import java.util.Random;


public class binarysearch {

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length;
        return recursiveBinarySearch(list, key, low, high);
    }

    public static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high){
            return -low - 1;
        }
        
        if (key < list[mid]) {
            return recursiveBinarySearch(list, key, low, mid - 1);
        } else if (key == list[mid]){
            return mid;
        }
        else {
            return recursiveBinarySearch(list, key, mid +1, high);
        }

    }

    public static int recursiveBinarySearchMax(int[] list) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearchMax(list, list[low], low, high);
    }

    public static int recursiveBinarySearchMax(int[] list, int hold, int low, int high) {
        if (low >= high){
            return hold;
        } else if (list[high] >= hold) {
            return recursiveBinarySearchMax(list, list[low + 1], low + 1, high);
        } else {
            return recursiveBinarySearchMax(list, hold, low, high - 1);
        }
    }

    public static String recursiveReverseString(String string) {
        String new_string = "" + string.charAt(string.length()-1);
        int index = string.length()- 2;
        return recursiveReverseString(string, new_string, index);
    }

    public static String recursiveReverseString(String string, String hold, int index) {
        if (index < 0 ){
            return hold;
        } else {
            hold = hold + string.charAt(index);
            return recursiveReverseString(string, hold, index - 1);
        }
    }

    public static void main(String[] args) {
    //     int[] a = {10, 11, 7, 1111, 0};

    //     int highest = recursiveBinarySearchMax(a);
    //     System.out.printf("The highest number in the list is : %d%n", highest);
    // }

    String name = "Hello World";

    System.out.printf("%s Backwards is %s", name, recursiveReverseString(name));
    }
}
