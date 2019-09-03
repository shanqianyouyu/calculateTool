package ctgu.awt.controller;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ctgu.awt.frame.homepage.item.derrickCal.Square;

/**
 * @author 陈煜昆
 * 
 */
public class XMLData {
 
	
	private double A;
	
	private double HM1;
	private double HM2;
	private double WM1;
	private double HD;
	private double PL;
	private double RL;

	private double DL;
	private double GXJ;
	private double DGXJ;
	private double SDZ;
	private double PLQ;
	private double GL;
	private double WL;
	private double YX;
	private double YXX;
	private double SDc;

	private double WG;
	private double AL;
	private double AJ;
	private double ZG;

	private double N1;
	private double AX;
	private double ALA;
	private double AF;

	private double aWD;
	private double SAn;
	private double FY;

	private double Mj;
	private double MDk;
	private double PXj;

	private double WN;
	private double AFZ;
	private double AFQ;
	private double AKK;
	private double WG2;
	private double HV;

	private double ADb;
	private double ADn;
	private double BSg;
	private double AZz;
	private double ABt;

	private double As;
	private double BL;
	private double DBc;
	private double DBx;
	private double BBc;
	private double BBc1;
	private double BBx;

	private double QG;
	private double FZ1;
	private double FQ1;
	private double FQ2;
	private double FD1;
	private double FL1;
	private double DL1;
	private double FZ2;
	private double FC1;
	private double FZ3;
	private double FM1;
	private double FAM1;
	private double FAY;
	private double FAZ;
	
	//分类参数
	private double FF1;

	public XMLData(double HM1, double HM2, double WM1, double HD, double PL, double RL, double DL, double GXJ,
			double DGXJ, double SDZ, double PLQ, double GL, double WL, double YX,double YXX,double SDc, double WG, double AL, double AJ,
			double ZG, double N1, double AX, double ALA, double AF, double aWD, double SAn, double FY, double Mj,
			double MDk, double PXj, double WN, double AFZ, double AFQ, double AKK, double WG2, double HV, double ADb,
			double ADn, double BSg, double AZz, double ABt,double As,double BL, double DBc, double DBx, double BBc, double BBc1, double BBx, double QG, double FZ1, double FQ1, double FQ2, double FL1, double DL1, double FZ2, double FC1,double FZ3,double FM1,double FAM1,double FAY,double FAZ) {
		super();
		this.HM1 = HM1;
		this.HM2 = HM2;
		this.WM1 = WM1;
		this.HD = HD;
		this.PL = PL;
		this.RL = RL;
		this.DL = DL;
		this.GXJ = GXJ;
		this.DGXJ = DGXJ;
		this.SDZ = SDZ;
		this.PLQ = PLQ;
		this.GL = GL;
		this.WL = WL;
		this.YX = YX;
		this.YXX = YXX;
		this.SDc = SDc;
		this.WG = WG;
		this.AL = AL;
		this.AJ = AJ;
		this.ZG = ZG;
		this.N1 = N1;
		this.AX = AX;
		this.ALA = ALA;
		this.AF = AF;
		this.aWD = aWD;
		this.SAn = SAn;
		this.FY = FY;
		this.Mj = Mj;
		this.MDk = MDk;
		this.PXj = PXj;
		this.WN = WN;
		this.AFZ = AFZ;
		this.AFQ = AFQ;
		this.AKK = AKK;
		this.WG2 = WG2;
		this.HV = HV;
		this.ADb = ADb;
		this.ADn = ADn;
		this.BSg = BSg;
		this.AZz = AZz;
		this.ABt = ABt;
		this.As = As;
		this.BL = BL;
		this.DBc = DBc;
		this.DBx = DBx;
		this.BBc = BBc;
		this.BBc1 = BBc1;
		this.BBx = BBx;
		this.QG = QG;
		this.FZ1 = FZ1;
		this.FQ1 = FQ1;
		this.FQ2 = FQ2;
		this.FL1 = FL1;
		this.DL1 = DL1;
		this.FZ2 = FZ2;
		this.FC1 = FC1;
		this.FZ3 = FZ3;
		this.FM1 = FM1;
		this.FAM1 = FAM1;
		this.FAY = FAY;
		this.FAZ= FAZ;

		
	}
	
	
	static File file = new File("D:/javaWeb/workspaces/calculator_gui/src/Square.xml");// Persons.xml文件绝对路径
 
	public static void main(String[] args) throws Exception {
////		add();// 添加数据
////		delete();// 删除数据
////		update();// 修改数据
		select();// 查找数据
	}
 
