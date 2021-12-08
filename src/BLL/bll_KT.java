package BLL;

import DTO.dto_SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static DAL.dal_SinhVien.DocFile;

public class bll_KT {
    public static boolean So(String so) {
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(so);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public static boolean SoGioiHan(String so, int toithieu, int toida) {
        Pattern pattern = Pattern.compile("[" + toithieu + "-" + toida + "]");
        Matcher matcher = pattern.matcher(so);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public static boolean SoDienThoai(String so) {
        Pattern pattern = Pattern.compile("^0\\d{2}\\d{7}");
        Matcher matcher = pattern.matcher(so);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    //    public static boolean Ngay(String ngay) {
//        if(ngay.length()==12)
//            if (ngay.contains("-")||)
//        if (matcher.matches())
//            return true;
//        else
//            return false;
//    }
    public static boolean Chuoi(String s) {
        Pattern p = Pattern.compile("[^A-Za-z]");
        Matcher matcher = p.matcher(s);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public static boolean IdTonTai(String id) {

        dto_SinhVien arr_SV[] = DocFile();

        int cd = DocFile().length;
        for (int i = 0; i < cd; i++) {
            String idtam=arr_SV[i].getIdSV();
            if (id.equals(idtam))

                return true;

        }
        return false;
    }


    public static boolean ThoiGian(String s) {
        Date ngay = new Date();
        if (s.contains("-") || s.contains("/"))
            s = s.replaceAll("-", "/");
        else {
            System.out.println("Nhập sai định dạng ngày tháng năm");
            return false;
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngay = format.parse(s);        // chuyển String sang date
            return true;
        } catch (ParseException e) {
            System.out.println("Nhập sai định dạng ngày tháng năm");
            return false;
        }

    }

    public static void main() {
//        ThoiGian("12-200-2001");
    if (IdTonTai("1"))
        System.out.println("hello");
    }
}
