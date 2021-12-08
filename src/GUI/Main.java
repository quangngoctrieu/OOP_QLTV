package GUI;

import BLL.*;
import DTO.dto_HDMuon;
import DTO.dto_NhanVien;
import DTO.dto_SinhVien;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       bll_SinhVien bll_sv=new bll_SinhVien();
        dto_SinhVien sv=new dto_SinhVien("2","1","1","1","1","1",null);
//       bll_sv.them(sv);
////bll_sv.xoa(2);
        bll_sv.sua(sv,2);
    }
}
