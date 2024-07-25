package model.entities;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Map<Integer, Seller> sellers = new TreeMap<>();
	
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public Map<Integer, Seller> getSellers() {
		return sellers;
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
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nID: " + this.getId());
		sb.append("\nNAME: " + this.getName());
		return sb.toString();
	}
	
	
	
}