	public Result add() throws Exception {
		// ①获得解析器DocumentBuilder的工厂实例DocumentBuilderFactory 然后拿到DocumentBuilder对象
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// ②获取一个与磁盘文件关联的非空Document对象
		Document doc =  newDocumentBuilder.parse(file);
		// ③通过文档对象获得该文档对象的根节点
		Element root = doc.getDocumentElement();
 
		// 创建一个新的person节点
		Element Square = doc.createElement("Square");
		// 创建person的几个子节点
		Element EHM1 = doc.createElement("EHM1");
		Element EHM2 = doc.createElement("EHM2");
		Element EHD = doc.createElement("EHD");
		Element EPL = doc.createElement("EPL");
		Element ERL = doc.createElement("ERL");
		Element EDL = doc.createElement("EDL");
		Element EGXJ= doc.createElement("EGXJ");
		Element EDGXJ = doc.createElement("EDGXJ");
		Element ESDZ = doc.createElement("ESDZ");
		Element EPLQ = doc.createElement("EPLQ");
		Element EGL = doc.createElement("EGL");
		Element EWL = doc.createElement("EWL");
		Element EYX = doc.createElement("EYX");
		Element EYXX = doc.createElement("EYXX");
		Element ESDc = doc.createElement("ESDc");
		Element EWG = doc.createElement("EWG");
		Element EAJ = doc.createElement("EAJ");
		Element EZG = doc.createElement("EZG");
		Element EN1 = doc.createElement("EN1");
		Element EAX = doc.createElement("EAX");
		Element EALA = doc.createElement("EALA");
		Element EAF = doc.createElement("EAF");
		Element EaWD = doc.createElement("EaWD");
		Element ESAn = doc.createElement("ESAn");
		Element EFY = doc.createElement("EFY");
		Element EMj = doc.createElement("EMj");
		Element EMDk = doc.createElement("EMDk");
		Element EPXj = doc.createElement("EPXj");
		Element EWN = doc.createElement("EWN");
		Element EAFZ = doc.createElement("EAFZ");
		Element EAFQ = doc.createElement("EAFQ");
		Element EAKK = doc.createElement("EAKK");
		Element EWG2 = doc.createElement("EWG2");
		Element EHV = doc.createElement("EHV");
		Element EADb = doc.createElement("EADb");
		Element EADn = doc.createElement("EADn");
		Element EBSg = doc.createElement("EBSg");
		Element EAZz = doc.createElement("EAZz");
		Element EABt = doc.createElement("EABt");
		Element EAs = doc.createElement("EAs");
		Element EBL = doc.createElement("EBL");
		Element EDBc = doc.createElement("EDBc");
		Element EDBx = doc.createElement("EDBx");
		Element EBBc = doc.createElement("EBBc");
		Element EBBc1 = doc.createElement("EBBc1");
		Element EQG = doc.createElement("EQG");
		Element EFZ1 = doc.createElement("EFZ1");
		Element EFQ1 = doc.createElement("EFQ1");
		Element EFQ2 = doc.createElement("EFQ2");
		Element EDL1 = doc.createElement("EDL1");
		Element EFZ2 = doc.createElement("EFZ2");
		Element EFC1 = doc.createElement("EFC1");
		Element EFZ3 = doc.createElement("EFZ3");
		Element EFM1 = doc.createElement("EFM1");
		Element EFAM1 = doc.createElement("EFAM1");
		Element EFAY = doc.createElement("EFAY");
		Element EFAZ = doc.createElement("EFAZ");
		// 给子节点设置值
		EHM1.setTextContent(String.valueOf(HM1));
		EHM2.setTextContent(String.valueOf(HM2));
		EHD.setTextContent(String.valueOf(HD));
		EPL.setTextContent(String.valueOf(PL));
		ERL.setTextContent(String.valueOf(RL));
		EDL.setTextContent(String.valueOf(DL));
		EGXJ.setTextContent(String.valueOf(GXJ));
		EDGXJ.setTextContent(String.valueOf(DGXJ));
		ESDZ.setTextContent(String.valueOf(SDZ));
		EPLQ.setTextContent(String.valueOf(PLQ));
		EGL.setTextContent(String.valueOf(GL));
		EWL.setTextContent(String.valueOf(WL));
		EYX.setTextContent(String.valueOf(YX));
		EYXX.setTextContent(String.valueOf(YXX));
		ESDc.setTextContent(String.valueOf(SDc));
		EWG.setTextContent(String.valueOf(WG));
		EAJ.setTextContent(String.valueOf(AJ));
		EZG.setTextContent(String.valueOf(ZG));
		EN1.setTextContent(String.valueOf(N1));
		EAX.setTextContent(String.valueOf(AX));
		EALA.setTextContent(String.valueOf(ALA));
		EAF.setTextContent(String.valueOf(AF));
		EaWD.setTextContent(String.valueOf(aWD));
		ESAn.setTextContent(String.valueOf(SAn));
		EFY.setTextContent(String.valueOf(FY));
		EMj.setTextContent(String.valueOf(Mj));
		EMDk.setTextContent(String.valueOf(MDk));
		EPXj.setTextContent(String.valueOf(PXj));
		EWN.setTextContent(String.valueOf(WN));
		EAFZ.setTextContent(String.valueOf(AFZ));
		EAFQ.setTextContent(String.valueOf(AFQ));
		EAKK.setTextContent(String.valueOf(AKK));
		EWG2.setTextContent(String.valueOf(WG2));
		EHV.setTextContent(String.valueOf(HV));
		EADb.setTextContent(String.valueOf(ADb));
		EADn.setTextContent(String.valueOf(ADn));
		EBSg.setTextContent(String.valueOf(BSg));
		EAZz.setTextContent(String.valueOf(AZz));
		EABt.setTextContent(String.valueOf(ABt));
		EAs.setTextContent(String.valueOf(As));
		EBL.setTextContent(String.format("%.2f", BL));
		EDBc.setTextContent(String.format("%.2f", DBc));
		EDBx.setTextContent(String.format("%.2f", DBx));
		EBBc.setTextContent(String.format("%.2f", BBc));
		EBBc1.setTextContent(String.format("%.2f", BBc1));
		EQG.setTextContent(String.format("%.2f", QG));
		EFZ1.setTextContent(String.format("%.2f", FZ1));
		EFQ1.setTextContent(String.format("%.2f", FQ1));
		EFQ2.setTextContent(String.format("%.2f", FQ2));
		EDL1.setTextContent(String.format("%.2f", DL1));
		EFZ2.setTextContent(String.format("%.2f", FZ2));
		EFC1.setTextContent(String.format("%.2f", FC1));
		EFZ3.setTextContent(String.format("%.2f", FZ3));
		EFM1.setTextContent(String.format("%.2f", FM1));
		EFAM1.setTextContent(String.format("%.2f", FAM1));
		EFAY.setTextContent(String.format("%.2f", FAY));
		EFAZ.setTextContent(String.format("%.2f", FAZ));
		// 将子节点追加到person
		Square.appendChild(EHM1);
		Square.appendChild(EHM2);
		Square.appendChild(EHD);
		Square.appendChild(EPL);
		Square.appendChild(ERL);
		Square.appendChild(EDL);
		Square.appendChild(EGXJ);
		Square.appendChild(EDGXJ);
		Square.appendChild(ESDZ);
		Square.appendChild(EPLQ);
		Square.appendChild(EGL);
		Square.appendChild(EWL);
		Square.appendChild(EYX);
		Square.appendChild(EYXX);
		Square.appendChild(ESDc);
		Square.appendChild(EWG);
		Square.appendChild(EAJ);
		Square.appendChild(EZG);
		Square.appendChild(EN1);
		Square.appendChild(EAX);
		Square.appendChild(EALA);
		Square.appendChild(EAF);
		Square.appendChild(EaWD);
		Square.appendChild(ESAn);
		Square.appendChild(EFY);
		Square.appendChild(EMj);
		Square.appendChild(EMDk);
		Square.appendChild(EPXj);
		Square.appendChild(EWN);
		Square.appendChild(EAFZ);
		Square.appendChild(EAFQ);
		Square.appendChild(EAKK);
		Square.appendChild(EWG2);
		Square.appendChild(EHV);
		Square.appendChild(EADb);
		Square.appendChild(EADn);
		Square.appendChild(EBSg);
		Square.appendChild(EAZz);
		Square.appendChild(EABt);
		Square.appendChild(EAs);
		Square.appendChild(EBL);
		Square.appendChild(EDBc);
		Square.appendChild(EDBx);
		Square.appendChild(EBBc);
		Square.appendChild(EBBc1);
		Square.appendChild(EQG);
		Square.appendChild(EFZ1);
		Square.appendChild(EFQ1);
		Square.appendChild(EFQ2);
		Square.appendChild(EDL1);
		Square.appendChild(EFZ2);
		Square.appendChild(EFC1);
		Square.appendChild(EFZ3);
		Square.appendChild(EFM1);
		Square.appendChild(EFAM1);
		Square.appendChild(EFAY);
		Square.appendChild(EFAZ);
		// 给person的id设置值
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
		Square.setAttribute("date", formatter.format(date));
		// 将person追加到根节点
		root.appendChild(Square);
 
		// 注意：XML文件是被加载到内存中 修改也是在内存中 ==》因此需要将内存中的数据同步到磁盘中
		/*
		 * static TransformerFactory newInstance():获取 TransformerFactory 的新实例。 abstract
		 * Transformer newTransformer():创建执行从 Source 到 Result 的复制的新 Transformer。
		 * abstract void transform(Source xmlSource, Result outputTarget):将 XML Source
		 * 转换为 Result。
		 */
		// 获取一个转换器对象transformer
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		Source source = new DOMSource(doc);// 获取内存里面的数据（doc ==> document对象）
		Result result = new StreamResult(file);// 获取磁盘上的文件
		transformer.transform(source, result);// 将 XML==>Source 转换为 Result
		return result;
	}
 
