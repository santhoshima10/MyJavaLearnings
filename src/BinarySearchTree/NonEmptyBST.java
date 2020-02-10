package BinarySearchTree;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality()+right.cardinality();
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        return null;
    }

    public NonEmptyBST(D elt){

        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();

    }



}
