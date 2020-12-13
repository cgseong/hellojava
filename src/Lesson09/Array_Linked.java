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
        System.out.println("���������� �߰��ϱ�");
        System.out.println("ArrayList: " + add(a) + "ms �ҿ�"); // 44ms
        System.out.println("LinkedList: " + add(b) + "ms �ҿ�"); // 21ms
        System.out.println();
        System.out.println("�߰��� �߰��ϱ�");
        System.out.println("ArrayList: " + add2(a) + "ms �ҿ�"); // 272ms
        System.out.println("LinkedList: " + add2(b) + "ms �ҿ�"); // 18ms
        System.out.println();
        System.out.println("�߰��� �����ϱ�");
        System.out.println("ArrayList: " + remove2(a) + "ms �ҿ�"); // 259ms
        System.out.println("LinkedList: " + remove2(b) + "ms �ҿ�"); // 458ms
        System.out.println();
        System.out.println("���������� �����ϱ�");
        System.out.println("ArrayList: " + remove(a) + "ms �ҿ�"); // 5ms
        System.out.println("LinkedList: " + remove(b) + "ms �ҿ�"); // 15ms
        System.out.println();
        add(a);
        add(b);
        System.out.println("���� �ӵ� �׽�Ʈ");
        System.out.println("ArrayList: " + access(a) + "ms �ҿ�"); // 1ms
        System.out.println("LinkedList: " + access(b) + "ms �ҿ�"); // 283ms
	}
}
