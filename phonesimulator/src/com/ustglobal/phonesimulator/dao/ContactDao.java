package com.ustglobal.phonesimulator.dao;

import java.util.List;

import com.ustglobal.phonesimulator.dto.Contactbean;

public interface ContactDao {
	public List<Contactbean> showAllContacts();
	public Contactbean searchContact(String name);
	
	public  void call();
	public void message();
	public void goBack();
	
	public void operateOnContact();
	public int[] insertContact();
	public int deleteContact();
	public int editContact();
	
	

}
