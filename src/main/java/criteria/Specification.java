package criteria;

import model.Entry;

public interface Specification {
    boolean isSatisfied(Entry entry);
    Specification and(Specification specification);
}
