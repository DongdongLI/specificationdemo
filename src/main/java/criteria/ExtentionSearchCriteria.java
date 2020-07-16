package criteria;

import model.Entry;
import model.File;
import model.Folder;

public class ExtentionSearchCriteria extends AbstractSpecification {
    private String extension;
    public ExtentionSearchCriteria(String extension) {
        this.extension = extension;
    }
    public boolean isSatisfied(Entry entry) {
        if(entry instanceof Folder) {
            return false;
        }
        return ((File)entry).getExtension().equals(extension);
    }
}
