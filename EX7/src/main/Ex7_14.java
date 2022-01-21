package main;

final class Ex7_14 {
	private static Ex7_14 s = new Ex7_14();
	
	private Ex7_14(){
		
	}
	
	public static Ex7_14 getInstance(){
		if(s==null)
			s = new Ex7_14();
		return s;
	}
}

class Ex7_14Test{
	public static void main(String args[]) {
	//	Ex7_14 s = new Ex7_14;
		Ex7_14 s = Ex7_14.getInstance();
		
	}
}