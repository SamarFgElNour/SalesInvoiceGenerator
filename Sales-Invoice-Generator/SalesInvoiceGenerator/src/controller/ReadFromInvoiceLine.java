package controller;

import model.Invoiceline;
import model.Invoiceline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFromInvoiceLine {
    public static final String delimiter = ",";

    public static ArrayList<Invoiceline> invoiceLines = new ArrayList<Invoiceline>();
    static Invoiceline invoiceLine1;

    public static ArrayList<Invoiceline> read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;

            while ((line = br.readLine()) != null) {
                Invoiceline line2 = new Invoiceline();
                tempArr = line.split(delimiter);

                int i = tempArr.length;
                invoiceLine1 = new Invoiceline(Integer.parseInt(tempArr[i - 4]), tempArr[i - 3], Float.valueOf(tempArr[i - 2]), Integer.parseInt(tempArr[i - 1]));
                invoiceLines.add(invoiceLine1);
            }
            br.close();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        return invoiceLines;
    }
}

