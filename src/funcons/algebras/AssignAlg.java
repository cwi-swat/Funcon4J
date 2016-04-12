package funcons.algebras;

public interface AssignAlg<E> extends ElseAlg<E> {
    E assign(E var, E x);
    E assignedValue(E var);
    E alloc(E x);
}
