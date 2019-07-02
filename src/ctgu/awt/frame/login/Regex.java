package ctgu.awt.frame.login;

public class Regex {

	// 验证密码
	public static boolean passwordNumber(String phone) {
		String regex1 = "";
		if (phone.length() < 6 || phone.length() > 16) {
			return false;
		}
		regex1 = "[0-9a-zA-Z-=;,./~!@#$%^*()_+}{:?]{6,16}";
		return phone.matches(regex1);
	}

	// 验证用户名
	public static boolean phoneNumber(String password) {
		String regex = "";
		// 用户名
		if (password.length() < 0 && password.length() > 5) {
			return false;
		}
		regex = "[a-zA-Z-=;,./~!@#$%^*()_+}{:?]{0,6}";
		return password.matches(regex);
	}

}
