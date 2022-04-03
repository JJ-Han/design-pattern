package specification.filesearch;

public class ExtensionSpecification extends CompositeSpecification<FileComponent> {
    String ext;
    ExtensionSpecification(String ext) {
        this.ext = ext;
    }
    @Override
    public boolean isSatisfiedBy(FileComponent f) {
        return f.isFile() && f.getExtension().equals(ext);
    }
}
