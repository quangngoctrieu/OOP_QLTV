package BLL;

import DTO.dto_NhanVien;

public class bll_NhanVien implements bll_ConNguoi{
    dto_NhanVien nv=new dto_NhanVien();

    public void test(){
        nv.setIdNV("hi");
    }


    @Override
    public void them(Object object) {
        System.out.println("them");
    }
    @Override
    public void xoa( int i) {
    }

    @Override
    public void sua(Object object, int i) {

    }

    @Override
    public void TroLai() {

    }
}
