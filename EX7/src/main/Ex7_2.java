package main;

public class Ex7_2 {

	public static void main(String[] args) {
		Point[] p = { 	new Point(100, 100),
						new Point(140,  50),
						new Point(200, 100)
		};
		
		Triangle t = new Triangle(p);
		Circle	 c= new Circle(new Point(150, 150), 50);
		
		t.draw();
		c.draw();

	}

}


class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color = %s]\n", color);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}



class Circle extends Shape{
	Point center;//원의 중심잠
	int r;// 반지름
	
	Circle(){
		this(new Point(0,0), 100);// Circle (point center, int r)호출함
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	void draw() {//월을 그리는 대신에 원의 정보를 출력하도록한다.
		System.out.printf("[center=(%d, %d), r=%d, color=%s]\n", center.x, center.y, r, color);
	}
}



class Triangle extends Shape{
	Point[] p = new Point[3];//3개의 포인트 인스턴스를 담을 배열을 생성한다.
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXY(),p[1].getXY(), p[2].getXY(), color);
	}
}












