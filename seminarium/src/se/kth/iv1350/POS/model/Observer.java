package se.kth.iv1350.POS.model;

import se.kth.iv1350.POS.model.DTOs.ItemDTO;

public interface  Observer {

	
	public abstract void update(ItemDTO item);
	
	
	
}
