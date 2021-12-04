package GUI;

import DTO.dto_SinhVien;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("src/Data/testghi.txt", true);
            bw = new BufferedWriter(fw);
            bw.write("hai 321 ");

        } finally {

            if (bw != null) {
                bw.close();
            }
        }
    }
}
