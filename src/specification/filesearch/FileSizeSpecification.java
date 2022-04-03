package specification.filesearch;

public abstract class FileSizeSpecification extends CompositeSpecification<FileComponent> {
    int size;
    public FileSizeSpecification(int size) {
        this.size = size;
    }
}

class EqualTo extends FileSizeSpecification {
    EqualTo(int size) {
        super(size);
    }
    public boolean isSatisfiedBy(FileComponent f) {
        return f.isFile() && f.getSize() == size;
    }
}

class GreaterThanEqualTo extends FileSizeSpecification {
    GreaterThanEqualTo(int size) {
        super(size);
    }
    public boolean isSatisfiedBy(FileComponent f) {
        return f.isFile() && f.getSize() >= size;
    }
}

class LessThanEqualTo extends FileSizeSpecification {
    LessThanEqualTo(int size) {
        super(size);
    }
    public boolean isSatisfiedBy(FileComponent f) {
        return f.isFile() && f.getSize() <= size;
    }
}
