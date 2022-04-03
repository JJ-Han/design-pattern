package specification.filesearch;

import java.util.*;

public class FileSystem {
    private static final FileComponent root = new Folder("");

    public FileSystem() {
    }

    // public methods...
    public Collection<FileComponent> ls(String path) {
        FileComponent node = getComponent(path);
        if (node == null) throw new IllegalArgumentException("invalid filepath");
        return node.readFolder();
    }

    public void mkdir(String path) {
        setComponents(path);
    }

    public void addContentToFile(String filePath, String content) {
        setComponents(filePath).writeFile(content);
    }

    public String readFile(String filePath) {
        FileComponent node = getComponent(filePath);
        if (node == null) throw new IllegalArgumentException("invalid filepath");
        return node.readFile();
    }

    protected static FileComponent getComponent(String path) {
        String[] nodes = path.split("/");
        FileComponent f = root;
        for (int i = 1; i < nodes.length && f != null; i++)
            f = f.next(nodes[i]);
        return f;
    }

    protected static FileComponent setComponents(String path) {
        String[] nodes = path.split("/");
        FileComponent f = root, next;
        for (int i = 1; i < nodes.length; i++, f = next) {
            next = f.next(nodes[i]);
            if (next == null) {
                next = new Folder(nodes[i]);
                f.add(next);
            }
        }
        return f;
    }

    protected static List<FileComponent> search(String path, Specification<FileComponent> spec) {
        FileComponent f = getComponent(path);
        List<FileComponent> result = new ArrayList<>();
        Deque<FileComponent> queue = new ArrayDeque<>(f.readFolder());
        while (!queue.isEmpty()) {
            FileComponent curr = queue.poll();
            if (curr.isFile()) {
                if (spec.isSatisfiedBy(curr)) result.add(curr);
            }
            else queue.offer(curr);
        }
        return result;
    }
}
