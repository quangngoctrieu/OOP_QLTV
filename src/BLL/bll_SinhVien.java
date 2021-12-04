package BLL;

import DAL.dal_SinhVien;
import DTO.dto_SinhVien;

import java.io.IOException;

import static DAL.dal_SinhVien.*;

public class bll_SinhVien implements bll_ConNguoi {


    @Override
    public void them(Object object) throws IOException {
        if (GhiFile((dto_SinhVien) object))
            System.out.println("Thêm thành công");
        else
            System.out.println("Thêm thất bại ");
    }

    @Override
    public void xoa(int id) throws IOException {
        dto_SinhVien DSSV_Cu[] = DocFile();
        int cd_DSSV = DSSV_Cu.length ;
        dto_SinhVien sv[] = new dto_SinhVien[cd_DSSV-1];
        int c=0,getid;
        for ( int i = 0; i < cd_DSSV; i++) {
            getid= Integer.parseInt(DSSV_Cu[i].getIdSV());
            if (id != getid) {
                sv[c] = DSSV_Cu[i];
                c++;
            }

        }
        if (Xoa(sv))
            System.out.println("Xóa thành công");
        else
            System.out.println("Xóa thất bại ");

    }

    @Override
    public void sua(Object object, int id) throws IOException {
        dto_SinhVien obj = (dto_SinhVien) object;
        dto_SinhVien DSSV_Cu[] = DocFile();
        int cd_DSSV = DSSV_Cu.length;
        dto_SinhVien sv[] = new dto_SinhVien[cd_DSSV];
        for (int i = 0; i < cd_DSSV; i++) {
            sv[i] = new dto_SinhVien();
            int tam = Integer.parseInt(DSSV_Cu[i].getIdSV());
            if (tam != id)
                sv[i] = DSSV_Cu[i];
            else {

                sv[i].setIdSV(obj.getIdSV());
                sv[i].setHoTen(obj.getHoTen());
                sv[i].setPhai(obj.getPhai());
                sv[i].setLop(obj.getLop());
                sv[i].setDiaChi(obj.getDiaChi());
                sv[i].setSdt(obj.getSdt());
                sv[i].setNgaySinh(obj.getNgaySinh());
            }
        }
        ;
        if (GhiFile_Giua(sv))
            System.out.println("Sửa thành công");
        else
            System.out.println("Sửa thất bại ");

    }

    @Override
    public void TroLai() {

    }
}
