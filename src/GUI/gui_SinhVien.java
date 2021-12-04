package GUI;

import java.io.IOException;
import java.util.Scanner;

import static BLL.bll_KT.Chuoi;
import static BLL.bll_KT.So;

public class gui_SinhVien {
    Scanner sc=new Scanner(System.in);
    public gui_SinhVien() {
    }
    public void TrangSinhVien(){
        System.out.println("-------------     Chào Mừng Bạn Đến Với Trang Sinh Viên       -------------");
        System.out.println("1. Hiển thị danh sách sinh viên ");
        System.out.println("2. Thêm một sinh viên ");
        System.out.println("3. Sửa một sinh viên");
        System.out.println("4. Xóa một sinh viên ");
        System.out.println("5. Về màn hình chính");
        System.out.println("6. Thoát ");
        System.out.println("---------Mời bạn nhập lựa chọn--------");
        String s;
            s = sc.nextLine();

        while (!So(s)){
            System.out.println("---------Bạn không được nhập kí tự -----------");
            s=sc.nextLine();
            int lc=Integer.parseInt(s);
            while (lc < 1 || lc > 6) {
                System.out.println("---------Bạn đã nhập số lựa chọn không chính xác--------");
                System.out.println("---------Mời bạn nhập lựa chọn--------");
                lc = sc.nextInt();
            }
        }
        System.out.println(" thành công");
    }
    public void them(){

    }

    public static void main(String[] args) {
        gui_SinhVien sv=new gui_SinhVien();
        sv.TrangSinhVien();
    }
}
