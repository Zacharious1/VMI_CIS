//Help received: Palindrome: beginners book, geeks for geeks to see what the binary search algorithm is,
    // as well as to see the math required to sum the digits recursively, and for how to find the largest digit recursively.
    //inf.unibz.it helped with counting chars, as I could not figure out how to make the string length of 0 the terminating case,
    // as when a non-matching char was found it would not continue through the string.

public class Recursion {
    public static boolean palindrome(String str) {
        if (str.length() == 0 || str.length() == 1) //if you run out of word or reach the last letter, return true
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return palindrome(str.substring(1, str.length() - 1));
        return false;
    }

    public static int countLetters(String str, char c) {
            if (str.length() == 0)                          //if the string is empty, return 0
                return 0;
            else if (str.charAt(0) == c)                    //if the first character is the desired one
                return 1 + countLetters(str.substring(1), c);   //return the letters after the first letter +1.
                                                                // If there is more than one occurance of the desired letter, you will have 1 + 1 + 1 ...
                                                                // until you've run out of instances of that letter in the string.
            else
                return countLetters(str.substring(1), c);       //if the first letter isnt a desired one, move on. the terminating case is when the string length is 0, this statement ensure you get there.
        }

    public static long sumDigits(long n) {
        if (n == 0) { //if the number is 0, return 0.
            return 0;
        }
        return (n % 10 + sumDigits(n / 10)); //return the first/next digit, and use recursion to break the number apart
    }

    public static int largestDigit(int[] array, int arrLength) {
       if (arrLength == 1) return array[0]; //if the array has 1 element, return it
       return Math.max(array[arrLength - 1], largestDigit(array, arrLength - 1)); //return the max between the last element and recursively break the array down
    }

    public static void xMethod(int n) {
        if(n > 0) {
            xMethod(n - 1);
            System.out.println(n + " ");
        }
    }
    public static void zMethod(int n) {
        if(n > 0) {
            System.out.println(n + " ");
            zMethod(n - 1);
        }
    }

    public static int findLargest(int[] list) {
        int high = list.length - 1;
        int max = list[high];
        return findLargest(list, high, max);
    }

    public static int findLargest(int[] list, int high, int max) {
        if(high < 0) return max;
        else if (list[high] > max) max = list[high];
        return findLargest(list, high - 1, max);
    }

    public static int linearSearch(int[] list, int key) {
        int high = list.length - 1;
        return linearSearch(list, key, high);
    }

    public static int linearSearch(int[] list, int key, int high) {
        if (high < 0) return - 1;
        else if (list[high] == key) return high;
        else return linearSearch(list, key, high - 1);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return binarySearch(list, low, high, key);
    }

    public static int binarySearch(int[] list, int low, int high, int key) {
        if (low >= high) return -1;
        int mid = ((low + high )/ 2);
        if (key == list[mid]) return mid;
        else if(key < list[mid]) return binarySearch(list, low, mid - 1, key);
        else return binarySearch(list, mid + 1, high, key);
    }

    public static void printArr(double[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "penguin";
        double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long b = 1234;
       // System.out.println("binary search: " + binarySearch(a, 6));
        //System.out.println(s + " has " + countLetters(s, 'r') +  " instances of the letter entered." );
        //System.out.println("The sum of the digits in the number " + b + " is " + sumDigits(b));
        //System.out.println("The largest digit in the array is " + largestDigit(a, a.length));
        //System.out.println("xMethod: ");
        xMethod(7);
        //System.out.println("zMethod: ");
        zMethod(7);
        //System.out.println("Linear search for the number 7 puts the number at index " + linearSearch(a, 7));


    }
}
