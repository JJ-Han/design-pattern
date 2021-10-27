package composite.filesystem;

import java.util.List;

public abstract class FileComponent {
    protected final String name;

    protected FileComponent(String name) {
        this.name = name;
    }

    protected abstract List<String> getList();

    protected String getContent() {
        throw new UnsupportedOperationException();
    }

    protected FileComponent getChild(String s) {
        throw new UnsupportedOperationException();
    }

    protected FileComponent add(String s, FileComponent f) {
        throw new UnsupportedOperationException();
    }

    protected void addContent(String data) {
        throw new UnsupportedOperationException();
    }
}
