package DAL;

import DTO.dto_NhanVien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class dal_NhanVien {
    dto_NhanVien nv[] = new dto_NhanVien[10];

}


//    private int a;
//
//    FileReader file;
//
//    {
//        try {
//            file = new FileReader("src/test.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    BufferedReader input = new BufferedReader(file);
//
//    public int teset() throws IOException {
//        String i;
//        int t = 0;
//        while ((i = input.readLine()) != null) {
//            if (i.length() == 0)
//                System.out.println("12345");
//            else {
//                System.out.println(i);
//                t++;
//            }
//        }
//        System.out.println(t);
//        try {
//            file = new FileReader("src/test.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        input = new BufferedReader(file);
//        System.out.println(input.readLine());
//        return t;
//    }
//
//    public dal_NhanVien() {
//    }
//
//    public static void main(String[] args) throws IOException {
//        dal_NhanVien d = new dal_NhanVien();
//        d.teset();
//
//    }
//}
