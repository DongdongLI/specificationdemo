package criteria;

import model.Entry;

public class SizeGreaterThanSearchCriteria extends AbstractSpecification {
    private int size;
    public SizeGreaterThanSearchCriteria(int size) {
        this.size = size;
    }
    public boolean isSatisfied(Entry entry) {
        return entry.getSize() > this.size;
    }
}
