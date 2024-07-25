package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dep = new Department(1, "BOOKS");
		System.out.println(dep);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Seller sel = null;
		try {
			sel = new Seller(1, "Maria", "maria@gmail.com", new Date(sdf.parse("09/08/2004").getTime()), 2000.00, dep);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sel);
	}

}
