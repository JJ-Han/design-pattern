package specification.filesearch;

import java.util.Collection;

public abstract class FileComponent {
    String name;
    public abstract boolean add(FileComponent f);
    public abstract FileComponent next(String name);
    public String getName() {
        return name;
    }
    public abstract boolean writeFile(String s);
    public String readFile() {
        return null;
    }
    public String toString() {
        return name;
    }

    public boolean isFile() {
        return false;
    }

    public int getSize() {
        return -1;
    }

    public Collection<FileComponent> readFolder() {
        return null;
    }

    public String getExtension() {
        return "";
    }
}
