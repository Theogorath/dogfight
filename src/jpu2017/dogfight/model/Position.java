package jpu2017.dogfight.model;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double y, double maxX, double maxY) {
		super();
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public Position(Position position){
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
}