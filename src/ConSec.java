public class ConSec {
	public String name;
	public String mobile;
	public String eMail;
	public String address;
	public String birth;
	public String group;
	
	public ConSec() {}
	
	public ConSec(String name, String mobile, String eMail, String address, String birth, String group){
		this.name=name;
		this.mobile=mobile;
		this.eMail=eMail;
		this.address=address;
		this.birth=birth;
		this.group=group;
	}
	public void printInfo (String name, String mobile, String eMail, String address, String birth, String group) {
		System.out.println( "이름: "+name+"\n전화번호: "+mobile+"\n이메일: "+eMail+"\n주소: "+address+"\n생일: "+birth+"\n그룹: "+group);
		return;
	}
}	