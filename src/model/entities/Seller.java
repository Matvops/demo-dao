package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name, email;
	private Date birthDate;
	private Double baseSalary;
	private Department department;
	
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nID: " + this.getId());
		sb.append("\nNAME: " + this.getName());
		sb.append("\nEMAIL: " + this.getEmail());
		sb.append("\nBIRTH DATE: " + this.getBirthDate());
		sb.append("\nBASE SALARY: " + this.getBaseSalary());
		sb.append("\nDEPARTMENT ID: " + this.getDepartment().getId());
		sb.append("\nDEPARTMENT NAME: " + this.getDepartment().getName());
		return sb.toString();
	}
	
	
}
