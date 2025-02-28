package chap2;
/*
 * 
 */
public class Exam1 {
	public static void main(String[] args) {
		//1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
        char       a='a';   //정상
//	    char       b="a";   //오류. char 작은따옴표.   
//      char       b='a';   //정상
        String     b="a";   //정상
        String     c="a";   
//	    String     d='a'; //오류. String은 큰따옴표
//	    char       d='a'; //정상
	    String     d="a"; //정상
//	    char       e='ab'; //한개의 문자만 가능 
	    String     f="ab"; //정상
//	    char       g = ''; //오류 빈문자 불가.
	    char       g = ' '; //오류 빈문자 불가.
	    String     h = "";  //정상 
//	    byte   var1 = 128; //오류 : 허용 범위 초과 
		short  var2 = 128;  //정상 
//		int    var3 = 128L; //오류 L:long타입의 값.  
		long   var4 = 128L; //정상
//		float  var5 = 1.2;  //오류 1.2값은 기본이 double 형임. 
		float  var5 = 1.2F; //정상 
		double var6 = 1.2;  //정상
	    float var9 = '1';   //정상. 1문자의 ASCII 코드값으로 변환되어 실수형으로 저장 가능
	}
}
