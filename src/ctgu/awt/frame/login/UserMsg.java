package ctgu.awt.frame.login;

import java.io.*;

public class UserMsg {

	private File file = null;
	private String user = null;
	private String pass = null;
	private String repass = null;

	public UserMsg(String user, String pass) {
		file = new File("./login.txt");
		System.out.println(file);
		try {
			if (file == null) {
				file.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.user = user;
		this.pass = pass;
	}

	// 写入文件
	public synchronized boolean writeUserMsg() {
		boolean[] result = readUserMsg();
		if (result[0] == true) {
			return false;
		} else {
			// TODO Auto-generated method stub
			try {
				OutputStream op = new FileOutputStream(file, true);
				byte[] b = (user + "\t" + pass + "\r\n").getBytes();
				op.write(b);
				op.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			return true;
		}

	}

	// 读取文件处理
	public synchronized boolean[] readUserMsg() {

		try {
			boolean bj_user = false;
			boolean bj_pass = false;
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);

			String str = null;
			String[] s = null;
			while ((str = bf.readLine()) != null) {
				System.out.println(str);
				s = str.split(" ");
				System.out.println(s[0]);
				if (s[0].trim().equals(user)) {
					bj_user = true;
					if (s[1].trim().equals(pass)) {
						System.out.println(s[1]);
						bj_pass = true;
						break;
					}
				}
			}
			fr.close();
			bf.close();
			return new boolean[] { bj_user, bj_pass };

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	// 修改密码处理
	public synchronized boolean[] repassword() {
		try {
			boolean bj_pass = false;
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			String line;
			while (null != (line = raf.readLine())) {
				System.out.println(user);
				if (line.contains(user)) {
					String[] split = line.split(user);
					System.out.println(split[0]);
					System.out.println(split[1]);
					raf.seek(user.length()+1);
					System.out.println(split[1].length());
					for(int i = 0;i < split[1].length();i++){
					raf.writeBytes(" ");
					}
					raf.seek(user.length()+1);
					raf.writeBytes(pass);
					bj_pass = true;
				}
			}
			raf.close();
			return new boolean[] {bj_pass };
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//修改验证
	public synchronized boolean[] readUserPass() {

			try {
				boolean bj_user = false;
				boolean bj_pass = false;
				FileReader fr = new FileReader(file);
				BufferedReader bf = new BufferedReader(fr);

				String str = null;
				String[] s = null;
				while ((str = bf.readLine()) != null) {
					System.out.println(str);
					s = str.split(" ");
					System.out.println(s[0]);
					if (s[0].trim().equals(user)) {
						bj_user = true;
						if (s[1].trim().equals(pass)) {
							System.out.println(s[1]);
							bj_pass = true;
							break;
						}
					}
				}
				fr.close();
				bf.close();
				return new boolean[] { bj_user, bj_pass };

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
		}
}
