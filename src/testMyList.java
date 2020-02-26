public class testMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(5);
        myList.add(0,1);
        myList.add(0,2);
        myList.add(3,3);
        System.out.println("List at beginning: ");
        myList.showList();
        System.out.println("\nList after clear: ");
        myList.clear();
        myList.showList();
        System.out.println("\n-----Another List-----");
        MyList<String> myList1 = new MyList<>(5);
        myList1.add(0,"New York");
        myList1.add(1,"Chicago");
        myList1.add(2,"Los Angeles");
        myList1.showList();
        myList1.trimToSize();
        System.out.println("\nAfter resize: ");
        myList1.showList();
        System.out.println("\nget element at position 1 in list: ");
        System.out.println(myList1.get(1));
        System.out.println("\nRemove element 2 in list: ");
        myList1.remove(2);
        myList1.showList();
        System.out.println("\nCheck element: Los Angeles is in list or not ");
        System.out.println(myList1.contains("Los Angeles"));
        System.out.println("\nCheck element: Chicago is in list or not ");
        System.out.println(myList1.contains("Chicago"));
    }
}
