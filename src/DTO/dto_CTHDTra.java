package DTO;

public class dto_CTHDTra {
    private String IdHD, IdSach, IdQuyDinh;
    private int SoLuong, GiaSach;
    private int TongGia;
    private int TienPhat;
    private int TienTraCoc;
    private String IdNCC;

    public dto_CTHDTra() {
    }

    public dto_CTHDTra(String idHD, String idSach, String idQuyDinh, int soLuong,
                       int giaSach, int tongGia, int tienPhat, int tienTraCoc, String idNCC) {
        IdHD = idHD;
        IdSach = idSach;
        IdQuyDinh = idQuyDinh;
        SoLuong = soLuong;
        GiaSach = giaSach;
        TongGia = tongGia;
        TienPhat = tienPhat;
        TienTraCoc = tienTraCoc;
        IdNCC = idNCC;
    }

    public String getIdHD() {
        return IdHD;
    }

    public void setIdHD(String idHD) {
        IdHD = idHD;
    }

    public String getIdSach() {
        return IdSach;
    }

    public void setIdSach(String idSach) {
        IdSach = idSach;
    }

    public String getIdQuyDinh() {
        return IdQuyDinh;
    }

    public void setIdQuyDinh(String idQuyDinh) {
        IdQuyDinh = idQuyDinh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getGiaSach() {
        return GiaSach;
    }

    public void setGiaSach(int giaSach) {
        GiaSach = giaSach;
    }

    public int getTongGia() {
        return TongGia;
    }

    public void setTongGia(int tongGia) {
        TongGia = tongGia;
    }

    public int getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(int tienPhat) {
        TienPhat = tienPhat;
    }

    public int getTienTraCoc() {
        return TienTraCoc;
    }

    public void setTienTraCoc(int tienTraCoc) {
        TienTraCoc = tienTraCoc;
    }

    public String getIdNCC() {
        return IdNCC;
    }

    public void setIdNCC(String idNCC) {
        IdNCC = idNCC;
    }
}
