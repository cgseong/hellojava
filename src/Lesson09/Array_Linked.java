package Lesson09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_Linked {
	static long add(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) list.add(i + "");
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long add2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long remove(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size()-1; i >= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long remove2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList(200000);
        LinkedList b = new LinkedList();
        System.out.println("순차적으로 추가하기");
        System.out.println("ArrayList: " + add(a) + "ms 소요"); // 44ms
        System.out.println("LinkedList: " + add(b) + "ms 소요"); // 21ms
        System.out.println();
        System.out.println("중간에 추가하기");
        System.out.println("ArrayList: " + add2(a) + "ms 소요"); // 272ms
        System.out.println("LinkedList: " + add2(b) + "ms 소요"); // 18ms
        System.out.println();
        System.out.println("중간에 제거하기");
        System.out.println("ArrayList: " + remove2(a) + "ms 소요"); // 259ms
        System.out.println("LinkedList: " + remove2(b) + "ms 소요"); // 458ms
        System.out.println();
        System.out.println("순차적으로 삭제하기");
        System.out.println("ArrayList: " + remove(a) + "ms 소요"); // 5ms
        System.out.println("LinkedList: " + remove(b) + "ms 소요"); // 15ms
        System.out.println();
        add(a);
        add(b);
        System.out.println("접근 속도 테스트");
        System.out.println("ArrayList: " + access(a) + "ms 소요"); // 1ms
        System.out.println("LinkedList: " + access(b) + "ms 소요"); // 283ms
	}
}
