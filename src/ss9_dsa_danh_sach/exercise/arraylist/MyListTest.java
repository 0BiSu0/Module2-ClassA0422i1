package ss9_dsa_danh_sach.exercise.arraylist;
public class MyListTest {
    public static void main(String[] args) {
            MyList<Integer> list = new MyList(3);
            list.add(10);
            list.add(12120);
            list.add(13);
            list.add(14);
            list.add(1, 11);
            MyList<Integer> clone = new MyList(10);
            list.add(1, 11);
            System.out.println(list.contains(12120));
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + "\t");
            }
    }
}
