package example;

import java.io.IOException;
import java.text.DecimalFormat;

public class GiaoDien {
    public String type1 = "LOAN";
    public String type2 = "SAVINGS";
    public String type3 = "TRANSACTION";
    public void displayHeader(String tenPM, String msHV, String version) {
        System.out.println("+---------------------------------+");
        System.out.println("| "+ tenPM +" | " + msHV + version +  "   |");

    }
    public void displayHeaderB4(String tenPM, String msHV, String version) {
        System.out.println("+--------------------------------+");
        System.out.println("| "+ tenPM +" | " + msHV + version +  " |");

    }

    public void displayBodyB3() {
        System.out.println("+---------------------------------+");
        System.out.println("|1. Nhap CCCD                     |");
        System.out.println("|0. Thoat                         |");
        System.out.println("+---------------------------------+");
    }
    public void displayBodyB4() {
        System.out.println("+---------------------------------+");
        System.out.println("|1. Thong tin khach hang          |");
        System.out.println("|2. Them tai khoan ATM            |");
        System.out.println("|3. Them tai khoan tin dung       |");
        System.out.println("|4. Rut tien                      |");
        System.out.println("|5. Lich su giao dich             |");
        System.out.println("|0. Thoat                         |");
        System.out.println("+---------------------------------+");
    }
    public void displayGD (String type, String ngayGD, int STK, int sotiengd, double sodu) {
        int width = 50;
        DecimalFormat formatter = new DecimalFormat("#,###");

        System.out.println("+" + "-".repeat(width) +"+");

        String TYPE = "         BIEN LAI GIAO DICH " + type;
//        String str = String.format("%" + width/2 + "s%s%" + width/2 + "s", "", TYPE, "");
        System.out.println(TYPE);

        System.out.print("NGAY G/D:");
        String str = String.format("%" + 41 + "s", ngayGD);
        System.out.println(str);

        System.out.print("ATM ID:");
        str = String.format("%" + 43 + "s", "DIGITAL-BANK-ATM 2023");
        System.out.println(str);

        System.out.print("SO TK:");
        str = String.format("%" + 44 + "s", STK);
        System.out.println(str);

        System.out.print("SO TIEN:");
        String formatted = formatter.format(sotiengd);
        str = String.format("%" + 41 + "s", formatted);
        System.out.println(str + "đ");

        System.out.print("PHI + VAT:");
//        if (type == "LOAN") {
//            sotiengd = 0-sotiengd;
//        }
        if (type == "SAVINGS") {
            str = String.format("%" + 39 + "s", "0");
            System.out.println(str + "đ");
        } else if (type == "LOAN")  {
            sotiengd = 0 - sotiengd;
            int a = (int)(sotiengd * 0.01);
            formatted = formatter.format(a);
            str = String.format("%" + 39 + "s", formatted);
            System.out.println(str + "đ");
        } else  {
            int a = (int)(sotiengd * 0.01);
            formatted = formatter.format(a);
            str = String.format("%" + 39 + "s", formatted);
            System.out.println(str + "đ");
        }

        System.out.print("SO DU:");
        sodu = (int)sodu;
        formatted = formatter.format(sodu);
        str = String.format("%" + 43 + "s", formatted);
        System.out.println(str + "đ");

        System.out.println("+" + "-".repeat(width) +"+");
    }

    public final static void clearConsole()
    {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public void displayTT() {

        System.out.println("|1. Kiem tra noi sinh");
        System.out.println("|2. Kiem tra tuoi, gioi tinh");
        System.out.println("|3. Kiem tra so ngau nhiem");
        System.out.println("|0. Thoat");

    }

}
