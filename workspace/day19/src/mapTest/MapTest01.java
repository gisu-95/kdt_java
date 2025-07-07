package mapTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//1번 : HashMap
public class MapTest01 {
   public static void main(String[] args) {
      ArrayList al = new ArrayList();
      System.out.println(al.toString());
      al.add(1);
      al.add(2);
      al.add(3);
      System.out.println(al); //[1, 2, 3]
      System.out.println(al.get(1)); //인덱스를 알아야 해당하는 값을 출력할 수 있다
      
      HashMap<String, Integer> map = new HashMap<>();
      System.out.println(map.toString());
      map.put("a", 1);
      map.put("b", 2);
      map.put("c", 3);
      System.out.println(map); //{key=value}{a=1, b=2, c=3}
      System.out.println(map.get("b"));//인덱스를 몰라도 key값으로 해당 value를 출력할 수 있다
      map.put("a", 10); // key가 중복되면 기존에 있던값이 교체됨
      System.out.println(map); // {a=10, b=2, c=3}
      map.put("d", 4);
      System.out.println(map);
      System.out.println(map.keySet());//[a, b, c, d] 반환타입 Set
      Set set = map.keySet();
      System.out.println(set);//[a, b, c, d]
      System.out.println(map.values());//[10, 2, 3, 4]반환타입 Collection 인터페이스
      Collection co = map.values();
      System.out.println(co);//[10, 2, 3, 4]
      //put(key, value) 추가
      //get(key) 해당 key의 value값 반환
      //size() 	해당 요소의 길이 반환
      //keySet() 
      //values()
   }
}
