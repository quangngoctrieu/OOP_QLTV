package BLL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bll_KT {
    public static boolean So(String so) {
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(so);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public static boolean Chuoi(String s) {
        Pattern p = Pattern.compile("[^A-Za-z]");
        Matcher matcher = p.matcher(s);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public static boolean ThoiGian(String s) {
        Date ngay = new Date();
        if (s.contains("-")||s.contains("/"))
           s= s.replaceAll("-","/");
        else {
            System.out.println("Nhập sai định dạng ngày tháng năm");
            return false;
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngay=format.parse(s);        // chuyển String sang date
            return true;
        } catch (ParseException e) {
            System.out.println("Nhập sai định dạng ngày tháng năm");
            return false;
        }

    }

//    public static void main(String[] args) {
////        ThoiGian("12-200-2001");
//    }
}
