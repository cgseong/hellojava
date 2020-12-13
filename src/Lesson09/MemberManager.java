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
			default: System.out.println("잘못 선택하였습니다."); break;
			}
		}
		System.out.println("종료합니다...");
	}
	int selectMenu(){
		System.out.println("1:추가 2:삭제 3:검색 4:목록 0:종료");
		int key = scan.nextInt();
		scan.nextLine();	
		return key;
	}
	void addMember(){
		int num = 0;
		String name="";
		System.out.print("추가할 회원 번호:");
		num = scan.nextInt();
		scan.nextLine();
		System.out.print("회원 이름:");
		name = scan.nextLine();
		Member member =new Member(num,name); 
		members.add(member);
		System.out.println(member.toString()+" 생성하였습니다.");		
	}
	void removeMember(){
		int num = 0;		
		System.out.print("삭제할 회원 번호:");
		num = scan.nextInt();
		scan.nextLine();
		Member member = Find(num);
		if(member == null){
			System.out.println("존재하지 않습니다.");
			return;
		}
		members.remove(member);
		System.out.println(member.toString()+" 삭제하였습니다.");
	}
	void searchMember(){
		int num = 0;		
		System.out.print("검색할 회원 번호:");
		num = scan.nextInt();
		scan.nextLine();
		Member member = Find(num);
		if(member == null){
			System.out.println("존재하지 않습니다.");
			return;
		}
		System.out.println("검색 결과>>"+member.toString());
		
	}
	void listMember(){
		System.out.println("전체 목록");
		int cnt = members.size();
		System.out.println("회원 수:"+cnt);
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
