package lab3;

import java.util.*;

public class AddRemoveIndex {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        TreeSet treeSet = new TreeSet<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//
//        for (int i = 0; i < 2000000; i++) {
//            linkedList.add(i);
//        }
//        long startLinked1 = System.currentTimeMillis();
//        linkedList.addFirst(0);
//        long endLinked1 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в начало linkedList = " + (endLinked1 - startLinked1));
//
//        long startLinked2 = System.currentTimeMillis();
//        linkedList.addLast(2000000);
//        long endLinked2 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в конец linkedList = " + (endLinked2 - startLinked2));
//
//        long startLinked3 = System.currentTimeMillis();
//        linkedList.add(1000000,0);
//        long endLinked3 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в середину linkedList = " + (endLinked3 - startLinked3));
//
//        long startLinked4 = System.currentTimeMillis();
//        linkedList.removeFirst();
//        long endLinked4 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с начала linkedList = " + (endLinked4 - startLinked4));
//
//        long startLinked5 = System.currentTimeMillis();
//        linkedList.removeLast();
//        long endLinked5 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с конца linkedList = " + (endLinked5 - startLinked5));
//
//        long startLinked6 = System.currentTimeMillis();
//        linkedList.remove(1000000);
//        long endLinked6 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления в середине linkedList = " + (endLinked6 - startLinked6));
//
//
//
//        for (int i = 0; i < 2000000; i++) {
//            arrayList.add(i);
//        }
//
//        long startArray1 = System.currentTimeMillis();
//        arrayList.add(0, 0);
//        long endArray1 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в начало arrayList = " + (endArray1 - startArray1));
//
//        long startArray2 = System.currentTimeMillis();
//        arrayList.add(1999999, 0);
//        long endArray2 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в конец arrayList = " + (endArray2 - startArray2));
//
//        long startArray3 = System.currentTimeMillis();
//        arrayList.add(1000000, 0);
//        long endArray3 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в середину arrayList = " + (endArray3 - startArray3));
//
//        long startArray4 = System.currentTimeMillis();
//        arrayList.remove(0);
//        long endArray4 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с начала arrayList = " + (endArray4 - startArray4));
//
//        long startArray5 = System.currentTimeMillis();
//        arrayList.remove(1999999);
//        long endArray5 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с конца arrayList = " + (endArray5 - startArray5));
//
//        long startArray6 = System.currentTimeMillis();
//        arrayList.remove(1000000);
//        long endArray6 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с середины arrayList = " + (endArray6 - startArray6));
//
//
//
//        for (int i = 1; i < 1000000; i++) {
//            treeSet.add(i);
//        }
//        for (int i = 1000001; i < 2000000; i++) {
//            treeSet.add(i);
//        }
//
//        long startSet1 = System.currentTimeMillis();
//        treeSet.add(0);
//        long endSet1 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в начало treeSet = " + (endSet1 - startSet1));
//
//        long startSet2 = System.currentTimeMillis();
//        treeSet.add(2000000);
//        long endSet2 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в конец treeSet = " + (endSet2 - startSet2));
//
//        long startSet3 = System.currentTimeMillis();
//        treeSet.add(1000000);
//        long endSet3 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции добавления в середину treeSet = " + (endSet3 - startSet3));
//
//        long startSet4 = System.currentTimeMillis();
//        treeSet.remove(1);
//        long endSet4 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с начала treeSet = " + (endSet4 - startSet4));
//
//        long startSet5 = System.currentTimeMillis();
//        treeSet.remove(1999999);
//        long endSet5 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с начала treeSet = " + (endSet5 - startSet5));
//
//        long startSet6 = System.currentTimeMillis();
//        treeSet.remove(1000000);
//        long endSet6 = System.currentTimeMillis();
//        System.out.println("Время выполнения операции удаления с начала treeSet = " + (endSet6 - startSet6));


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        TreeSet treeSet2 = new TreeSet<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        for (int i = 0; i < 20000000; i++) {
//            treeSet2.add(i);
            linkedList2.add(i);
            arrayList2.add(i);
        }

//        long getSetStart = System.currentTimeMillis();
//        treeSet2.contains(10000000);
//        long getSetEnd = System.currentTimeMillis();
//        System.out.println("Время поиска по значению для treeSet = " + (getSetEnd - getSetStart));

        long getArrayStart = System.currentTimeMillis();
        arrayList2.get(10000000);
        long getArrayEnd = System.currentTimeMillis();
        System.out.println("Время поиска по индексу для arrayList = " + (getArrayEnd - getArrayStart));

        long getLinkedStart = System.currentTimeMillis();
        linkedList2.get(10000000);
        long getLinkedEnd = System.currentTimeMillis();
        System.out.println("Время поиска по индексу для linkedList = " + (getLinkedEnd - getLinkedStart));
    }
}