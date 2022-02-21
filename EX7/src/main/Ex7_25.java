package main; 

interface Parseable{
	//구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParserManager{ 
	public static Parseable getParser(String type) {
		// 리턴타입이 parseable인터페이스이다.
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
		}
	}

}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다 */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다 */
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

public class Ex7_25 {
	public static void main(String args[]) {	
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("documnet2.html");
	}
}