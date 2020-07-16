package criteria;

import model.Entry;

public class OrSpecification extends AbstractSpecification {
    private Specification leftSpecification;
    private Specification rightSpecification;

    public OrSpecification(Specification leftSpecification, Specification rightSpecification) {
        this.leftSpecification = leftSpecification;
        this.rightSpecification = rightSpecification;
    }

    @Override
    public boolean isSatisfied(Entry entry) {
        return leftSpecification.isSatisfied(entry) || rightSpecification.isSatisfied(entry);
    }
}
