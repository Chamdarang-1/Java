package test5;

public class Test04 {

	public static void main(String[] args) {
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx); // 0부터 idx까지
		String ext 	= fileName.substring(idx); //idx부터 마지막까지
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String	strScores= "60, 72, 82, 86, 92"; // 그냥 하면 에러가 뜨는 이유는 , 뒤에 공백이 있어서다. 스플릿할 때 (, ) 이런시긍로 하던가. 
		String[] scores = strScores.split(", "); // strScores 에서 score 배열로 스플릿 
		
		int total = 0;
		
		for(String score : scores) {
			total+=Integer.parseInt(score); // 문자열을 원시타입으로 변환 (score.trim()); 을 쓰던가.
		}
		
		System.out.println("strScores 총점 : " + total);
	}
}
