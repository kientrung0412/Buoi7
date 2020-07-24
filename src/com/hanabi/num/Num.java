package com.hanabi.num;

public class Num {

    private String str;

    public Num(String str) {
        this.str = str;
    }

    private String rules() {
        String result = str;
        while ((result.contains("+-") || result.contains("-+") || result.contains("--") || result.contains("++"))) {
            result = result.replace("+-", "-");
            result = result.replace("-+", "-");
            result = result.replace("++", "+0+");
            result = result.replace("--", "-0-");
        }
        return result;
    }

    public int caculate() {
        int sum = 0;
        String str = rules();
        str = str.replace("+", " +");
        str = str.replace("-", " -");
        String[] strings = str.split(" ");
        for (String s : strings) {
            sum += Integer.valueOf(s);
        }
        return sum;
    }

}
