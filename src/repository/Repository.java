package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Repository<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }
    public ArrayList<T> getAll(){
        return items;
    }
    public void addAll(List<T> items){
        items.addAll(items);
    }
    public ArrayList<T> findAll(Predicate<T> filter){
        items.stream().
    }
    // dodělat
    //chybí mi tam knihovna logbok
}
