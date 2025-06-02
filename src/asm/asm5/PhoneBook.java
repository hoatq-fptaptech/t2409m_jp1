package asm.asm5;

import java.util.ArrayList;

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

    }

    @Override
    public void updatePhone(String name, String newphone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }
}
