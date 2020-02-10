package BinarySearchTree;

public interface Tree<D extends Comparable> {

    public boolean isEmpty();

    public int cardinality();

     boolean member(D elt);

    NonEmptyBST<D> add(D elt);
}
