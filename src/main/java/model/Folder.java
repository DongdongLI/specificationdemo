package model;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Entry{
    List<Entry> children;

    public Folder(String name, List<Entry> children) {
        setName(name);
        this.children = new ArrayList<Entry>();
        this.children.addAll(children);
    }

    public void addEntry(Entry entry) {
        this.children.add(entry);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for(Entry child: children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    public List<Entry> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "children=" + children +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
