public class SinhVien {
    private String MSV;
    private String HoTen;
    private int NamSinh;
    private double DTB;
    public SinhVien(String mSV, String hoTen, int namSinh, double dTB) {
            MSV = mSV;
            HoTen = hoTen;
            NamSinh = namSinh;
            DTB = dTB;
        }

    public SinhVien() {
    
    }
    public String getMSV() {
        return MSV;
    }

    public void setMSV(String mSV) {
        MSV = mSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double dTB) {
        DTB = dTB;
    }

    @Override
    public String toString() {
        return "SinhVien [MSV=" + MSV + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", DTB=" + DTB + "]";
    }
}
