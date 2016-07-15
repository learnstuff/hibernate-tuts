package com.msrm.orm.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.msrm.orm.hibernate.dao.PassengerDAO;
import com.msrm.orm.hibernate.dos.PassengerDO;

public class PassengerDAOImpl implements PassengerDAO {

	private static final String driverClass = "com.mysql.jdbc.Driver";
	private static final String username = "root";
	private static final String password = "root";
	private static final String DB = "trs";
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/" + DB;

	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(jdbcUrl, username, password);
		return con;
	}

	public void insert(PassengerDO passengerDO) {
		try (Connection con = getConnection(); Statement st = con.createStatement();) {
			String sql = String.format("INSERT INTO passenger (id, name, mail, dob) VALUES(%d ,'%s','%s','%s')",
					passengerDO.getId(), passengerDO.getName(), passengerDO.getMail(), passengerDO.getDob());
			st.executeUpdate(sql);
			System.out.println(sql);
			System.out.println("Jdbc - saved");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void update(PassengerDO passengerDO) {

	}

	public void delete(int id) {

	}

	public PassengerDO fetchBy(int id) {
		return null;
	}

	public List<PassengerDO> fetch() {
		return null;
	}

}
