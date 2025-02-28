package test2;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * 
 * [결과]
   90   80   70  240
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385 1175
 */
public class Test3_A {
	public static void main(String[] args) {
		int[][] score = { 
				{ 90, 80, 70 }, { 95, 85, 75 }, 
				{ 70, 80, 75 }, { 75, 70, 85 }, 
				{ 70, 75, 80 } 
		};
		//score.length + 1 : score 배열의 행의 값 + 1
		//score[0].length + 1 : score 배열의 열의 값 + 1 
		//result 배열의 크기 : score배열의 행,열 1씩 더큰 배열
		int[][] result = new int[score.length + 1][score[0].length + 1];
		//result 값에 저장
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				//score 배열의 값을 result 배열에 저장
				result[i][j] = score[i][j];
				//score[i].length : result 배열에 각 행의 마지막 열
				//score 한행의 합을 result 각행의 마지막열에 합 저장
				result[i][score[i].length] += score[i][j]; //행의 합
				//result[score.length] : 마지막 행
				result[score.length][j] += score[i][j]; //열의 합
				//result[score.length][score[i].length] : 가장 마지막 셀
				//전체 점수의 합
				result[score.length][score[i].length] += score[i][j];
			}
		}
		//result 배열 출력
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}

	}
}
