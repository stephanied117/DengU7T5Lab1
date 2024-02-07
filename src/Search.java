import java.util.ArrayList;

public class Search {
    // A. write a static method named linearSearchFirst that returns the FIRST index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // BE SURE TO USE EARLY RETURN (more efficient)
    public static int linearSearchFirst(int[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                return i;
            }
        }
        return -1;
    }



    // B. write a second static method named linearSearchLast that returns the LAST index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // FIGURE OUT A WAY TO DO THIS THAT STILL USES AN EARLY RETURN!!!!!
    public static int linearSearchLast(int[] list, int num) {
        for (int i = list.length - 1; i > 0; i--) {
            if (list[i] == num) {
                return i;
            }
        }
        return -1;
    }



    // C. write a third static method named linearSearchFound that has the same parameters
    // as linearSearchFirst and linearSearchLast but instead of returning an index,
    // it returns true if target is found or false if target is not found
    // AGAIN, BE SURE TO USE EARLY RETURN!
    public static boolean linearSearchFound(int[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                return true;
            }
        }
        return false;
    }



    // D. write a fourth static method named linearSearchCount that has the same parameters
    // as linearSearchFirst and linearSearchLast and returns the NUMBER OF TIMES the target
    // appears in the array
    public static int linearSearchCount(int[] list, int num) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                count++;
            }
        }
        return count;
    }



    // E. add FOUR more static methods which are the OVERLOADED versions of the four method above
    // (same method name, different parameter types/order) except they take an ArrayList of Integers
    // rather than an array of ints; they should all otherwise work the same way (for this, it is
    // OK to either copy/paste code and change it to work with arraylists instead, or you can figure
    // out a way to call the 4 methods above; up to you)
    public static int linearSearchFirst(ArrayList<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchLast(ArrayList<Integer> list, int num) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == num) {
                return i;
            }
        }
        return -1;
    }
    public static boolean linearSearchFound(ArrayList<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchCount(ArrayList<Integer> list, int num) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                count++;
            }
        }
        return count;
    }

}