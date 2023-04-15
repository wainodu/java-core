package lab3;

import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        TreeSet treeSet1 = new TreeSet<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        long startLinked1 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            linkedList1.addFirst(i);
        }
        long endLinked1 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в начало linkedList = " + (endLinked1 - startLinked1));

        long startArray1 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            arrayList1.add(0, i);
        }
        long endArray1 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в начало arrayList = " + (endArray1 - startArray1));

        long startSet1 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            treeSet1.add(i);
        }
        long endSet1 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в начало treeSet = " + (endSet1 - startSet1));


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        TreeSet treeSet2 = new TreeSet<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        long startLinked2 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            linkedList2.addLast(i);
        }
        long endLinked2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в конец linkedList = " + (endLinked2 - startLinked2));

        long startArray2 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            arrayList2.add(i);
        }
        long endArray2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в конец arrayList = " + (endArray2 - startArray2));

        long startSet2 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            treeSet2.add(i);
        }
        long endSet2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в конец treeSet = " + (endSet2 - startSet2));


        ArrayList<Integer> arrayList3 = new ArrayList<>();
        TreeSet treeSet3 = new TreeSet<>();
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        long startLinked3 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            linkedList3.addLast(i);
        }
        long endLinked3 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в середину linkedList = " + (endLinked3 - startLinked3));

        long startArray3 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            arrayList3.add(i);
        }
        long endArray3 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в середину arrayList = " + (endArray3 - startArray3));

        for (int i = 0; i < 1000000; i++) {
            treeSet3.add(i);
        }
        for (int i = 1000003; i < 2000000; i++) {
            treeSet3.add(i);
        }
        long startSet3 = System.currentTimeMillis();
        treeSet3.add(1000001);
        long endSet3 = System.currentTimeMillis();
        System.out.println("Время выполнения операции добавления в середину treeSet = " + (endSet3 - startSet3));
    }
}

