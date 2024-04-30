package chap06;

public class MoveablePoint {
	
	private int xspeed, yspeed;

	public MoveablePoint(int xspeed, int yspeed) {
		super();
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}

	public int getXspeed() {
		return xspeed;
	}

	public void setXspeed(int xspeed) {
		this.xspeed = xspeed;
	}

	public int getYspeed() {
		return yspeed;
	}

	public void setYspeed(int yspeed) {
		this.yspeed = yspeed;
	}

	@Override
	public String toString() {
		return "speed = (" + xspeed + " , " + yspeed + ")";
	}
	
	
}
