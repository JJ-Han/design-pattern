package specification.filesearch;

public class FileSearch {
    public static void main(String[] args) {
        FileSizeSpecification size = new GreaterThanEqualTo(100).LessThanEqualTo(1000);
        ExtensionSpecification ext = new ExtensionSpecification("exe");
        Specification<FileComponent> filter = size.And(ext);
        System.out.println(FileSystem.search("//", filter));
    }
}
