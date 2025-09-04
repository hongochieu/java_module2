package ss10_dsa_danh_sach;
public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry");

        System.out.println("List size: " + list.size()); // 4
        System.out.println("Element at index 2: " + list.get(2)); // Banana
        System.out.println("Contains 'Apple'? " + list.contains("Apple")); // true

        list.remove(0); // Remove "Apple"
        System.out.println("After removing index 0, element at index 0: " + list.get(0)); // Blueberry

        MyList<String> clonedList = list.clone();
        System.out.println("Cloned list size: " + clonedList.size()); // 3

        list.clear();
        System.out.println("After clear, size: " + list.size()); // 0
    }
}
