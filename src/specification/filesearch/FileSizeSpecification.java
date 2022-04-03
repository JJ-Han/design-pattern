package specification.filesearch;

public abstract class FileSizeSpecification extends CompositeSpecification<FileComponent> {
    int size;
    public FileSizeSpecification(int size) {
        this.size = size;
    }

    // is this good design?
    FileSizeSpecification GreaterThanEqualTo(int size) {
        return new GreaterThanEqualTo(size);
    }

    FileSizeSpecification EqualTo(int size) {
        return new EqualTo(size);
    }

    FileSizeSpecification LessThanEqualTo(int size) {
        return new LessThanEqualTo(size);
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
