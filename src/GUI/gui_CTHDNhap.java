package GUI;

import BLL.bll_CTHDNhap;
import DTO.dto_CTHDNhap;
import DTO.dto_Sach;

import java.util.Scanner;

import static BLL.bll_KT.*;
import static DAL.dal_CTHDNhap.DocFile_CTHDNhap;
import static DAL.dal_Sach.DocFile_Sach;

public class gui_CTHDNhap {
    Scanner sc = new Scanner(System.in);
    bll_CTHDNhap bll_cthdn = new bll_CTHDNhap();
    dto_CTHDNhap dto_cthdn = new dto_CTHDNhap();

    public gui_CTHDNhap() {
    }

    public void TrangCTHDN() {
        System.out.println("-------------     Chào Mừng Bạn Đến Với Trang Hóa đơn nhập       -------------");
        System.out.println("1. Hiển thị danh sách Hóa đơn nhập ");
        System.out.println("2. Thêm một Hóa đơn nhập ");
        System.out.println("3. Sửa một Hóa đơn nhập");
        System.out.println("4. Xóa một Hóa đơn nhập ");
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
                System.out.println("---------Hiển thị danh dách một Hóa đơn nhập -------------");
                HienThiDanhSach();
                TrangCTHDN();
                break;
            case 2:
                System.out.println("---------Thêm một Hóa đơn nhập -------------");
                them();
                TrangCTHDN();
                break;
            case 3:
                System.out.println("---------Sửa một Hóa đơn nhập -------------");
                sua();
                TrangCTHDN();
                break;
            case 4:
                System.out.println("---------Xóa một Hóa đơn nhập -------------");
                xoa();
                TrangCTHDN();
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
        dto_Sach dto_sach[]=DocFile_Sach();
        String Masach, Soluong, Tiensach, TongGia;
        boolean check;
        System.out.println("Xin mời nhập Mã Sách: ");
        Masach = sc.nextLine();

        System.out.println("Xin mời nhập Số lượng sách: ");
        Soluong = sc.nextLine();
        check = Check_Num(Soluong);
        while (!check) {
            System.out.println("Nhập sai mời nhập lại Số lượng sách: ");
            Soluong = sc.nextLine();
            check = Check_Num(Soluong);
        }
        System.out.println("Xin mời nhập Tiền sách: ");
        Tiensach = sc.nextLine();
        check = Check_Num(Tiensach);
        while (!check) {
            System.out.println("Nhập sai mời nhập lại Tiền sách: ");
            Tiensach = sc.nextLine();
            check = Check_Num(Tiensach);
        }
//        for(int i=0;)


        System.out.println("Xin mời nhập Tổng tiền: ");
        TongGia = sc.nextLine();
        check = Check_Num(TongGia);
        while (!check) {
            System.out.println("Nhập sai mời nhập lại Tổng tiền: ");
            TongGia = sc.nextLine();
            check = Check_Num(TongGia);
        }
        dto_cthdn = new dto_CTHDNhap(null, Masach, Integer.parseInt(Soluong),
                Integer.parseInt(Tiensach), Integer.parseInt(TongGia));           //   3-A-A-A-A-A-12/07/2001
        bll_cthdn.them(dto_cthdn);
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
            String Masach, Soluong, Tiensach, TongGia;
            boolean check;
            System.out.println("Xin mời nhập Mã Sách: ");
            Masach = sc.nextLine();

            System.out.println("Xin mời nhập Số lượng sách: ");
            Soluong = sc.nextLine();
            check = Check_Num(Soluong);
            while (!check) {
                System.out.println("Nhập sai mời nhập lại Số lượng sách: ");
                Soluong = sc.nextLine();
                check = Check_Num(Soluong);
            }
            System.out.println("Xin mời nhập Tiền sách: ");
            Tiensach = sc.nextLine();
            check = Check_Num(Tiensach);
            while (!check) {
                System.out.println("Nhập sai mời nhập lại Tiền sách: ");
                Tiensach = sc.nextLine();
                check = Check_Num(Tiensach);
            }

            System.out.println("Xin mời nhập Tổng tiền: ");
            TongGia = sc.nextLine();
            check = Check_Num(TongGia);
            while (!check) {
                System.out.println("Nhập sai mời nhập lại Tổng tiền: ");
                TongGia = sc.nextLine();
                check = Check_Num(TongGia);
            }
            dto_cthdn = new dto_CTHDNhap(null, Masach, Integer.parseInt(Soluong),
                    Integer.parseInt(Tiensach), Integer.parseInt(TongGia));           //   3-A-A-A-A-A-12/07/2001
            bll_cthdn.sua(dto_cthdn, id);


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
            bll_cthdn.xoa(i);
        }
    }

    public void HienThiDanhSach() {
        dto_CTHDNhap hdn[] = DocFile_CTHDNhap();
        System.out.println("MaHD  -  MaSach - Số lượng -   Giá   - Tổng Tiền");
        for (int i = 0; i < hdn.length; i++)
            System.out.println(" "+hdn[i].getIdHDNhap() + "    " + hdn[i].getIdSach() + "      " + hdn[i].getSoLuong() + "          "
                    + hdn[i].getGia() + "         " + hdn[i].getTongGia());
    }

    public void thoat() {
        System.out.println("xin chào và hen gặp lại ");
    }

    public void quayvemanhinhchinh() {
        Main m=new Main();
        m.TrangChinh();

    }


}
