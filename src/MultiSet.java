/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    abstract void add(Integer item);

}
public class TreeMultiSet(Multiset){
    /*
    This class uses an underlying Tree to implement our MultiSet ADT.
    */
    Tree _tree;
    public TreeMultiSet(Tree _tree){
        this._tree = _tree;
    }git

    public void add(int item){
        _tree.insert(item);
    }
    public void remove(int item){
        _tree.delete_item(item);
    }
    public boolean contains(int item){
        return this._tree.__contains__(item);
    }
    public boolean is_empty(){
        return this._tree.is_empty();
    }
    public int count(int item){
        return this._tree.count(item);
    }
    public int size(){
        return this._tree.__len__();
    }




}


