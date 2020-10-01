package mypkg;

import java.util.ArrayList;
import java.util.Collection;

public class MySet {
    private ArrayList<Integer> members;

    public MySet() {
        this.members = new ArrayList<>();
    }

    public MySet(int[] values) {
        members = new ArrayList<>();
        for (Integer i: values) {
            this.members.add(i);
        }
    }

    public String toString() {
        return this.members.toString();
    }

    public boolean add(Integer i) {
        if (this.members.contains(i)) {
            return false;
        }
        this.members.add(i); // could have done: return this.members.add(i);
        return true;
    }

    public boolean addList(Collection<Integer> items) {
        return true; // stub, implement later
    }

    public boolean contains(Integer i) {
        return this.members.contains(i);
    }

    public static void main(String[] args){

        // Here's how you might have done testing before now...

        System.out.println("* Testing constructor and contains()");
        var empty = new MySet();
        int[] vals = {3, 1, 9, 5};
        var set1 = new MySet(vals);
        System.out.printf("empty: %s  contains 3? %s%n", empty, empty.contains(3));
        System.out.printf("set1: %s  contains 3? %s%n", set1, set1.contains(3));

        System.out.println("* Testing add()");
        empty.add(-3);
        set1.add(-3);
        System.out.printf("empty: %s  contains -3? %s%n", empty, empty.contains(-3));
        System.out.printf("set1: %s  contains -3? %s%n", set1, set1.contains(-3));

        // And so on for other methods

    }

    // other methods from slides that we might implement and test

    public int size() {
        return 0; // stub, implement later
    }

    public MySet union(MySet set2) {
        return null; // stub, implement later
    }

    public MySet intersection(MySet set2) {
        return null; // stub, implement later
    }

}
