package example;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class DigitalBank {
    private static Logger logger = Logger.getLogger(Main.class);
    public Customer getCustomerById(String id) {
        Customer _customer = new Customer();
        if  (id == "123456") {
            _customer.setID("123456");
            _customer.setNAME("HIEU");
        }
        if (id == "111222") {
            _customer.setID("111222");
            _customer.setNAME("HDBK");
        }

        return _customer;
    }
    //  Customer customer = activeBank.
    public boolean WriteFile(String type, int stk, int sotiengd, double sodu) {

        System.setProperty("filename", "log1");
        //DOMConfigurator.configure("D:\\Workspace\\JavaProject\\LoggerJava\\src\\src\\main\\resources\\log4j.properties");
//        String log4jConfPath = "D:\\Workspace\\JavaProject\\LoggerJava\\src\\main\\resources\\log4j.properties";
        String log4jConfPath = "D:\\Workspace\\JavaProject\\FirstProject\\src\\main\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

//        type = "TRANSACTION";
//        stk = 123456;
//        sotiengd = -10000;
//        sodu = 900000000;
        int width = 12;

        //sodu += sotiengd;
        DecimalFormat formatter = new DecimalFormat("#,###");
        String formattedSoDuGD = formatter.format(sotiengd);
        String formattedSoDu = formatter.format((int)sodu);
        //System.out.println(formattedNumber);

        String formattedString = String.format("%" + 6 + "s", stk);
        formattedString += " | ";
        formattedString += String.format("%" + 12 + "s", type); // type
        formattedString += " | ";
        formattedString += String.format("%" + 12 + "s", formattedSoDuGD);
        formattedString += "đ | ";
        formattedString += String.format("%" + 12 + "s", formattedSoDu);
        formattedString += "đ";
        //System.out.println(formattedString);

        logger.info(formattedString);
        return true;
    }

    public void ReadFile() {
        String sodu = "";
        try
        {

            File file=new File("C:\\ProgramData\\logging\\springtest.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line = "";
            // int i = 0;
            while((line=br.readLine()) != null)
            {
//                for (int j = 0; j < line.length(); j++) {
//                    if (j >= 62 && (line.toString()).charAt(j) != ',' && (line.toString()).charAt(j) != 'đ') {
//                        sodu += (line.toString()).charAt(j);
//                    }
//                }
//                if (i >= 17 && (line.toString()).charAt(i) != ',' && (line.toString()).charAt(i) != 'đ') {
//                    sodu += (line.toString()).charAt(i);
//                }
//                System.out.print("Contents of File in line : ");
//                String str = line.toString();
//                System.out.println((line.toString()).charAt(0));
                sb.append(line);      //appends line to string buffer
                sb.append("\n");     //line feed

            }
            fr.close();    //closes the stream and release the resources
            //System.out.println("Contents of File: ");
            //System.out.println(i);   //returns a string that textually represents the object
            //System.out.println(sodu);
            System.out.println(sb.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    public String LaySoDu() {

        String sodu = "";
        String ngayGD = "";
        try
        {

            File file=new File("C:\\ProgramData\\logging\\springtest.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line = "";

            // dem so dong
            int i = 0;
            while((line=br.readLine())!=null)
            {
                i++;
            }
            // lay so du
            FileReader fr1=new FileReader(file);   //reads the file
            BufferedReader br1=new BufferedReader(fr1);
            int k = 0;
            while((line=br1.readLine())!=null)
            {
                if (k == i-1) {
                    for (int j = 0; j < line.length(); j++) {
                        if (j <= 18) {
                            ngayGD += (line.toString()).charAt(j);
                        }
                        if (j >= 62 && (line.toString()).charAt(j) != ',' && (line.toString()).charAt(j) != 'đ' && (line.toString()).charAt(j) != ' ') {
                            sodu += (line.toString()).charAt(j);
                        }
                    }

                }
                k++;
//
//                System.out.print("Contents of File in line : ");
//                String str = line.toString();
//                System.out.println((line.toString()).charAt(0));
//                sb.append(line);      //appends line to string buffer
//                sb.append("\n");     //line feed

            }
            fr.close();    //closes the stream and release the resources
            fr1.close();
//            System.out.println("Contents of File: ");
//            System.out.println(sb.toString());   //returns a string that textually represents the object
//            System.out.println(sodu);



        }
        catch(IOException e)
        {

            e.printStackTrace();

        }
        // soduINT = Integer.valueOf(sodu);
        return  ngayGD + sodu;
    }
}
