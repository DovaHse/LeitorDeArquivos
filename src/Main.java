import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        BufferedReader br = new BufferedReader(new FileReader(path));

        File file = new File(path.getParentFile(), "out");
        file.mkdir();

        File clone = new File(file, "summary.csv") ;
        clone.createNewFile();

        String line = new String();

        BufferedWriter es = new BufferedWriter(new FileWriter(clone));
        while ((line = br.readLine()) != null) {
            String[] vect = line.split(",");

            double v = Double.parseDouble(vect[1]);
            int i = Integer.parseInt(vect[2]);
            double r;
            r = v * i;
            es.write(vect[0] + "," + r);
            es.newLine();
        }


        es.close();
        br.close();
        sc.close();
    }
}

