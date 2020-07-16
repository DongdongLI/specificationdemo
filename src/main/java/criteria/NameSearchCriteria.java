package criteria;

import model.Entry;
import model.File;

public class NameSearchCriteria extends AbstractSpecification {
    private String name;
    public NameSearchCriteria(String name) {
        this.name = name;
    }
    public boolean isSatisfied(Entry entry) {
        if(entry instanceof File) {
            return entry.getName().equals(name);
        }
        return false;
    }
}
