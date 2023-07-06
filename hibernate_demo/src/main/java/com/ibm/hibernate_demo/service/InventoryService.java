package com.ibm.hibernate_demo.service;

import java.util.List;

import com.ibm.hibernate_demo.model.Inventory;

public interface InventoryService {
	
	public Inventory createInventory(Inventory inventory);
	
	public List<Inventory> getAllInventory();
	
	public Inventory getInventoryById(int id);

}
