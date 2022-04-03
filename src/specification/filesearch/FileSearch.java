package specification.filesearch;

public class FileSearch {
    public static void main(String[] args) {
        Specification<FileComponent> filter = new GreaterThanEqualTo(100).And(new LessThanEqualTo(1000)).And(new ExtensionSpecification("exe"));
        System.out.println(FileSystem.search("//", filter));
    }
}
