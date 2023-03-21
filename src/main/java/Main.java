import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

//        HinhTron hinhTron = new HinhTron(3);
//        hinhTron.hienThiThongTin();
//
//        HinhVuong hinhVuong = new HinhVuong(4);
//        hinhVuong.hienThiThongTin();
        System.out.println("-------------------------");
        PhepCong phepCong = new PhepCong(1,2);
        phepCong.Display();
        phepCong.TestDaHinh();

        System.out.println("-------------------------");
        PhepBinhPhuong phepBP = new PhepBinhPhuong(5);
        phepBP.Display();
        phepBP.TestDaHinh();

//        System.out.println("-------------------------");
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap mot chuoi so: ");
//        Double a = input.nextDouble();
//        Double b = input.nextDouble();
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        input.close();
        System.out.println("-------------------------");


        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter input: ");
        String myString = input1.next();

        double d = Double.parseDouble(myString);
        String str = "-123";
        double d1 = Double.parseDouble(str); // returns double primitive
        // System.out.println(d); //-123.45, trailing 0s are removed
        if (d >= -128 && d <= 127) {
            System.out.println("byte\nshort\nint\nlong");
        }
        if ((d >= -32768.0 && d < -128.0) || (d > 127.0 && d <= 32767.0)) {
            System.out.println("short\nint\nlong");
        }
        if ((d >= -2147483648.0 && d < -32768.0) || (d > 32767.0 && d <= 2147483647.0)) {
            System.out.println("int\nlong");
        }
        if ((d >= -9223372036854775808.0  && d < -2147483648.0) || (d > 2147483647.0 && d <= 9223372036854775807.0)) {
            System.out.println("long");
        } else {
            System.out.println("can't be fitted anywhere");
        }

        input1.close();
    }
}
