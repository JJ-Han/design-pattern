package specification.filesearch;

public interface Specification<T> {
    boolean isSatisfiedBy(T candidate);
    Specification<T> And(Specification<T> other);
    Specification<T> Or(Specification<T> other);
}
