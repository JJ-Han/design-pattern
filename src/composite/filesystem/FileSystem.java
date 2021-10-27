package composite.filesystem;

/* File System with composite design pattern

FileSystem() Initializes the object of the system.

List<String> ls(String path)
If path is a file path, returns a list that only contains this file's name.
If path is a directory path, returns the list of file and directory names in this directory.
The answer should in lexicographic order.

void mkdir(String path)
Makes a new directory according to the given path.
The given directory path does not exist. If the middle directories in the path do not exist, you should create them as well.

void addContentToFile(String filePath, String content)
If filePath does not exist, creates that file containing given content.
If filePath already exists, appends the given content to original content.

String readContentFromFile(String filePath) Returns the content in the file at filePath.

 */

import java.util.List;

public class FileSystem {
    private final FileComponent root;

    public FileSystem() {
        root = new Folder("");
    }

    // public methods...
    public List<String> ls(String path) {
        return getComponent(path).getList();
    }

    public void mkdir(String path) {
        setComponents(path, false);
    }

    public void addContentToFile(String filePath, String content) {
        setComponents(filePath, true).addContent(content);
    }

    public String readContentFromFile(String filePath) {
        FileComponent node = getComponent(filePath);
        if (node == null) throw new IllegalArgumentException("invalid filepath");
        return node.getContent();
    }

    // private methods...
    private FileComponent getComponent(String path) {
        String[] nodes = path.split("/");
        FileComponent f = root;
        for (int i = 1; i < nodes.length && f != null; i++)
            f = f.getChild(nodes[i]);
        return f;
    }

    private FileComponent setComponents(String path, boolean isFilePath) {
        String[] nodes = path.split("/");
        FileComponent f = root, next;
        for (int i = 1; i < nodes.length; i++, f = next) {
            next = f.getChild(nodes[i]);
            if (next == null) next = f.add(nodes[i], (i == nodes.length-1 && isFilePath) ? new File(nodes[i]) : new Folder(nodes[i]));
        }
        return f;
    }
}
