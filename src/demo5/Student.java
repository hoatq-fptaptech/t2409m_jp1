package demo5;

import java.util.ArrayList;

public class Student {
    private String name;
    private String address;
    private ArrayList<GirlFriend> girlFriend = new ArrayList<>(); // riêng 1 số dạng array list thì thêm phần new .. phía sau

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<GirlFriend> getGirlFriend() {
        return girlFriend;
    }

   //viết hàm thêm 1 bạn gái vào danh sách
    public boolean addGirlFriend(GirlFriend friend){
        return girlFriend.add(friend);
    }

    //viết hàm xoá 1 bạn gái khỏi danh sách
    public boolean removeGirlFriend(GirlFriend friend){
        return girlFriend.remove(friend);
    }
}