	public static void delete() throws Exception {
		// ①获得解析器DocumentBuilder的工厂实例DocumentBuilderFactory 然后拿到DocumentBuilder对象
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// ②获取一个与磁盘文件关联的非空Document对象
		Document doc = newDocumentBuilder.parse(file);
		// ③通过文档对象获得该文档对象的根节点
		Element root = doc.getDocumentElement();
 
		// 查找指定节点
		// 通过根节点获得子节点
		NodeList personList = root.getElementsByTagName("person");
		// 这里获取第2个节点
		Node item = personList.item(1);
		// 移出节点
		root.removeChild(item);
 
		// 注意：XML文件是被加载到内存中 修改也是在内存中 ==》因此需要将内存中的数据同步到磁盘中
		/*
		 * static TransformerFactory newInstance():获取 TransformerFactory 的新实例。 abstract
		 * Transformer newTransformer():创建执行从 Source 到 Result 的复制的新 Transformer。
		 * abstract void transform(Source xmlSource, Result outputTarget):将 XML Source
		 * 转换为 Result。
		 */
		// 获取一个转换器对象transformer
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		Source source = new DOMSource(doc);// 获取内存里面的数据（doc ==> document对象）
		Result result = new StreamResult(file);// 获取磁盘上的文件
		transformer.transform(source, result);// 将 XML==>Source 转换为 Result
	}
 
