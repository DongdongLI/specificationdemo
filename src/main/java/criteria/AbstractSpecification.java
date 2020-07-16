package criteria;

import model.Entry;

public abstract class AbstractSpecification implements Specification{
    public abstract boolean isSatisfied(Entry entry);

    public Specification and(Specification specification) {
        return new AndSpecification(this, specification);
    }

    public Specification or(Specification specification) {
        return new OrSpecification(this, specification);
    }
}
