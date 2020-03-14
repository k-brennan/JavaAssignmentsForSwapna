package com.nttdata.assignment2;

public class RushOrder extends Order{

	protected int deliveryDay;
	
	public int getTotalCost() {
		if(super.getTotalCost()!=0) {
			if(deliveryDay<2) {
				totalCost+=25;
			}else if(deliveryDay<3) {
				totalCost+=15;
			}else if(deliveryDay<4) {
				totalCost+=10;
			}else {
				
			}return totalCost;
		}else {
			totalCost=0;
		}return totalCost;
		
	}
	
}
