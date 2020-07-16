package criteria;

import model.Entry;

public class AndSpecification extends AbstractSpecification {
    private Specification leftSpecification;
    private Specification rightSpecification;

    public AndSpecification(Specification leftSpecification, Specification rightSpecification) {
        this.leftSpecification = leftSpecification;
        this.rightSpecification = rightSpecification;
    }

    @Override
    public boolean isSatisfied(Entry entry) {
        return leftSpecification.isSatisfied(entry) && rightSpecification.isSatisfied(entry);
    }
}
