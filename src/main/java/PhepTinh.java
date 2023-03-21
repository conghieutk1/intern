public abstract class PhepTinh {
   public String loai;
//   public double x, y;
   public PhepTinh(String loai) {
       this.loai = loai;
   }

    public abstract double Tinh();
//    public double getX() {
//        return x;
//    }
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    public void setY(double y) {
//        this.y = y;
//    }
   public void Display() {
       System.out.println("Kết quả " + loai + " = " + Tinh());
   }

   public void TestDaHinh() {
       System.out.println("Test da hinh: PhepTinh");
   }
}

class PhepCong extends PhepTinh {
    protected double x, y;

    public PhepCong(double x, double y) {
        super("phép cộng");
        this.x = x;
        this.y = y;
    }

    public void TestDaHinh() {
        System.out.println("Test da hinh: PhepCong");
    }
    @Override
    public double Tinh() {
        return x + y;
    }
}


class PhepTru extends PhepTinh {
    protected double x, y;

    public PhepTru(double x, double y) {
        super("phép trừ");
        this.x = x;
        this.y = y;
    }
    public void TestDaHinh() {
        System.out.println("Test da hinh: PhepTru");
    }
    @Override
    public double Tinh() {
        return x - y;
    }
}

class PhepNhan extends PhepTinh {
    protected double x, y;

    public PhepNhan(double x, double y) {
        super("phép nhân");
        this.x = x;
        this.y = y;
    }
    public void TestDaHinh() {
        System.out.println("Test da hinh: PhepNhan");
    }
    @Override
    public double Tinh() {
        return x * y;
    }
}

class PhepChia extends PhepTinh {
    protected double x, y;

    public PhepChia(double x, double y) {
        super("phép chia");
        this.x = x;
        this.y = y;
    }
    public void TestDaHinh() {
        System.out.println("Test da hinh: PhepChia");
    }
    @Override
    public double Tinh() {
        return x / y;
    }
}

class PhepBinhPhuong extends PhepTinh {
    protected double x;

    public PhepBinhPhuong(double x) {
        super("phép bình phương");
        this.x = x;
    }
    public void TestDaHinh() {
        System.out.println("Test da hinh: PhepBinhPhuong");
    }
    @Override
    public double Tinh() {
        return x * x;
    }
}
