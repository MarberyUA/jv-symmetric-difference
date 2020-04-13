package core.basesyntax;

import java.util.Set;
import java.util.TreeSet;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {

    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set a = new TreeSet<>();
        a.addAll(set1);
        a.addAll(set2);
        set2.retainAll(set1);
        a.removeAll(set2);
        return a;
    }
}
