package ex3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * Map 인터페이스 : (key,객체:value) 쌍인 객체들의 모임
 *   put(key,value) : map에 데이터 추가. 키값이 존재하는 경우는 value 수정
 *   get(key) : value값을 리턴
 *   Set keySet() : map 객체 중 Key 목록 조회.
 *   Collection values() : map 객체 중 value 목록 조회
 *   Set<Map.Entry> entrySet() : Map.Entry 객체로 조회
 *        Map.Entry 객체 : 키,객체(value) 쌍인 객체 1개. 
 *                        key : getKey(), value:getValue()
 *   value remove(key) : key에 해당하는 객체 제거. value 값 리턴                             
 */
public class MapEx1 {
	public static void main(String[] args) {
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<names.length;i++)
			map.put(names[i], nums[i]);
		System.out.println(map);
		System.out.println(map.get("홍길동")); //1234
		System.out.println("map 객체의 요소의 크기 : " + map.size() );
		//keySet() : key 값들만 조회. key들을 Set 객체로 리턴
		Set<String> keyset = map.keySet();
		for(String k : keyset) {
			System.out.println(k + ":" + map.get(k));
		}
		//values() : 값들만 조회. Collection 객체로 리턴
		//           값으로 key를 알수 없음
		Collection<Integer> values = map.values();
		for(Integer i : values) {
			System.out.println(i);
		}
		//entrySet() : (key,객체)쌍인 객체 조회. Set 객체로 리턴
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			//System.out.println(m);
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		Integer tel = map.remove("홍길동"); //홍길동의 객체를 제거.
		System.out.println("제거된 홍길동의 전화번호:"+tel);
		System.out.println("map 객체의 요소 갯수:"+map.size());
		System.out.println(map);
	}
}
