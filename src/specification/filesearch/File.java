package specification.filesearch;

public class File extends FileComponent {
    String fileName;
    String ext;
    StringBuilder data = new StringBuilder();
    int size = 0;

    public File(String name, String ext) {
        this.fileName = name;
        this.ext = ext;
        this.name = name + "." + ext;
    }

    public File(String name, String ext, int size) {
        this(name, ext);
        this.size = size;
    }

    public boolean add(FileComponent f) {
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof File)) return false;
        File other = (File) o;
        return this.name.equals(other.name);
    }

    public FileComponent navigate(String path) {
        return null;
    }

    public FileComponent next(String name) {
        return null;
    }

    public boolean writeFile(String s) {
        data.append(s);
        return true;
    }

    public String readFile() {
        return data.toString();
    }

    public boolean isFile() {
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public String getExtension() {
        return this.ext;
    }
}
