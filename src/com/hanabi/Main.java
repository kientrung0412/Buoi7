package com.hanabi;

import com.hanabi.mystring.MyString;
import com.hanabi.num.Num;


public class Main {

    public static void main(String[] args) {
        MyString string = new MyString("4326bvbn12ty3r");
        string.tongGiaTriDonSo();
        string.tongGiaTriSo();
        System.out.println(string.chuoiDoiXung());

        Num num = new Num("3+4-5-6+9+1--+--+4-+23-10");
        System.out.println(num.caculate());

    }
}
