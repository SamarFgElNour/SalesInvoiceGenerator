package model;

import java.util.ArrayList;

public class Invoiceheader {

    private int invoiceNum;
    private String invoiceDate, invoiceDate1;
    private String customerName;
    ArrayList<Invoiceline> InvoiceLines = new ArrayList<Invoiceline>();


    public Invoiceheader() {
    }

    public ArrayList<Invoiceline> getInvoiceLines() {
        for (Invoiceline invoiceLine11 : InvoiceLines) {
            invoiceLine11.toString();
        }
        return InvoiceLines;
    }

    public void setInvoiceLines(ArrayList<Invoiceline> invoiceLines) {
        InvoiceLines = invoiceLines;
    }

    public Invoiceheader(int invoiceNum, String invoiceDate, String customerName, ArrayList<Invoiceline> invoiceLines) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
        InvoiceLines = invoiceLines;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {

        return invoiceDate = invoiceDate.replace("-", "/");
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void print() {
        System.out.println("Invoice" + getInvoiceNum() + "Num");
        System.out.println("{");
        System.out.println("Invoice" + getInvoiceNum() + "Date (" + getInvoiceDate().toString() + ")," + getCustomerName());
        for (Invoiceline line : InvoiceLines) {
            System.out.println(line);
        }
        System.out.println("}");

    }
}


