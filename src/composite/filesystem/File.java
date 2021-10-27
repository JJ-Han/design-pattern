package composite.filesystem;

import java.util.List;

public class File extends FileComponent {
    private final StringBuilder content;

    protected File(String name) {
        super(name);
        this.content = new StringBuilder();
    }

    protected List<String> getList() {
        return List.of(name);
    }

    @Override
    protected String getContent() {
        return content.toString();
    }

    @Override
    protected void addContent(String data) {
        content.append(data);
    }
}
