import java.io.IOException;
public class GiaoDien {

    public void displayHeader(String tenPM, String msHV, String version) {
        System.out.println("+---------------------------------+");
        System.out.println("| "+ tenPM +" | " + msHV + version +  "   |");

    }

    public void displayBody() {
        System.out.println("+---------------------------------+");
        System.out.println("|1. Nhap CCCD                     |");
        System.out.println("|0. Thoat                         |");
        System.out.println("+---------------------------------+");
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
