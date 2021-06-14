package se.kth.iv1350.POS.view;

import se.kth.iv1350.POS.model.Observer;
import se.kth.iv1350.POS.model.DTOs.ItemDTO;

public class TotalRevenueView implements Observer {
	@Override
	public void update(ItemDTO item) {
		System.out.println(item.getName()+ "	" +item.price ) ;
	}
		
}
