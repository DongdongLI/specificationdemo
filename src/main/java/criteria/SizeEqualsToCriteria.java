package criteria;

import model.Entry;

public class SizeEqualsToCriteria extends AbstractSpecification {
    private int size;
    public SizeEqualsToCriteria(int size) {
        this.size = size;
    }
    public boolean isSatisfied(Entry entry) {
        return entry.getSize() == this.size;
    }
}
