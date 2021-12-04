package DAL;

import DTO.dto_SinhVien;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class dal_SinhVien {
    public static dto_SinhVien arr_SV[] = null;
    public static BufferedReader br = null;

    public dal_SinhVien() {
    }

    public static dto_SinhVien[] DocFile() {
        String chuoi;
        try {
            Reader rd = new FileReader("src/Data/SinhVien.txt");
            int cd_DSSV = Lay_Cd_dssv(rd);                                  // Truyền vào đường dẫn đễ lấy số dòng
            arr_SV = new dto_SinhVien[cd_DSSV];                                   // Khởi tạo mảng dssv

            rd = new FileReader("src/Data/SinhVien.txt");           // Khởi tạo lại đường dẫn để add vào mảng
            br = new BufferedReader(rd);
            br.readLine();
            int vt = 0;
            while ((chuoi = br.readLine()) != null) {
                Luu_sv(chuoi, vt);                                              // Lưu từng dòng vào mảng
                vt++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Đường dẫn đọc file sai ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr_SV;
    }


    public static boolean GhiFile(dto_SinhVien sv) throws IOException {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("src/Data/SinhVien.txt", true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            String s=   sv.getIdSV()  + "-" +
                        sv.getHoTen() + "-" +
                        sv.getPhai()  + "-" +
                        sv.getLop()   + "-" +
                        sv.getDiaChi()+ "-" +
                        sv.getSdt();
            bw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
        return true;

    }

    public static boolean GhiFile_Giua(dto_SinhVien[] sv) throws IOException {
        BufferedWriter bw = null;
        int cd_DSSV=sv.length;
        try {
            FileWriter fw = new FileWriter("src/Data/SinhVien.txt");
            bw = new BufferedWriter(fw);
            String dongTieuDe="MSSV        -    HọTên       -   Phai   -   Lớp -   ĐịaChỉ      -   SĐT     -   NgàySinh";
            bw.write(dongTieuDe);
            bw.close();
            fw = new FileWriter("src/Data/SinhVien.txt",true);
            bw = new BufferedWriter(fw);
            for (int i=0;i<cd_DSSV;i++) {
                bw.newLine();
                String s = sv[i].getIdSV() + "-" +
                        sv[i].getHoTen() + "-" +
                        sv[i].getPhai() + "-" +
                        sv[i].getLop() + "-" +
                        sv[i].getDiaChi() + "-" +
                        sv[i].getSdt();
                bw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
        return true;
    }

    public static boolean Xoa(dto_SinhVien[] sv) throws IOException {
        BufferedWriter bw = null;
        int cd_DSSV=sv.length;
        try {
            FileWriter fw = new FileWriter("src/Data/SinhVien.txt");
            bw = new BufferedWriter(fw);
            String dongTieuDe="MSSV        -    HọTên       -   Phai   -   Lớp -   ĐịaChỉ      -   SĐT     -   NgàySinh";
            bw.write(dongTieuDe);
            bw.close();
            fw = new FileWriter("src/Data/SinhVien.txt",true);
            bw = new BufferedWriter(fw);
            for (int i=0;i<cd_DSSV;i++) {
                bw.newLine();
                String s = sv[i].getIdSV() + "-" +
                        sv[i].getHoTen() + "-" +
                        sv[i].getPhai() + "-" +
                        sv[i].getLop() + "-" +
                        sv[i].getDiaChi() + "-" +
                        sv[i].getSdt();
                bw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
        return true;
    }
    private static Date Chuyen_String_Date(String ngaySinh) {
        Date ngay = new Date();
        SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");   // Định dạng ngày tháng trong chuỗi
        Date ngsinh = null;
        try {
            ngsinh = Format.parse(ngaySinh);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ngsinh;
    }

    private static int Lay_Cd_dssv(Reader reader) throws IOException {
        String chuoi;
        br = new BufferedReader(reader);
        br.readLine();
        int cd_DSSV = 0;
        while ((chuoi = br.readLine()) != null) {
            cd_DSSV++;
        }
        return cd_DSSV;
    }

    private static void Luu_sv(String chuoi, int vt) {
        StringTokenizer st = new StringTokenizer(chuoi, "-");
        while (st.hasMoreTokens()) {
            arr_SV[vt] = new dto_SinhVien();
            arr_SV[vt].setIdSV(st.nextToken());
            arr_SV[vt].setHoTen(st.nextToken());
            arr_SV[vt].setPhai(st.nextToken());
            arr_SV[vt].setLop(st.nextToken());
            arr_SV[vt].setDiaChi(st.nextToken());
            arr_SV[vt].setSdt(st.nextToken());
            String ngay = st.nextToken();
            Date ngsinh = Chuyen_String_Date(ngay);
            arr_SV[vt].setNgaySinh(ngsinh);
        }
    }

    public static void main(String[] args) throws IOException {
        dal_SinhVien sv = new dal_SinhVien();
//        dto_SinhVien sv1=new dto_SinhVien("1","1","1","1","1","1",null);
//        sv.GhiFile(sv1);
    }
}
