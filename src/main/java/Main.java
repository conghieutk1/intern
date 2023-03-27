import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
import org.apache.log4j.Logger;
import java.io.*;
public class Main {
    //private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

//   Nguyen ly truu tuong
//   Tính trừu tượng trong Java là tính chất không thể hiện cụ thể mà chỉ nêu tên vấn đề. Đó là một quá trình che giấu các
//    hoạt động bên trong và chỉ hiển thị những tính năng thiết yếu của đối tượng tới người dùng
//        System.out.println("-------------------------");
//        PhepCong phepCong = new PhepCong(1,2);
//        phepCong.Display();
//    Nguyen ly da hinh : - Các lớp phải có quan hệ kế thừa với 1 lớp cha nào đó.
//                        - Phương thức đa hình phải được ghi đè (override) ở lớp con. Tính đa hình chỉ được thể hiện ghi đã ghi đè lên phương thức của lớp cha.
//                        => Ở đây nguyên lý đa hình thể hiện ở chỗ phương thức TestDaHinh của lớp con ghi đè lên phương thức TestDaHinh của lớp cha
//        phepCong.TestDaHinh();
//
//        PhepBinhPhuong phepBP = new PhepBinhPhuong(5);
//        phepBP.Display();
//        phepBP.TestDaHinh();
// Nguyen ly dong goi:  - Đóng gói class Person giúp ngăn ngừa việc gọi phương thức của lớp này tác động hay truy xuất dữ liệu của đối tượng thuộc về lớp khác
//                      - Dữ liệu riêng (khi được khai báo là private) của mỗi đối tượng được bảo vệ khỏi sự truy xuất không hợp lệ từ bên ngoài.
//                      - Sử dụng các phương thức setter/getter có phạm vi truy cập là public để truy cập và sửa đổi các giá trị của thuộc tính trong lớp
//        System.out.println("-------------------------");
//        Person person = new Person();
//        person.setHoTen("Hiếu Đặng");
//        person.setTuoi(21);
//
//        System.out.println("Họ tên: " + person.getHoTen() + ", tuổi: " + person.getTuoi());
// Nguyên lý kế thừa được áp dụng khi class PhepCong kế thừa phương thức Tinh() của class PhepTinh



//     Thực hành với thư viên Scanner
//        System.out.println("-------------------------");
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap mot chuoi so: ");
//        Double a = input.nextDouble();
//        Double b = input.nextDouble();
//        System.out.println("Tong a va b bang " + (a+b));
//        System.out.println("Hieu a va b bang " + (a-b));
//        System.out.println("Tich a va b bang " + (a*b));
//        System.out.println("Thuong a va b bang " + (a/b));
//        input.close();
//        System.out.println("-------------------------");

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


        // Ve TRAI TIM

//        System.out.println("Chuong trinh nay se in ra hinh trai tim");
//        System.out.print("Nhap chieu cao trai tim cua ban(n > 2): ");
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        Heart heart = new Heart();
//        TamGiac tamgiac = new TamGiac();
//        heart.drawHeart(a);
//        System.out.println("");
//        tamgiac.drawTGCan(a);
//        System.out.println("");
//        tamgiac.drawTGVuongTrai(a);
//        System.out.println("");
//        tamgiac.drawTGVuongPhai(a);
//        input.close();
        // Ve tam giac can


