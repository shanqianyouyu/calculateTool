package ctgu.awt.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class Filewriter extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	static {
//		try {
//			// 设置边框样式为强立体半透明
//			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
//			// 引入apple的皮肤包
//			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//		} catch (Exception e) {
//			// TODO exception
//			System.out.println("皮肤软件抛出异常");
//		}
//	}

	public static void fileChooser() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("doc", "jpg", "gif");
		// 设置文件类型
		chooser.setFileFilter(filter);
		// 打开选择器面板
		int returnVal = chooser.showSaveDialog(new JPanel());
		// 保存文件从这里入手，输出的是文件名

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("你打开的文件夹是: " + chooser.getSelectedFile().getPath());
			String path = chooser.getSelectedFile().getPath();
			try {
				File f = new File(path + ".doc");
				InputStream is = new FileInputStream(new File("./src/ctgu/awt/frame/测试文件.doc"));
				System.out.println(f.getAbsolutePath());
				f.createNewFile();
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "GBK"));
				WordExtractor ex = new WordExtractor(is);
				String text2003 = ex.getText();
				out.write(text2003);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void printToTxt(String s) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "doc");
		// 设置文件类型
		chooser.setFileFilter(filter);
		// 打开选择器面板
		int returnVal = chooser.showSaveDialog(new JPanel());
		// 输出流
		FileWriter fw = null;
		// 保存文件从这里入手，输出的是文件名
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			// 选择的路径
			String path = chooser.getSelectedFile().getPath();
			try {
				File f = new File(path + ".txt");
				fw = new FileWriter(f, false);
				f.createNewFile();
				fw.write(s);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fw != null) {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		fileChooser();
	}
}
