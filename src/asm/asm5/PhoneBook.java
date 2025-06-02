package asm.asm5;

import java.util.ArrayList;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> phoneList = new ArrayList<>();
    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p: phoneList){
            if(p.getName() == name){ // nếu đã có tên này trong danh bạ
                p.getPhone().add(phone);
                return;
            }
        }
        // khi ra đây được mà ko bị return lần nào tức là
        // chưa hề có tên trong danh bạ
        PhoneNumber pn = new PhoneNumber(name,phone);
        phoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p: phoneList){
            if(p.getName() == name){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        removePhone(name);
        insertPhone(name,newphone);

//        for (PhoneNumber p: phoneList){
//            if(p.getName() == name){
//                p.getPhone().clear();
//                p.getPhone().add(newphone);
//                return;
//            }
//        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber p: phoneList){
            if(p.getName() == name){
                System.out.println(p.getName());
                for (String s: p.getPhone()){
                    System.out.println(s);
                }
                return;
            }
        }
    }

    @Override
    public void sort() {
        phoneList.sort((c1,c2)-> c1.getName().compareTo(c2.getName()));
//        Comparator<PhoneNumber> cmp = new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//        phoneList.sort(cmp);
    }

}
