package example;

import org.apache.log4j.Logger;

import java.util.Scanner;
//import org.apache.log4j.PropertyConfigurator;


public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {


        Customer customer = new Customer();
        Account account = new Account();
        GiaoDien giaodien = new GiaoDien();
        Scanner input = new Scanner(System.in);

        int a;


        do {
            do {
                GiaoDien.clearConsole();
                String tenPM = "NGAN HANG DIEN TU";
                String version = "@1.0.0";

                account.setmsHV("FX123");


                giaodien.displayHeaderB4(tenPM, account.getmsHV(), version);
                giaodien.displayBodyB4();


                System.out.print("Nhap chuc nang: ");
                a = input.nextInt();
            } while (a != 0 && a != 1 && a != 2 && a != 3 && a != 4 && a != 5);
            switch (a) {
                case 1:
                    customer.showCustomer("111222");
                    break;
                case 2:
                    System.out.print("Nhap so tai khoan(6 ky tu): ");
                    String stk = input.next();
                    while (stk.length() != 6) {
                        System.out.println("So tai khoan khong hop le hoac da ton tai");
                        System.out.print("Nhap so tai khoan(6 ky tu): ");
                        stk = input.next();
                    }
                    customer.setSTK(stk);

                    int sodu;
                    do {
                        System.out.print("Nhap so du(be hon 1 ty): ");
                        sodu = input.nextInt();
                    } while (sodu < 0 && sodu > 1000000000);

                    customer.setsodu(sodu);
                    break;
                case 3:
                    String str = "111";

                    int num1 = Integer.parseInt(str);
                    System.out.println("parseInt of the String = "
                            + num1);
                    break;
                case 4:
                    boolean rt = false;
                    String str1 = customer.LaySoDu();
                    String ngayGD = "";
                    String _sodu = "";
                    for (int i = 0; i < str1.length(); i++) {
                        if (i <= 18) ngayGD += str1.charAt(i);
                        else _sodu += str1.charAt(i);
                    }
                    int soduTK = Integer.valueOf(_sodu);
                    int sotienrut;
//                System.out.println("So du cua ban la: " + _sodu);
//                System.out.println("Ngay gd la: " + ngayGD);
                    do {
                        System.out.println("Chon kieu giao dich");
                        System.out.println("1. LOAN");
                        System.out.println("2. SAVINGS");
                        System.out.println("3. TRANSACTION");
                        System.out.print("Ban chon ? ");
                        a = input.nextInt();
                    } while ( a != 1 && a != 2 && a != 3);
                    System.out.print("Nhap so tien: ");
                    sotienrut = input.nextInt();
                    while (sotienrut <= 0 || sotienrut > soduTK || (soduTK-sotienrut) < 50000 || sotienrut > 5000000 || (sotienrut % 10000 != 0)) {
                        System.out.print("Nhap lai so tien can rut: ");
                        sotienrut = input.nextInt();
                    }
                    if (a == 1 ) {

                        if (customer.RutTien("LOAN", 123456, sotienrut, soduTK + sotienrut - sotienrut*0.01)) {
                            giaodien.displayGD("LOAN", ngayGD, 123456, sotienrut, soduTK + sotienrut - sotienrut*0.01);
                        }
                    }else if (a == 2) {
                        rt = customer.RutTien("SAVINGS", 123456, sotienrut, soduTK + sotienrut);
                        giaodien.displayGD("SAVINGS", ngayGD, 123456, sotienrut, soduTK + sotienrut);
                    } else if (a == 3) {
                        rt = customer.RutTien("TRANSACTION", 123456, 0-sotienrut, soduTK - sotienrut - sotienrut*0.01);
                        giaodien.displayGD("TRANSACTION", ngayGD, 123456, 0-sotienrut, soduTK - sotienrut - sotienrut*0.01);
                    }
                    break;


                case 5:
                    customer.LichSuGD();
                    break;
                default:

            }
        } while (a != 0);

        input.close();












        // logger.info(formattedString);

//        logger.warn("Sample warn message");
//        logger.error("Sample error message");
//        logger.fatal("Sample fatal message");



        //PropertyConfigurator.configure("log4j.properties");
//        logger.debug("Sample debug message")

//        logger.trace("Trace enter: ");

//        logger.debug("Entering into application: ");
//        System.out.println("Hello world");
//        logger.debug("closing into application");
    }
}