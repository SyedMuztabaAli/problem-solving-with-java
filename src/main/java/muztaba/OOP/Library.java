package muztaba.OOP;

import java.util.ArrayList;

public class Library {
    ArrayList<String> books = new ArrayList<>();

    public void add(String name){
        books.add(name);
    }
    public void remove(int index){
        books.remove(index);
    }
    public void show(){
        for(int i = 0;i<books.size();i++){
            System.out.println(books.get(i));
        }
    }

    public static void main(String[] args) {

        Library lb = new Library();

        lb.add("Multiple");
        lb.add("Single");
        lb.show();

        lb.remove(0);
        System.out.println("After removing.....");
        lb.show();
    }
}
