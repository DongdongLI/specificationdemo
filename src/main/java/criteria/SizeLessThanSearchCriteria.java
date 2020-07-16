package criteria;

import model.Entry;

public class SizeLessThanSearchCriteria extends AbstractSpecification {
    private int size;
    public SizeLessThanSearchCriteria(int size) {
        this.size = size;
    }
    public boolean isSatisfied(Entry entry) {
        return entry.getSize() < this.size;
    }
}
