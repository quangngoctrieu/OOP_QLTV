package DTO;

import java.util.Date;

public class dto_NhanVien extends dto_ConNguoi{
    private String MaNV;
    private Date NgayVaoLam;

    public dto_NhanVien(String hoTen, String phai, String diaChi, String sdt, Date ngaySinh, String maNV, Date ngayVaoLam) {
        super(hoTen, phai, diaChi, sdt, ngaySinh);
        MaNV = maNV;
        NgayVaoLam = ngayVaoLam;
    }
    public dto_NhanVien(){}
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        NgayVaoLam = ngayVaoLam;
    }

}
