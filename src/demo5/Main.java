package demo5;

import demo4.Boy;

import java.util.ArrayList;

public class Main {
    public static void Main(String[] args){
        Boy b = new Boy(); // 1 object

        int arr[] = new int[10]; // mảng 10 so nguyên thông thường
        arr[0] = 20;

        Boy bs[] = new Boy[10];
        bs[0]= new Boy();

        ArrayList arrayList = new ArrayList(); // mảng dạng danh sách
        arrayList.add(20);
        arrayList.add("Hello");
        arrayList.add(new Boy());

        ArrayList<String> strList = new ArrayList<>();
        strList.add("T2409M");
//        strList.add(50);

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(15);
//        intArr.add("XYZ");

        System.out.println("pt dau tien: "+ strList.get(0));

        ArrayList<Boy> boyArrayList = new ArrayList<>();
        boyArrayList.add(new Boy());
        boyArrayList.add(new Boy());
        boyArrayList.add(new Boy());
        boyArrayList.add(new Boy());
        boyArrayList.add(new Boy());

        for(int i=0;i< boyArrayList.size();i++){ // boyArrayList.size() = 5
            // xoa x khỏi danh sách
//            boyArrayList.remove(i);
        }
        boyArrayList.remove(2);

        for(Boy x : boyArrayList ){ // tự động duyệt toàn bộ danh sách
            // x <=> boyArrayList.get(i)
            // xoa x khỏi danh sách
            boyArrayList.remove(x);
        }

        Student s = new Student();

        GirlFriend g1 = new GirlFriend("Tran Ha Linh","0988888888",21);
        s.addGirlFriend(g1);

        GirlFriend g2 = new GirlFriend("Lan Anh","09876545678",18);
        s.addGirlFriend(g2);

        s.removeGirlFriend(g2);

    }
}
