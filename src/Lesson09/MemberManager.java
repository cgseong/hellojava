package Lesson09;

import java.util.Scanner;
import java.util.Vector;

public class MemberManager {
	Scanner scan = new Scanner(System.in);
	Vector<Member> members = new Vector<Member>();
	public void Run(){
		int key = 0;
		while((key = selectMenu())!=0){
			switch(key){
			case 1: addMember(); break;
			case 2: removeMember(); break;
			case 3: searchMember(); break;
			case 4: listMember(); break;
			default: System.out.println("�߸� �����Ͽ����ϴ�."); break;
			}
		}
		System.out.println("�����մϴ�...");
	}
	int selectMenu(){
		System.out.println("1:�߰� 2:���� 3:�˻� 4:��� 0:����");
		int key = scan.nextInt();
		scan.nextLine();	
		return key;
	}
	void addMember(){
		int num = 0;
		String name="";
		System.out.print("�߰��� ȸ�� ��ȣ:");
		num = scan.nextInt();
		scan.nextLine();
		System.out.print("ȸ�� �̸�:");
		name = scan.nextLine();
		Member member =new Member(num,name); 
		members.add(member);
		System.out.println(member.toString()+" �����Ͽ����ϴ�.");		
	}
	void removeMember(){
		int num = 0;		
		System.out.print("������ ȸ�� ��ȣ:");
		num = scan.nextInt();
		scan.nextLine();
		Member member = Find(num);
		if(member == null){
			System.out.println("�������� �ʽ��ϴ�.");
			return;
		}
		members.remove(member);
		System.out.println(member.toString()+" �����Ͽ����ϴ�.");
	}
	void searchMember(){
		int num = 0;		
		System.out.print("�˻��� ȸ�� ��ȣ:");
		num = scan.nextInt();
		scan.nextLine();
		Member member = Find(num);
		if(member == null){
			System.out.println("�������� �ʽ��ϴ�.");
			return;
		}
		System.out.println("�˻� ���>>"+member.toString());
		
	}
	void listMember(){
		System.out.println("��ü ���");
		int cnt = members.size();
		System.out.println("ȸ�� ��:"+cnt);
		for(Member member : members){
			System.out.println(member.toString());
		}
		
	}
	Member Find(int num){
		int cnt = members.size();		
		for(Member member : members){
			if(member.getNum() == num){
				return member;
			}
		}
		return null;
	}
}
