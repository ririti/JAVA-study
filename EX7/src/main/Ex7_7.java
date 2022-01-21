package main;

public class Ex7_7 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);

	}

}

class Point1 {
	int x, y;

	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point1 {
	int z;

	Point3D (int x, int y, int z) {
		//super(x,y);				//super이 없으면 생성자를 호출하지 않았기 때문에 컴파일 오류가 뜬다.
		//this.z =z;
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + "y :" + y + "z :" +z;
	}
}