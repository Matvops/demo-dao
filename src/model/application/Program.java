package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao seller = DaoFactory.createSellerDao();
		
		System.out.println(seller.findById());
	}

}
