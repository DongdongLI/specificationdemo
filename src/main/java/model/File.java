package model;

public class File extends Entry {
    private String extension;
    private String content;

    public File(String name, int size, String content, String extension) {
        this.setName(name);
        this.extension = extension;
        this.setSize(size);
        this.content = content;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "File{" +
                "extension='" + extension + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
