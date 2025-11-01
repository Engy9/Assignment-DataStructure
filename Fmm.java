
package fmm;
import java.util.ArrayList;
public class Fmm  extends ExerciseSix {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(5);
        array.add(1);
       
        int key = 1;
        
        ArrayList<Integer> output = getElementsAfterKey(array, key);
        System.out.println("Input array: " + array);
        System.out.println("Key: " + key);
        System.out.println("Output: " + output);
    }
}
