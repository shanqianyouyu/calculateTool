package ctgu.Entity.Square;

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
	

	public Double HM1;
	public Double HM2;
	public Double WM1;
	public Double HD;
	public Double PL;
	public Double RL;
	
	public Double DL;
	public Double GXJ;
	public Double DGXJ;
	public Double SDZ;
	public Double A;
	public Double GL;
	public Double WL;
	public Double YX;
	public Double YXX;
	public Double SDc;

	public Double WG;
	public Double AL;
	public Double AJ;
	public Double ZG;
	
	public Double N1;
	public Double AX;
	public Double ALA;
	public Double AF;
	
	public Double aWD;
	public Double SAn;
	public Double FY;

	public Double Mj;
	public Double MDk;
	public Double PXj;
	
	public Double WN;
	public Double AFZ;
	public Double AFQ;
	public Double AKK;
	public Double WG2;
	public Double HV;
	
	public Double ADb;
	public Double ADn;
	public Double BSg;
	public Double AZz;
	public Double ABt;

	public Double BL;
	public Double DBc;
	public Double DBx;
	public Double BBc;
	public Double BBc1;
	public Double BBx;
	
	public Double AS;
	public Double QG;
	public Double FZ1;
	public Double FQ1;
	public Double FQ2;
	public Double FL1;
	public Double DL1;
	public Double FZ2;
	public Double FC1;
	public Double FZ3;
	public Double FM1;
	public Double FAM1;
	public Double FAY;
	public Double FAZ;
	
	
	public String getEntityName() {
		return "抱杆计算";
	}
}
