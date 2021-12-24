package GUI;

import DTO.dto_SinhVien;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static BLL.bll_KT.*;

public class mainTest {
//    public static void main(String[] args) {
//        Date ngay = new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            ngay=ft.parse("13/17/2000");        // chuyển String sang date
//            String strDate= ft.format(ngay);        // chuyển Date sang String
//            System.out.println(strDate);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(ngay);
//    }

//    public static void main(String[] args) {
//        dto_SinhVien arr_SV[] = new dto_SinhVien[2] ;
//        arr_SV[0] =new dto_SinhVien();
//        arr_SV[0].setIdSV("1");
//
//    }

//    public static void main(String[] args) {
//        String s="a1a2a3";
//        String t=s.replace('a','A');
//        System.out.println(t);
//    }

//    public static void main(String[] args) {
//    	 try{
////             File file =new File("src/Data/testghi.txt");
////             if(!file.exists()){
////               file.createNewFile();
////             }
//
//             FileWriter fw = new FileWriter("src/Data/testghi.txt",true);
//             BufferedWriter bw = new BufferedWriter(fw);
//             bw.write("hai 321 ",1,4);
//
////             bw.writeln();
//             bw.close();
////             PrintWriter pw = new PrintWriter(bw);
////             //This will add a new line to the file content
////             pw.println("");
////             pw.write("hai hello");
////             /* Below three statements would add three
////              * mentioned Strings to the file in new lines.
////              */
////             pw.println("This is first line");
////             pw.println("This is the second line");
////             pw.println("This is third line");
////             pw.close();
//
//         System.out.println("Data successfully appended at the end of file");
//
//          }catch(IOException ioe){
//              System.out.println("Exception occurred:");
//              ioe.printStackTrace();
//         }
//    }

    //    public static void main(String[] args) throws IOException {
//        BufferedReader bf = null;
//        BufferedWriter bufferedWriter = null;
//
//        try {
//            Reader reader = new FileReader("src/Data/test.txt");
//            Writer writer = new FileWriter("src/Data/test.txt");
//
//            bf = new BufferedReader(reader);
//            bufferedWriter = new BufferedWriter(writer);
//
//            String c="";
//            int t = 0;
//            c = bf.readLine();
//            System.out.println("c: "+c);
//            while ((c = bf.readLine()) != null) {
//                dto_SinhVien sv = new dto_SinhVien();
//                sv = Luu_sv(c);
//                int id = Integer.parseInt(sv.getIdSV());
//                if (id == 2)
//                    sv.setIdSV("5");
//                String s = sv.getIdSV() + "-" +
//                        sv.getHoTen() + "-" +
//                        sv.getPhai() + "-" +
//                        sv.getLop() + "-" +
//                        sv.getDiaChi() + "-" +
//                        sv.getSdt();
//                bufferedWriter.write(s);
//                bufferedWriter.newLine();
//            }
//        } finally {
//            if (bf != null) {
//                bf.close();
//            }
//            if (bufferedWriter != null) {
//                bufferedWriter.close();
//            }
//        }
//        System.out.println("thành công");
//    }
//
//    private static Date Chuyen_String_Date(String ngaySinh) {
//        Date ngay = new Date();
//        SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");   // Định dạng ngày tháng trong chuỗi
//        Date ngsinh = null;
//        try {
//            ngsinh = Format.parse(ngaySinh);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return ngsinh;
//    }
//
//
//    private static dto_SinhVien Luu_sv(String chuoi) {
//        StringTokenizer st = new StringTokenizer(chuoi, "-");
//        dto_SinhVien arr_SV = new dto_SinhVien();
//        while (st.hasMoreTokens()) {
//            arr_SV = new dto_SinhVien();
//            arr_SV.setIdSV(st.nextToken());
//            arr_SV.setHoTen(st.nextToken());
//            arr_SV.setPhai(st.nextToken());
//            arr_SV.setLop(st.nextToken());
//            arr_SV.setDiaChi(st.nextToken());
//            arr_SV.setSdt(st.nextToken());
//            String ngay = st.nextToken();
//            Date ngsinh = Chuyen_String_Date(ngay);
//            arr_SV.setNgaySinh(ngsinh);
//        }
//        return arr_SV;
//    }
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    Date s=new Date();
//    s=null;
//    int a=7;
//    a=a++;
//    int c= 8;
//    c++;
//
////    String s=sc.nextLine();
//    if(s==null)
//    System.out.println("hello "+s);
//}
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Xin mời nhập Tổng sách: ");
//    String Tongsach = sc.nextLine();
//    boolean kt= Check_Num(Tongsach);
//
//        while (!kt) {
//            System.out.println("Nhập sai mời nhập lại Tổng sách: ");
//            Tongsach = sc.nextLine();
//            kt=Check_Num(Tongsach);
//            System.out.println(kt);
//        }
//}
    public static void main(String[] args) {
        int t=0;
        while(t==0) {
            System.out.println("Bạn có muốn nhập tiếp ");
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Chắc");
            System.out.println("2. Không");
            String lc2 = sc.nextLine();
            while (!SoGioiHan(lc2, 1, 2)) {
                System.out.println("Nhập sai mời nhập lại lựa chọn: ");
                lc2 = sc.nextLine();
            }
            if(lc2.equals("2"))
                t=1;
            else
                t=0;
        }

    }


}
