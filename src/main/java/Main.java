import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//   Nguyen ly truu tuong
//   Tính trừu tượng trong Java là tính chất không thể hiện cụ thể mà chỉ nêu tên vấn đề. Đó là một quá trình che giấu các
//    hoạt động bên trong và chỉ hiển thị những tính năng thiết yếu của đối tượng tới người dùng
        System.out.println("-------------------------");
        PhepCong phepCong = new PhepCong(1,2);
        phepCong.Display();
//    Nguyen ly da hinh : - Các lớp phải có quan hệ kế thừa với 1 lớp cha nào đó.
//                        - Phương thức đa hình phải được ghi đè (override) ở lớp con. Tính đa hình chỉ được thể hiện ghi đã ghi đè lên phương thức của lớp cha.
//                        => Ở đây nguyên lý đa hình thể hiện ở chỗ phương thức TestDaHinh của lớp con ghi đè lên phương thức TestDaHinh của lớp cha
        phepCong.TestDaHinh();

        PhepBinhPhuong phepBP = new PhepBinhPhuong(5);
        phepBP.Display();
        phepBP.TestDaHinh();
// Nguyen ly dong goi:  - Đóng gói class Person giúp ngăn ngừa việc gọi phương thức của lớp này tác động hay truy xuất dữ liệu của đối tượng thuộc về lớp khác
//                      - Dữ liệu riêng (khi được khai báo là private) của mỗi đối tượng được bảo vệ khỏi sự truy xuất không hợp lệ từ bên ngoài.
//                      - Sử dụng các phương thức setter/getter có phạm vi truy cập là public để truy cập và sửa đổi các giá trị của thuộc tính trong lớp
        System.out.println("-------------------------");
        Person person = new Person();
        person.setHoTen("Hiếu Đặng");
        person.setTuoi(21);

        System.out.println("Họ tên: " + person.getHoTen() + ", tuổi: " + person.getTuoi());
// Nguyên lý kế thừa được áp dụng khi class PhepCong kế thừa phương thức Tinh() của class PhepTinh



//     Thực hành với thư viên Scanner
        System.out.println("-------------------------");


        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot chuoi so: ");
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        System.out.println("Tong a va b bang " + (a+b));
        System.out.println("Hieu a va b bang " + (a-b));
        System.out.println("Tich a va b bang " + (a*b));
        System.out.println("Thuong a va b bang " + (a/b));
        input.close();
        System.out.println("-------------------------");

//          BÀI TẬP HACKERRANK
//        Scanner input1 = new Scanner(System.in);
//        System.out.print("Enter input: ");
//        String myString = input1.next();
//
//        double d = Double.parseDouble(myString);
//        String str = "-123";
//        double d1 = Double.parseDouble(str); // returns double primitive
//        // System.out.println(d); //-123.45, trailing 0s are removed
//        if (d >= -128 && d <= 127) {
//            System.out.println("byte\nshort\nint\nlong");
//        }
//        if ((d >= -32768.0 && d < -128.0) || (d > 127.0 && d <= 32767.0)) {
//            System.out.println("short\nint\nlong");
//        }
//        if ((d >= -2147483648.0 && d < -32768.0) || (d > 32767.0 && d <= 2147483647.0)) {
//            System.out.println("int\nlong");
//        }
//        if ((d >= -9223372036854775808.0  && d < -2147483648.0) || (d > 2147483647.0 && d <= 9223372036854775807.0)) {
//            System.out.println("long");
//        } else {
//            System.out.println("can't be fitted anywhere");
//        }
//
//        input1.close();
    }
}
