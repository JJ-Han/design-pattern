package specification.filesearch;

public abstract class CompositeSpecification<T> implements Specification<T> {
    public Specification<T> And(Specification<T> other) {
        return new AndSpecification<>(this, other);
    }

    public Specification<T> Or(Specification<T> other) {
        return new OrSpecification<>(this, other);
    }

    @Override
    public abstract boolean isSatisfiedBy(T candidate);
}

class AndSpecification<T> extends CompositeSpecification<T> {
    Specification<T> left, right;
    public AndSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public boolean isSatisfiedBy(T candidate) {
        return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
    }
}

class OrSpecification<T> extends CompositeSpecification<T> {
    Specification<T> left, right;
    public OrSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public boolean isSatisfiedBy(T candidate) {
        return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate);
    }
}
