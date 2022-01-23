package com.car.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("carParts1")
public class CarPartsInventoryImplements implements CarPartsInventory{

	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java", "root", "cdac");
			stmt = conn.prepareStatement("INSERT INTO tbl_carpart(part_name, car_model, price, quantity) VALUES(?, ?, ?, ?)");
			stmt.setString(1, carPart.getPartName());
			stmt.setString(2, carPart.getCarModel());
			stmt.setDouble(3, carPart.getPrice());
			stmt.setInt(4, carPart.getQuantity());
			stmt.executeUpdate(); //DML
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); //rather we should throw some user defined exception
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}

	

	public List<CarPart> getAvailableParts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

