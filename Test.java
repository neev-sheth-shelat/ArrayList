import java.util.*;

class Test {
    public static void main(String[] args) {
        
        ArrayList<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(0, false);
        list1.set(1, true);
        list1.remove(0);
        list1.clear();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Apple");
        list2.remove("Banana");
        
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());
        System.out.println(list2.get(0));
        System.out.println(list2.contains("Apple"));
        System.out.println(list2.indexOf("Apple"));
        System.out.println(list2.lastIndexOf("Apple"));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        
        ArrayList<Integer> addList = new ArrayList<>();
        addList.add(30);
        list3.addAll(addList);
        
        List<Integer> sub = list3.subList(0, 2);
        
        Object list3Copy = list3.clone();
        Object[] list3Array = list3.toArray();
        Iterator<Integer> it = list3.iterator();

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(sub);
    }
}