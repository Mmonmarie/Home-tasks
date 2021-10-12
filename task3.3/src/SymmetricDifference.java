import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> difference = new HashSet<T>(set1);
        difference.addAll(set2);
        Set<T> set0 = new HashSet<T>(set1);
        set0.retainAll(set2);
        difference.removeAll(set0);
        return difference;
    }
}