	public static void update() throws Exception {
		// ①获得解析器DocumentBuilder的工厂实例DocumentBuilderFactory 然后拿到DocumentBuilder对象
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// ②获取一个与磁盘文件关联的非空Document对象
		Document doc = newDocumentBuilder.parse(file);
		// ③通过文档对象获得该文档对象的根节点
		Element root = doc.getDocumentElement();
 
		// 查找指定节点
		// 通过根节点获得子节点
		NodeList personList = root.getElementsByTagName("person");
		// 这里获取第1个节点
		Node item = personList.item(0);
		// System.out.println(item.getTextContent());
		Element personElement = (Element) item;
		// 获取personElement下面的子节点
		NodeList nameList = personElement.getElementsByTagName("name");
		// System.out.println(nameList.item(0).getTextContent());
		// 修改
		nameList.item(0).setTextContent("这里是我修改的名字");
 
		// 注意：XML文件是被加载到内存中 修改也是在内存中 ==》因此需要将内存中的数据同步到磁盘中
		/*
		 * static TransformerFactory newInstance():获取 TransformerFactory 的新实例。 abstract
		 * Transformer newTransformer():创建执行从 Source 到 Result 的复制的新 Transformer。
		 * abstract void transform(Source xmlSource, Result outputTarget):将 XML Source
		 * 转换为 Result。
		 */
		// 获取一个转换器对象transformer
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		Source source = new DOMSource(doc);// 获取内存里面的数据（doc ==> document对象）
		Result result = new StreamResult(file);// 获取磁盘上的文件
		transformer.transform(source, result);// 将 XML==>Source 转换为 Result
	}
 
	public static void select() throws Exception {
		// ①获得解析器DocumentBuilder的工厂实例DocumentBuilderFactory 然后拿到DocumentBuilder对象
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// ②获取一个与磁盘文件关联的非空Document对象
		Document doc = newDocumentBuilder.parse(file);
		// ③通过文档对象获得该文档对象的根节点
		Element root = doc.getDocumentElement();
 
		// 通过根节点获得子节点
		NodeList personList = root.getElementsByTagName("Square");
		// System.out.println(personList);
 
		Node node = null;
		for (int i = 0; i < personList.getLength(); i++) { 
			      node = personList.item(i);
			      Element element = (Element) node;
			      System.out.println(element.getAttribute("date"));
			      String a = "02092019115106";
			          if (element.getAttribute("date").equals(a)){
			        	  System.out.println(node.getTextContent());
			        	  System.out.println(element.getElementsByTagName("EHM1").item(0).getTextContent());
			          }             
			      }
	}
//		// 这里获取第1个节点
//		Node item = personList.item(0);
//		System.out.println(item.getTextContent());// 获取第一个节点的所有子节点值
		
		
		// 这里转换成子类类型 ==》原因：父类没有对应的方法 这里只看类型不看值
//		System.out.println(element.getAttribute("date"));	
 
}
