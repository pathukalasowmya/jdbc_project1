package com.edubridge.contactapp.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edubridge.contactapp.model.Contact;
import com.edubridge.contactapp.util.DBUtils;


/*
DAO - Data access object
to maintain only data persistance logic(jdbc)


*/
public class ContactDaoImpl implements ContactDao{
	static Connection con = DBUtils.getConnection();
	private String contacts;

	@Override
	public int addContact(Contact contact) {
		String INSERT_QUERY ="INSERT into contact(name,email,mobile)values(?,?,?)";
		int status = 0;
		try { Connection con =DBUtils.getConnection();
			 PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
			 ps.setString(1, contact.getName());
			 ps.setString(2, contact.getEmail());
			 ps.setLong(3,contact.getMobile());
			 
			 status = ps.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;
	}

	@Override
	public List<Contact> viewContacts() {
	String SELECT_QUERY ="SELECT *from Contact";
	List<Contact>contacts = new ArrayList<>();
	try {
		Connection con=DBUtils.getConnection();
		PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Contact contact = new Contact();
			contact .setId(rs.getInt("id"));
			contact .setName(rs.getString("name"));
			contact.setEmail(rs.getString("email"));
			contact.setMobile(rs.getLong("mobile"));
			
			contacts.add(contact);
		}
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
		return contacts;
	}


	@Override
	public Contact findContactByName(String Name) {
		String SELECT_QUERY ="select*from employee where name=?";
		Contact contact = null;
		try{
			 PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
			 ps.setString(1, Name);
			 
			 ResultSet rs = ps.executeQuery();
			 if(rs.next());
			 contact= new Contact();
			 contact.setId(rs.getInt("Id"));
			 contact.setName(rs.getString("name"));
			 contact.setEmail(rs.getString("email"));
			 contact.setMobile(rs.getLong("mobile"));
			 
		 
} catch (SQLException e) {
	e.printStackTrace();	
		 }
		return contact;
	}

	@Override
	public int updateContact(Contact contact) {
		String UPDATE_QUERY ="update contact set name=?,email=?,mobile=? where id =?";
		int status = 0;
  try {
	  Connection con = DBUtils.getConnection();
	  PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
	 ps.setString(1,contact.getName());
	 ps.setString(2,contact.getEmail());
	 ps.setLong(3,contact.getMobile());
	 ps.setInt(4, contact.getId());
	 
	 status = ps.executeUpdate();
  } catch (SQLException e) {
	  e.printStackTrace();
  }
   	
		return status;
	}

	@Override
	public int deleteContact(String Name) {
	String DELETE_QUERY= "delete from contact where name =?";
	
	int status = 0;
	try {
		Connection con = DBUtils.getConnection();
		PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
		ps.setString(1, Name);
		 status = ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
		return status;
	}

	@Override
	public void deleteAllContacts() {
		String DELETE_QUERY = "deleteallcontacts from contacts";
		
		int status = 0;
		try {
			Connection con = DBUtils.getConnection();
			PreparedStatement ps= con.prepareStatement(DELETE_QUERY);
			
	ps.setString(1, contacts);
status = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

    
	}

}
