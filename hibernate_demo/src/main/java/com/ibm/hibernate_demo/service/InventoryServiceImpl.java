package com.ibm.hibernate_demo.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.hibernate_demo.factory.*;
import com.ibm.hibernate_demo.model.Inventory;


public class InventoryServiceImpl implements InventoryService{
	
	private SessionFactory sessionFactory;
	
	private Session session=null;
	
	{
		sessionFactory=MyHibernateFactory.getSessionFactory();
	}

	@Override
	public Inventory createInventory(Inventory inventory) {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(inventory);
		session.getTransaction().commit();
		return inventory;
	}

	@Override
	public List<Inventory> getAllInventory() {
		session=sessionFactory.openSession();
		TypedQuery<Inventory> query=session.createQuery("FROM Inventory I",Inventory.class);
		List<Inventory> list=query.getResultList();
		return list;
	}

	@Override
	public Inventory getInventoryById(int id) {
		session=sessionFactory.openSession();
		Inventory i=session.find(Inventory.class,id);
		return i;
	}
	
	

}
