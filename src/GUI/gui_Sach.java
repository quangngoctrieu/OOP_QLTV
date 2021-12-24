package GUI;

import BLL.bll_Sach;
import DTO.dto_Sach;

import java.util.Scanner;

import static BLL.bll_KT.SoGioiHan;
import static DAL.dal_Sach.DocFile_Sach;
//import static DAL.dal_Sach.DocFile;

public class gui_Sach {
    Scanner sc = new Scanner(System.in);
    bll_Sach bll_sach = new bll_Sach();
    dto_Sach dto_sach = new dto_Sach();

    public gui_Sach() {
    }

    public void TrangSach() {
        System.out.println("-------------     Chào Mừng Bạn Đến Với Trang Sách      -------------");
        System.out.println("1. Hiển thị danh sách sách ");
        System.out.println("2. Thêm một sách ");
        System.out.println("3. Sửa một sách");
        System.out.println("4. Xóa một sách ");
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
                System.out.println("---------Hiển thị một sách -------------");
                HienThiDanhSach();
                break;
            case 2:
                System.out.println("---------Thêm một sách -------------");
                them();
                break;
            case 3:
                System.out.println("---------Sửa một sách -------------");
                sua();
                break;
            case 4:
                System.out.println("---------Xóa một sách -------------");
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
        String TenSach;
        String IdNCC;
        int SoLuongSach;
        int GiaSach;
        System.out.println("Xin mời nhập Tên Sách: ");
        TenSach = sc.nextLine();
        System.out.println("Xin mời nhập Id Nhà cung cấp: ");
        IdNCC = sc.nextLine();
        System.out.println("Xin mời nhập Số Lượng Sách: ");
        SoLuongSach = sc.nextInt();
        System.out.println("Xin mời nhập Số Giá Sách: ");
        GiaSach = sc.nextInt();
        System.out.println("Xin mời nhập Mã loại sách: ");
        String IdLoai = sc.nextLine();
        dto_sach = new dto_Sach(null, TenSach, IdNCC, SoLuongSach, GiaSach, IdLoai);
        bll_sach.them(dto_sach);
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
            String TenSach;
            String IdNCC;
            int SoLuongSach;
            int GiaSach;
            String IdLoai;

            System.out.println("Xin mời nhập Tên Sách: ");
            TenSach = sc.nextLine();
            System.out.println("Xin mời nhập Id Nhà cung cấp: ");
            IdNCC = sc.nextLine();
            System.out.println("Xin mời nhập Số Lượng Sách: ");
            SoLuongSach = sc.nextInt();
            System.out.println("Xin mời nhập Giá Sách: ");
            GiaSach = sc.nextInt();
            System.out.println("Xin mời nhập Mã loại sách: ");
            sc.nextLine();
            IdLoai = sc.nextLine();
            System.out.println(IdLoai);
            dto_sach = new dto_Sach(String.valueOf(id), TenSach, IdNCC, SoLuongSach, GiaSach, IdLoai);           //   3-A-A-A-A-A-12/07/2001
            bll_sach.sua(dto_sach, id);
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
            bll_sach.xoa(i);
        }
    }
    public void HienThiDanhSach(){
        dto_Sach sv[] = DocFile_Sach();
        System.out.println("IdSach        -    TênSach       -   IdNCC   -   SoLuongTrang -   GiaSach    - IdLoại");
        for(int i = 0; i< sv.length; i++)
            System.out.println(sv[i].getIdSach() + "    " + sv[i].getTenSach() + "    " +  sv[i].getIdNCC() + "   " + sv[i].getSoLuongSach() + "   " +
                    sv[i].getGiaSach()+"     "+sv[i].getIdLoai());
    }

    public void thoat() {
        System.out.println("xin chào và hen gặp lại ");
    }

    public void quayvemanhinhchinh() {
        Main m=new Main();
        m.TrangChinh();

    }

    public static void main(String[] args) {
        gui_Sach sach = new gui_Sach();
        sach.TrangSach();
        //sach.them();
        //sach.xoa();
//        sach.sua();
    }
}
