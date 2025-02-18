package day11;

class ThisAlbum{
	String name;
	String singer;
	int musicNum;
	boolean member;
	
	ThisAlbum(){
		this("제목","가수",0);
	}
	
	
		ThisAlbum(String name,String singer,int musicNum) {
		this.name = name;
		this.singer = singer;
		this.musicNum = musicNum;
		this.member = member;
	}
	void albumInfo() {
		System.out.println("앨범 제목 : " + name);
		System.out.println("가수 : " + singer);
		System.out.println("수록곡 개수 : " + musicNum);
		
	}
}

public class _05_Album {

	public static void main(String[] args) {
		/*
		 * 앨범의 제목, 가수, 수록곡 개수를 필드로 만들고
		 * this를 사용한 생성자를 활용해서 객체를 생성한 뒤 정보 출력하기
		 * 앨범 제목 : 
		 * 가수 : 
		 * 수록곡 개수 : **곡
		 **/
		
		ThisAlbum album1 = new ThisAlbum("블루밍","아이유",3);
		album1.albumInfo();
		
		ThisAlbum album3 = new ThisAlbum("희재","성시경",3);
		album3.albumInfo();

	}

}
