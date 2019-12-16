package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {
		//List list1 = new ArrayList();
		
		List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		
		System.out.println(list.size());
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동");
		list.add("최길동");
		System.out.println(list.size());
		
		
		System.out.println("----------------for 순회-----------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("김길동 ?" +list.contains("김길동"));
		
		
		System.out.println("------------Iterator 기반 순회------------");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data.charAt(0)+"**");
			System.out.println(data);
		}
		System.out.println("------------Iterator 기반 삭제------------");
		String rname = JOptionPane.showInputDialog("삭제할 이름을 입력하세요");
		it = list.iterator();
		while (it.hasNext()) {
			String data = it.next();
//			if(rname.contentEquals(data)) {
//			it.remove();
//			}
		}
		System.out.println(list);
		list.add(2, "~~~~"); //2번째 인덱스에 ~~~~ 표시
		System.out.println(list);
		
		
		
	}

}
