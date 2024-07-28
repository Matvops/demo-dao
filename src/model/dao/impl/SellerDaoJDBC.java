package model.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{
	private Connection conn = null;
	private Scanner sc = null;
	
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
		
	}
	@Override
	public void insert(Seller department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Seller seller = null;
		try {
			ps = conn.prepareStatement("SELECT seller.*, department.Name as DepName"
					+ " FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?");
			ps.setInt(1, this.findId());
			rs = ps.executeQuery();
			if(rs.next()) {
				Department dep = new Department(rs.getInt("Id"), rs.getString("DepName"));
				seller = new Seller(rs.getInt("Id"), rs.getString("Name"), rs.getString("Email"), rs.getDate("BirthDate"), rs.getDouble("BaseSalary"), dep);
				return seller;
			}
			return null;	
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	private Integer findId() {
		sc = new Scanner(System.in);
		System.out.println("DIGITE O ID: ");
		Integer id = sc.nextInt();
		sc.close();
		return id;
	}
}
