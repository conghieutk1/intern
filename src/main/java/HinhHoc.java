public abstract class HinhHoc {
    protected String loai;

    public HinhHoc(String loai) {
        this.loai = loai;
    }

    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    public void hienThiThongTin() {
        System.out.println("Hình: " + loai);
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}

class HinhTron extends HinhHoc {
    protected double banKinh;

    public HinhTron(double banKinh) {
        super("Hình tròn");
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}

class HinhVuong extends HinhHoc {
    protected double canh;

    public HinhVuong(double canh) {
        super("Hình vuông");
        this.canh = canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }
}


