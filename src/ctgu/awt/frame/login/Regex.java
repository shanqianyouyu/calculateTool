package ctgu.awt.frame.login;

public class Regex {
	
   //验证密码
	public static boolean passwordNumber(String phone) {
		String regex1 = "";
		if(phone.length()<0 || phone.length()>8){
			return false;
		}
		regex1 = "[0-9a-zA-Z-=;,./~!@#$%^*()_+}{:?]{0,6}";
		return phone.matches(regex1);
	}
	//验证用户名
	public static boolean phoneNumber(String password) {
		String regex = "";
		//用户名
		if(password.length()<0 && password.length()>5) {
			return false;
		}
		regex = "[a-zA-Z-=;,./~!@#$%^*()_+}{:?]{0,6}";
		return password.matches(regex);
	}

	public static void main(String[] args) {
//		System.out.println(phoneNumber("14792066465"));
//		System.out.println(passwordNumber("11"));
	}
}
