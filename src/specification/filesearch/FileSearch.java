package specification.filesearch;

public class FileSearch {
    public static void main(String[] args) {
        FileSizeSpecification minSize = new GreaterThanEqualTo(100);
        FileSizeSpecification maxSize = new LessThanEqualTo(1000);
        ExtensionSpecification ext = new ExtensionSpecification("exe");
        Specification<FileComponent> filter = minSize.And(maxSize).And(ext);
        System.out.println(FileSystem.search("//", filter));
    }
}
