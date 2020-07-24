package com.hanabi.mystring;

import java.util.Arrays;

public class MyString {

    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public void tongGiaTriDonSo() {
        String strRep = str.replaceAll("[^0-9]", "");
        int sum = 0;
        for (int i = 0; i < strRep.length(); i++) {
            sum += Character.getNumericValue(strRep.charAt(i));
        }
        System.out.println(sum);
    }

    public void tongGiaTriSo() {
        String[] array = str.split("[^0-9]");
        int sum = 0;
        for (String s : array) {
            if (!s.trim().equals("")) {
                sum += Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }

    public boolean chuoiDoiXung() {
        boolean result = true;
        for (int i = 0; i < str.length() / 2 + 1; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
    
}