        // BAI TAP BUOI 3
//        Account account = new Account();
//        GiaoDien giaodien = new GiaoDien();
//        Scanner input = new Scanner(System.in);
//        int a;
//        String cccd;
//        do {
//            GiaoDien.clearConsole();
//            String tenPM = "NGAN HANG SO";
//            String version = "@1.0.0";
//
//            account.setmsHV("FX123456");
//
//
//            giaodien.displayHeader(tenPM, account.getmsHV(), version);
//            giaodien.displayBodyB3();
//
//
//            System.out.print("Nhap chuc nang: ");
//            a = input.nextInt();
//
//        } while (a != 0 && a != 1);
//
//        if (a == 1) {
//            int number;
//            do {
//                Random random = new Random();
//                number = random.nextInt(1000 - 100) + 100;
//                System.out.println("Ma xac thuc la " + number);
//                System.out.print("Nhap ma xac thuc:");
//
//                a = input.nextInt();
//            } while (a != number);
//
//
//            CheckCCCD check = new CheckCCCD();
//            System.out.print("Nhap ma can cuoc cong dan:");
//
//            cccd = input.next();
//            while (check.checkCCCD(cccd) != true) {
//                System.out.println("So CCCD khong hop le");
//                System.out.print("Vui long nhap lai hoac 'No' de thoat:");
//                cccd = input.next();
//                if (cccd == "No") {
//                    System.exit(0);
//                }
//            }
//            System.out.println(cccd);
//            giaodien.displayTT();
//
//            do {
//                System.out.print("Nhap chuc nang: ");
//                a = input.nextInt();
//                switch ( a ) {
//                    case  1:
//                        System.out.println("Noi sinh: "+ check.checkNoiSinh(cccd));
//                        break;
//                    case 2:
//                        System.out.println("Gioi tinh: "+ check.checkGTvaNamSinh(cccd));
//                        break;
//                    case 3:
//                        System.out.println("So ngau nhien: "+ check.checkSoNgauNhien(cccd));
//                        break;
//                    case  0:
//                        System.exit(0);
//                        break;
//                    default:
//                        break;
//                }
//            } while (a == 1 || a == 2 || a == 3);
//        } else {
//            System.exit(0);
//        }
//
//
//        input.close();
//



        //BAI TAP BUOI 4
//        Customer customer = new Customer();
//        Account account = new Account();
//        GiaoDien giaodien = new GiaoDien();
//        Scanner input = new Scanner(System.in);
//
//        int a;
//
//        do {
//            GiaoDien.clearConsole();
//            String tenPM = "NGAN HANG DIEN TU";
//            String version = "@1.0.0";
//
//            account.setmsHV("FX123");
//
//
//            giaodien.displayHeaderB4(tenPM, account.getmsHV(), version);
//            giaodien.displayBodyB4();
//
//
//            System.out.print("Nhap chuc nang: ");
//            a = input.nextInt();
//        } while (a != 0 && a != 1 && a != 2 && a != 3 & a != 4 && a != 5);
//        switch (a) {
//            case 1:
//                customer.showCustomer("111222");
//                break;
//            case 2:
//                System.out.print("Nhap so tai khoan(6 ky tu): ");
//                String stk = input.next();
//                while (stk.length() != 6) {
//                    System.out.println("So tai khoan khong hop le hoac da ton tai");
//                    System.out.print("Nhap so tai khoan(6 ky tu): ");
//                    stk = input.next();
//                }
//                customer.setSTK(stk);
//
//                int sodu;
//                do {
//                    System.out.print("Nhap so du(be hon 1 ty): ");
//                    sodu = input.nextInt();
//                } while (sodu < 0 && sodu > 1000000000);
//
//                customer.setsodu(sodu);
//                break;
//            case 4:
//                break;
//            default:
//                break;
//        }
//
//        input.close();

        try
        {
            String sodu = "";
            File file=new File("C:\\ProgramData\\logging\\springtest.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line = "";
            int i = 0;
            while((line=br.readLine())!=null)
            {
                for (int j = 0; j < line.length(); j++) {
                    if (j >= 17 && (line.toString()).charAt(j) != ',' && (line.toString()).charAt(j) != 'đ') {
                        sodu += (line.toString()).charAt(j);
                    }
                }
//                if (i >= 17 && (line.toString()).charAt(i) != ',' && (line.toString()).charAt(i) != 'đ') {
//                    sodu += (line.toString()).charAt(i);
//                }
//                System.out.print("Contents of File in line : ");
//                String str = line.toString();
//                System.out.println((line.toString()).charAt(0));
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed
                i++;
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("Contents of File: ");
            System.out.println(sb.toString());   //returns a string that textually represents the object
            System.out.println(sodu);

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }





}
}
