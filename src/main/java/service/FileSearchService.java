package service;

import criteria.Specification;
import model.Entry;
import model.File;

import java.util.ArrayList;
import java.util.List;

public class FileSearchService {
    List<Entry> entries;

    public FileSearchService(List<Entry> entries) {
        this.entries = entries;
    }

    public List<Entry> search(Specification specification) {
        List<Entry> result = new ArrayList<Entry>();

        for(Entry entry: entries) {
            if(specification.isSatisfied(entry)) {
                result.add(entry);
            }
        }

        return result;
    }
}
