package jpu2017.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int player;
	private Order order;
	public UserOrder(int player, Order order){
		
	}
	public int getPlayer() {
		return player;
	}
	public Order getOrder() {
		return order;
	}
	
}
