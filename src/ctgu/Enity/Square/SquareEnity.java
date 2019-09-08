package ctgu.Enity.Square;

import java.lang.reflect.Field;

import org.junit.Test;

import lombok.Data;

/**
 * 
 * @author 陈煜昆
 *
 */
@Data
public class SquareEnity {
/*	所有参数
 * 输入参数
     *塔型参数 
	 *	HM1		酒杯型塔窗口高度
	 *  HM2		横担断面最大高度
	 *  WM1		耐张塔头断面边宽
	 *  HD		吊点绳的高度
	 *  PL		起吊滑车组预留长度
	 *  RL	         单边预留长度
	
	 *  压杆参数
	 *  DL		等截面压杆的长度
	 *  GXJ		压杆截面的惯性矩
	 *  DGXJ	单肢主材对截面的惯性矩
	 *  SDZ		单肢主材截面面积
	 *  PLQ		起吊滑轮组预留长度
	 *  GL		单肢主材的重心距离
	 *  WL		抱杆断面边宽
	 *  YX		压杆长度系数
	 *  YXX		压杆长度修正系数
	 *  SDc		单斜材截面面积
	 	
	 	
	 * 	起吊参数：
	 * 	WG	被吊构件的质量
	 * 	AL	攀根绳与地面的夹角
	 * 	AJ  起吊中心线和铅垂线之间的夹角
	 * 	ZG	构件的增重系数
	 
	  
	 *起吊参数2
	 * 	N1	起吊滑车组的受力绳数
	 * 	AX	抱杆倾斜角
	 * 	ALA	拉线对地夹角
	 * 	AF	起吊滑车组的效率


	 * 中心压力参数
	 * 	aWD		受压杆件的稳定系数
	 * 	SAn	 	抱杆主材截面面积
	 * 	FY		抱杆主材的容许应力
	 
	 
	 
	 * 	压弯杆件参数
	 * 	MJ		抱杆中部断面的惯性矩
	 * 	MDK		中部断面的抗弯断面系数
	 * 	PXJ		压杆承受压力的偏心距
	 
	 
	 * 	起吊参数3
	 * 	WN		钢丝绳的工作绳数
	 * 	AFZ		合力线与抱杆轴间夹角(辅助拉线)
	 * 	AFQ		起吊滑车组轴线与铅垂线之间的夹角
	 *  AKK		控制绳对地夹角
	 *  WG2		被吊构件的重力
	 *  HV		滑车的效率
	 
	   
	 * 	起吊参数4
	 * 	ADB		单条承托绳与抱杆轴间夹角
	 * 	ADN		单条承托绳与相邻承托绳合力线间夹角
	 * 	BSG		抱杆及锁具的重力
	 *  AZZ		主要受力拉线的合力与抱杆轴线之间的夹角
	 *  ABT		两抱杆 合力线与抱杆轴线之间的夹角	 
	 
*输出结果

	/*
	 * 抱杆长度和长细比
	 * BL		抱杆长度(多种)
	 * DBC		等截面抱杆的长细比
	 * DBX		等截面抱杆的惯性矩
	 * BBC		变截面抱杆的长细比
	 * BBX		变截面抱杆的惯性矩
	 * 

	 * 张力和压力
	 * QG		起吊重力
	 * FZ1 		攀根绳的静张力
	 * FQ1		起吊滑轮组和牵引绳的静张力
	 * FQ2		牵引绳的静张力
	 * FD1		吊点绳的静张力
	 * FL1		抱杆拉线的静张力
	 * DL1		吊装辅助拉线静张力
	 * FZ2		抱杆的轴心压力
	 * FC1		承托绳的静张力
	 * FZ3   	引致地面时抱杆轴向压力（多种）
	 * FM1		中心压力的计算
	 * FAM1		按压弯件的中心压力的计算
	 * FAY		按铅垂线引下时增加的拉线张力
	 * FAZ   	综合静拉力
	 */
	

	public double HM1;
	public double HM2;
	public double WM1;
	public double HD;
	public double PL;
	public double RL;
	
	public double DL;
	public double GXJ;
	public double DGXJ;
	public double SDZ;
	public double A;
	public double GL;
	public double WL;
	public double YX;
	public double YXX;
	public double SDc;

	public double WG;
	public double AL;
	public double AJ;
	public double ZG;
	
	public double N1;
	public double AX;
	public double ALA;
	public double AF;
	
	public double aWD;
	public double SAn;
	public double FY;

	public double Mj;
	public double MDk;
	public double PXj;
	
	public double WN;
	public double AFZ;
	public double AFQ;
	public double AKK;
	public double WG2;
	public double HV;
	
	public double ADb;
	public double ADn;
	public double BSg;
	public double AZz;
	public double ABt;

	public double BL;
	public double DBc;
	public double DBx;
	public double BBc;
	public double BBx;
	
	public double QG;
	public double FZ1;
	public double FZd;
	public double FQ1;
	public double FQ2;
	public double FD1;
	public double FL1;
	public double DL1;
	public double FZ2;
	public double FC1;
	public double FZ3;
	public double FM1;
	public double FAM1;
	public double FAY;
	public double FAZ;
	
	@Test
	public void test() {
		SquareEnity enity = new SquareEnity();
		Field[] fields = enity.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
			
		}
		
	}
	
	public String getEntityName() {
		return "抱杆计算";
	}
}
