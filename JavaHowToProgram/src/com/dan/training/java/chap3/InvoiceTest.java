package com.dan.training.java.chap3;

public class InvoiceTest {
	public static void main(String args[]) {
		
		Invoice invoice1 = new Invoice("1234X", "Part Number 1", 5, 3.45);
		Invoice invoice2 = new Invoice("3456Y", "Part Number 2", -2, 5.56);
		Invoice invoice3 = new Invoice("7890Z", "Part Number 3", 5, -4.53);
		
		System.out.printf("\nInvoice 1 - Part Number : %s; Part Description : %s; "
				+ "Quantity : %d; Price Per Item : $%.2f; Invoice Amount : $%.2f", 
				invoice1.getPartNumber(),invoice1.getPartDescription(), 
				invoice1.getQuantity(),invoice1.getPricePerItem(), 
				invoice1.getInvoiceAmount());
		
		System.out.printf("\nInvoice 2 - Part Number : %s; Part Description : %s; "
				+ "Quantity : %d; Price Per Item : $%.2f; Invoice Amount : $%.2f", 
				invoice2.getPartNumber(),invoice2.getPartDescription(), 
				invoice2.getQuantity(),invoice2.getPricePerItem(), 
				invoice2.getInvoiceAmount());
		
		System.out.printf("\nInvoice 3 - Part Number : %s; Part Description : %s; "
				+ "Quantity : %d; Price Per Item : $%.2f; Invoice Amount : $%.2f", 
				invoice3.getPartNumber(),invoice3.getPartDescription(), 
				invoice3.getQuantity(),invoice3.getPricePerItem(), 
				invoice3.getInvoiceAmount());
		
	}
}
