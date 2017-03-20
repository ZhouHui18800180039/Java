public class points {
	
	public double x;
	public double y;
	
	public points(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(points p){
		double _x = Math.abs(this.x - p.x);
		double _y = Math.abs(this.y - p.y);
		return Math.sqrt(_x*_x+_y*_y);
	}
	public static void main(String[] args) {
		points p1 = new points(5, 5);
		points p2 = new points(10, 10);
		System.out.println(p2.getDistance(p1));}
}