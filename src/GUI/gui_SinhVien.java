package GUI;

import BLL.bll_SinhVien;
import DAL.dal_SinhVien;
import DTO.dto_SinhVien;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static BLL.bll_KT.*;
import static DAL.dal_SinhVien.DocFile;

public class gui_SinhVien {
    Scanner sc = new Scanner(System.in);
    bll_SinhVien bll_sv = new bll_SinhVien();
    dto_SinhVien dto_sv = new dto_SinhVien();

    public gui_SinhVien() {
    }

    public void TrangSinhVien() {
        System.out.println("-------------     Chào Mừng Bạn Đến Với Trang Sinh Viên       -------------");
        System.out.println("1. Hiển thị danh sách sinh viên ");
        System.out.println("2. Thêm một sinh viên ");
        System.out.println("3. Sửa một sinh viên");
        System.out.println("4. Xóa một sinh viên ");
        System.out.println("5. Về màn hình chính");
        System.out.println("6. Thoát ");
        System.out.println("---------Mời bạn nhập lựa chọn--------");
        String lc;
        lc = sc.nextLine();
        int toithieu = 1;
        int toida = 6;
        while (!SoGioiHan(lc, toithieu, toida)) {
            System.out.println("---------Bạn đã nhập số lựa chọn không chính xác--------");
            System.out.println("---------Mời bạn nhập lựa chọn--------");
            lc = sc.nextLine();

        }

        switch (Integer.parseInt(lc)) {
            case 1:
                System.out.println("---------Hiển thị một sinh viên -------------");
                break;
            case 2:
                System.out.println("---------Thêm một sinh viên -------------");
                them();
                break;
            case 3:
                System.out.println("---------Sửa một sinh viên -------------");
                sua();
                break;
            case 4:
                System.out.println("---------Xóa một sinh viên -------------");
                xoa();
                break;
            case 5:
                System.out.println("---------Quay về màn hình chính -------------");
                quayvemanhinhchinh();
                break;
            case 6:
                thoat();
                break;

        }
    }

    public void them() {
        String so;
        String hoTen;
        String phai = null;
        String lop;
        String diaChi;
        String sdt;
        String ngaySinh;
        Date ngaysinhdate;
        System.out.println("Xin mời nhập Họ Và Tên: ");
        hoTen = sc.nextLine();
        System.out.println("Xin mời nhập phái: ");
        System.out.println("1. nam");
        System.out.println("2. nữ");
        System.out.println("3. khác");
        so = sc.nextLine();
        while (!SoGioiHan(so, 1, 3)) {
            System.out.println("Nhập sai mời nhập lại: ");
            System.out.println("Xin mời nhập phái: ");
            System.out.println("1. nam");
            System.out.println("2. nữ");
            System.out.println("3. khác");
            so = sc.nextLine();
        }
        if (so.equals("1"))
            phai = "nam";
        if (so.equals("2"))
            phai = "nữ";
        if (so.equals("3"))
            phai = "khác";
        System.out.println("Xin mời nhập Lớp: ");
        lop = sc.nextLine();
        System.out.println("Xin mời nhập Địa Chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Xin mời nhập Số điện thoại: ");
        sdt = sc.nextLine();
        while (!SoDienThoai(sdt)) {
            System.out.println("Nhập sai mời nhập lại: ");
            sdt = sc.nextLine();
        }
        System.out.println("Xin mời nhập Ngày Sinh: ");
        ngaySinh = sc.nextLine();
        ngaysinhdate = Chuyen_String_Date(ngaySinh);
        dto_sv = new dto_SinhVien(null, hoTen, phai, lop, diaChi, sdt, ngaysinhdate);
        try {
            bll_sv.them(dto_sv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sua() {
        System.out.println("Mời bạn nhập id muốn sửa ");
        int id = sc.nextInt();
        System.out.println("Bạn chắc chứ: ");
        System.out.println("1. Chắc");
        System.out.println("2. Chưa");
        String lc = sc.nextLine();
        while (!SoGioiHan(lc, 1, 2)) {
            System.out.println("Nhập sai mời nhập lại lựa chọn: ");
            lc = sc.nextLine();
        }
        if (lc.equals("1")) {
            String so;
            String hoTen;
            String phai = null;
            String lop;
            String diaChi;
            String sdt;
            String ngaySinh;
            Date ngaysinhdate;
            System.out.println("Xin mời nhập Họ Và Tên: ");
            hoTen = sc.nextLine();
            System.out.println("Xin mời nhập phái: ");
            System.out.println("1. nam");
            System.out.println("2. nữ");
            System.out.println("3. khác");
            so = sc.nextLine();
            while (!SoGioiHan(so, 1, 3)) {
                System.out.println("Nhập sai mời nhập lại: ");
                System.out.println("Xin mời nhập phái: ");
                System.out.println("1. nam");
                System.out.println("2. nữ");
                System.out.println("3. khác");
                so = sc.nextLine();
            }
            if (so.equals("1"))
                phai = "nam";
            if (so.equals("2"))
                phai = "nữ";
            if (so.equals("3"))
                phai = "khác";
            System.out.println("Xin mời nhập Lớp: ");
            lop = sc.nextLine();
            System.out.println("Xin mời nhập Địa Chỉ: ");
            diaChi = sc.nextLine();
            System.out.println("Xin mời nhập Số điện thoại: ");
            sdt = sc.nextLine();
            while (!SoDienThoai(sdt)) {
                System.out.println("Nhập sai mời nhập lại: ");
                sdt = sc.nextLine();
            }
            System.out.println("Xin mời nhập Ngày Sinh: ");
            ngaySinh = sc.nextLine();
            ngaysinhdate = Chuyen_String_Date(ngaySinh);
            dto_sv = new dto_SinhVien(String.valueOf(id), hoTen, phai, lop, diaChi, sdt, ngaysinhdate);
            try {
                bll_sv.sua(dto_sv, id);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void xoa() {
        System.out.println("Mời bạn nhập id muốn xóa ");
        int i = sc.nextInt();
        System.out.println("Bạn chắc chứ: ");
        System.out.println("1. Chắc");
        System.out.println("2. Chưa");
        String lc = sc.nextLine();
        while (!SoGioiHan(lc, 1, 2)) {
            System.out.println("Nhập sai mời nhập lại lựa chọn: ");
            lc = sc.nextLine();
        }

        if (lc.equals("1")) {
            try {
                bll_sv.xoa(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void thoat() {
        System.out.println("xin chào và hen gặp lại ");
    }

    public void quayvemanhinhchinh() {


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
    public static void main(String[] args) {
        gui_SinhVien sv = new gui_SinhVien();
        sv.TrangSinhVien();
//        sv.them();
//        sv.xoa();
    }
}
