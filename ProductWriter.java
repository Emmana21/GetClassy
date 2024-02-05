import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWriter {

    public static void main(String[] args) {

        ArrayList<Product> item = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\productData.txt");

        boolean done;

        String name;
        String description;
        String ID;
        double cost;

        do {
            ID = SafeInput.getNonZeroLenString(in, "Enter the ID [6 digits] ");
            name = SafeInput.getNonZeroLenString(in, "Enter the Product Name ");
            description = SafeInput.getNonZeroLenString(in, "Enter the Description ");
            cost = SafeInput.getRangedDouble(in, "Enter Price", 0, 9999);

            Product product  = new Product(ID, name, description, cost);
            item.add(product);

            done = SafeInput.getYNConfirm(in, "Are you done?");

        } while (!done);

        try {
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));


            for (Product product : item) {
                String record = product.toCSVDataRecord();
                writer.write(record);
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}