package fmm;
import java.util.ArrayList;
public class ExerciseSix {
    public static ArrayList<Integer> getElementsAfterKey(ArrayList<Integer> list, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != key) {
                result.add(list.get(i) );
            }
        }
        return result;
    }
}
