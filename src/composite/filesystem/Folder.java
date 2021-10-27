package composite.filesystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Folder extends FileComponent {
    private Map<String, FileComponent> dirs;

    protected Folder(String name) {
        super(name);
        dirs = new TreeMap<>();
    }

    protected List<String> getList() {
        return new ArrayList<>(dirs.keySet());
    }

    @Override
    protected FileComponent getChild(String s) {
        return dirs.get(s);
    }

    @Override
    protected FileComponent add(String s, FileComponent f) {
        dirs.put(s, f);
        return f;
    }
}
