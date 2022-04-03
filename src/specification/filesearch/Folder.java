package specification.filesearch;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Folder extends FileComponent {
    Map<String, FileComponent> child;

    public boolean add(FileComponent f) {
        if (child.containsKey(f)) return false;
        child.put(f.getName(), f);
        return true;
    }

    public Folder(String name) {
        this.name = name;
        this.child = new HashMap<>();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Folder)) return false;
        Folder other = (Folder) o;
        return this.name.equals(other.name);
    }

    @Override
    public FileComponent next(String name) {
        return child.get(name);
    }

    @Override
    public boolean writeFile(String s) {
        return false;
    }

    public Collection<FileComponent> readFolder() {
        return child.values();
    }
}

